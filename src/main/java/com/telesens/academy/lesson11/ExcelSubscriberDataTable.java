package com.telesens.academy.lesson11;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelSubscriberDataTable {
    public ExcelSubscriberDataTable(String s, int stringNumber, File file) {
        File excelFile = new File(s);//"F:/KypcbI/QA_JA/lesson11/data/subsList.xlsx");
        try
                (XSSFWorkbook workbook = new XSSFWorkbook( new FileInputStream( excelFile ) )) {
            XSSFSheet sheet = workbook.getSheet( "Subscriber_List" );
            for (int r=0;r<=6;r++ ){
                XSSFRow row = sheet.createRow(0);
                Cell cellNumber = row.createCell(0);
                Cell cellLastName = row.createCell(1);
                Cell cellFirstName = row.createCell(2);
                Cell cellGender = row.createCell(3);
                Cell cellAge = row.createCell(4);
                Cell cellPhoneNumber = row.createCell(5);
                Cell cellMobileOperator = row.createCell(6);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
