package com.academy.automationpractice;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Login {
    private String url;
    private String login;
    private String password;


    public Login(String confFilePathFileName, String sheetName, int rowNum) {
        File file = new File( confFilePathFileName );

        //  HSSFWorkbook workbook;
        XSSFWorkbook workbook;

        try {
            //workbook = new HSSFWorkbook( new FileInputStream( file ) );
            // HSSFSheet sheet = workbook.getSheet( sheetName );
            workbook = new XSSFWorkbook( new FileInputStream( file ) );
            XSSFSheet sheet = workbook.getSheet( sheetName );
            //  HSSFRow parRow = sheet.getRow( i );
            XSSFRow parRow = sheet.getRow( rowNum );
            this.url = parRow.getCell( 0 ).getStringCellValue();
            this.login = parRow.getCell( 1 ).getStringCellValue();
            this.password = parRow.getCell( 2 ).getStringCellValue();

        } catch (IOException e) {
            System.out.println( "Something wrong" );
            e.printStackTrace();
        }

        System.out.println( "login to site done" );

    }

    public String getUrl() {
        return url;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword(int i) {
        return password;
    }
}