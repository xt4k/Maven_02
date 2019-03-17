package com.telesens.academy.lesson11;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelSubscriberDataTable {
    private int maxNumRows;
    private XSSFWorkbook workbook;


    public int getRows() {
        return this.maxNumRows;
    }

    public ExcelSubscriberDataTable(int maxNumberRow, ArrayList<SubscriberExt> list) {
        this.maxNumRows= maxNumberRow;

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Subscribers_List");

        for (int r = 0; r < maxNumberRow + 1; r++) {
            XSSFRow row = sheet.createRow(r);
            Cell cellId = row.createCell(0);
            Cell cellFirstName = row.createCell(1);
            Cell cellLastName = row.createCell(2);
            Cell cellGender = row.createCell(3);
            Cell cellAge = row.createCell(4);
            Cell cellOperatorId = row.createCell(5);
            Cell cellPhoneNumber = row.createCell(6);
            Cell cellMobileOperator = row.createCell(7);
            Cell cellPrefix = row.createCell(8);

            if (r == 0) {
                cellId.setCellValue("Subscriber_Id");
                cellFirstName.setCellValue("FirstName");
                cellLastName.setCellValue("LastName");
                cellGender.setCellValue("Gender");
                cellAge.setCellValue("Age");
                cellOperatorId.setCellValue("OperatorId");
                cellPhoneNumber.setCellValue("PhoneNumber");
                cellMobileOperator.setCellValue("MobileOperator");
                cellPrefix.setCellValue("Prefix");
            } else {
                //System.out.println("r " + r);
                cellId.setCellValue( list.get( r - 1 ).getId() );
                cellFirstName.setCellValue( list.get( r - 1 ).getFirstName() );
                cellLastName.setCellValue( list.get( r - 1 ).getLastName() );
                cellGender.setCellValue( String.valueOf( list.get( r - 1 ).getGender() ) );
                cellAge.setCellValue( list.get( r - 1 ).getAge() );
                cellOperatorId.setCellValue( list.get( r - 1 ).getOperator().getId() );
                cellPhoneNumber.setCellValue( list.get( r - 1 ).getPhoneNumber() );
                cellMobileOperator.setCellValue( list.get( r - 1 ).getOperator().getName() );
                cellPrefix.setCellValue( list.get( r - 1 ).getOperatorPrefix() );
            }
        }
        this.workbook = workbook;
        //System.out.println("excel+");
    }

    public void saveTo(String string) {
        try (FileOutputStream excelFile = new FileOutputStream( new File( string ) )) {
            this.workbook.write( excelFile );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
