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
    public ExcelSubscriberDataTable(String s, int maxNumberRow, ArrayList<SubscriberExt> list) {
        //  File excelFile = new File(s);//"F:/KypcbI/QA_JA/lesson11/data/subsList.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Subscribers_List");

        for (int r = 0; r < maxNumberRow; r++) {
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
                cellId.setCellValue(list.get(r).getId());
                cellFirstName.setCellValue(list.get(r).getFirstName());
                cellLastName.setCellValue(list.get(r).getLastName());
                cellGender.setCellValue(String.valueOf(list.get(r).getGender()));
                cellAge.setCellValue(list.get(r).getAge());
                cellOperatorId.setCellValue(list.get(r).getOperator().getId());
                cellPhoneNumber.setCellValue(list.get(r).getPhoneNumber());
                cellMobileOperator.setCellValue(list.get(r).getOperator().getName());
                cellPrefix.setCellValue(list.get(r).getOperatorPrefix());
            }
        }
        System.out.println("excel+");

        try (FileOutputStream out = new FileOutputStream(new File(s))) {
            workbook.write(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
