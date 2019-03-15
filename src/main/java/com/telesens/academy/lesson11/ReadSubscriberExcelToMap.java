package com.telesens.academy.lesson11;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class ReadSubscriberExcelToMap {
    private HashMap<Long, SubscriberExt> subscriberExtHashMap;
    private ArrayList aListMaleFirstName;

    public ReadSubscriberExcelToMap(ReadPropFile readPropFile) {
        subscriberExtHashMap = new HashMap<>();
        SubscriberExt subscriberExcel = new SubscriberExt();

        File file = new File(readPropFile.getPath_xlsx());
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
            XSSFSheet sheet = workbook.getSheet(workbook.getSheetName(0));
            for (int r = 1; r < sheet.getLastRowNum()+1; r++) {
                XSSFRow row = sheet.getRow(r);

/*                if (r == 0) {
                    cellId.setCellValue("Subscriber_Id");
                    cellFirstName.setCellValue("FirstName");
                    cellLastName.setCellValue("LastName");
                    cellGender.setCellValue("Gender");
                    cellAge.setCellValue("Age");
                    cellOperatorId.setCellValue("OperatorId");
                    cellPhoneNumber.setCellValue("PhoneNumber");
                    cellMobileOperator.setCellValue("MobileOperator");
                    cellPrefix.setCellValue("Prefix");
                } else {*/
                double id = row.getCell(0).getNumericCellValue();
                Long longId = new Double(id).longValue();
                subscriberExcel.setId(longId);

                subscriberExcel.setFirstName(row.getCell(1).getStringCellValue());
                subscriberExcel.setLastName(row.getCell(2).getStringCellValue());

                String stringlGender = (row.getCell(3).getStringCellValue());
                //Gender excelGender =  Gender.valueOf(String.valueOf(stringlGender));
                subscriberExcel.setGender(Gender.valueOf(String.valueOf(stringlGender)));

                int age = (int) row.getCell(4).getNumericCellValue();
                subscriberExcel.setAge(age);

                subscriberExcel.setPhoneNumber(row.getCell(6).getStringCellValue());

                double operId = row.getCell(5).getNumericCellValue();
                String operName = row.getCell(7).getStringCellValue();

                Operator operExcel = new Operator(new Double(operId).longValue(), operName);
                subscriberExcel.setOperator(operExcel);

                subscriberExcel.setOperatorPrefix(row.getCell(8).getStringCellValue());

                subscriberExtHashMap.put(longId, subscriberExcel);
            }

            FileWriter txtFile = new FileWriter(readPropFile.getPath_txt());
            PrintWriter pw = new PrintWriter(txtFile);
            pw.print(subscriberExtHashMap);
            pw.println("|");
            pw.close();
        } catch (FileNotFoundException e) { e.printStackTrace();} catch (IOException e) {    e.printStackTrace();   }
        System.out.println("map+");
    }
}
