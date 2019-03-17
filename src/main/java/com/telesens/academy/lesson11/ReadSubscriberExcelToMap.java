package com.telesens.academy.lesson11;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ReadSubscriberExcelToMap {
    private Map<Long, SubscriberExt> subscriberExtHashMap;
    private ArrayList aListMaleFirstName;

    public ReadSubscriberExcelToMap(ReadPropFile readPropFile) {
        Map<Long, SubscriberExt> subscriberExtHashMap = new HashMap<>();
        File file = new File( readPropFile.getPath_xlsx() );
        try {
            XSSFWorkbook workbook = new XSSFWorkbook( new FileInputStream( file ) );
            XSSFSheet sheet = workbook.getSheet( workbook.getSheetName( 0 ) );
            for (int r = 1; r < sheet.getLastRowNum() + 1; r++) {
                SubscriberExt subscriberExcel = new SubscriberExt();
                XSSFRow row = sheet.getRow( r );

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
                double id = row.getCell( 0 ).getNumericCellValue();
                Long longId = new Double( id ).longValue();
                subscriberExcel.setId( longId );

                subscriberExcel.setFirstName( row.getCell( 1 ).getStringCellValue() );
                subscriberExcel.setLastName( row.getCell( 2 ).getStringCellValue() );

                String stringGender = (row.getCell( 3 ).getStringCellValue());
                //Gender excelGender =  Gender.valueOf(String.valueOf(stringlGender));
                subscriberExcel.setGender( Gender.valueOf( String.valueOf( stringGender ) ) );

                int age = (int) row.getCell( 4 ).getNumericCellValue();
                subscriberExcel.setAge( age );

                subscriberExcel.setPhoneNumber( row.getCell( 6 ).getStringCellValue() );

                double operId = row.getCell( 5 ).getNumericCellValue();
                String operName = row.getCell( 7 ).getStringCellValue();

                Operator operExcel = new Operator( new Double( operId ).longValue(), operName );
                subscriberExcel.setOperator( operExcel );

                subscriberExcel.setOperatorPrefix( row.getCell( 8 ).getStringCellValue() );

                subscriberExtHashMap.put( longId, subscriberExcel );
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.subscriberExtHashMap = subscriberExtHashMap;
        //System.out.println("map designed");
    }

    public void saveTo(String string) {

        try {
            FileWriter txtFile = new FileWriter( string );
            PrintWriter pw = new PrintWriter( txtFile );
            for (Map.Entry<Long, SubscriberExt> entry : subscriberExtHashMap.entrySet())
                pw.print( entry.getValue() );
            pw.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        //System.out.println("map saved to file");
    }

}

