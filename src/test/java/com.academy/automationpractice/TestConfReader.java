package com.academy.automationpractice;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestConfReader {
    private String sheetName;
    private List<String> url;
    private List<String> login;
    private List<String> password;
    private List<String> expectedErrMsg;
    private int row;

/*
    public TestConfReader(String confFilePath, String confFileName, String sheetName, int rowNum) {
        File file = new File( confFilePath + confFileName );
        XSSFWorkbook workbook;
        try {
            workbook = new XSSFWorkbook( new FileInputStream( file ) );
            XSSFSheet sheet = workbook.getSheet( sheetName );
            for (int i = 0; i < rowNum; i++) {
                XSSFRow parRow = sheet.getRow( row );
                this.url.add( parRow.getCell( 0 ).getStringCellValue() );
                this.login.add( parRow.getCell( 1 ).getStringCellValue() );
                this.password.add( parRow.getCell( 2 ).getStringCellValue() );
                this.expectedErrMsg.add( parRow.getCell( 3 ).getStringCellValue() );
            }
        } catch (IOException e) {
            System.out.println( "Something wrong" );
            e.printStackTrace();
        }
    }*/

    public TestConfReader(String confFilePathFileName, String sheetName, int rowNum) {
        List<String> url = new ArrayList<>();
        List<String> login = new ArrayList<>();
        List<String> password = new ArrayList<>();
        List<String> expectedErrMsg = new ArrayList<>();

        File file = new File( confFilePathFileName );

        //  HSSFWorkbook workbook;
        XSSFWorkbook workbook;

        try {
            //workbook = new HSSFWorkbook( new FileInputStream( file ) );
            // HSSFSheet sheet = workbook.getSheet( sheetName );
            workbook = new XSSFWorkbook( new FileInputStream( file ) );
            XSSFSheet sheet = workbook.getSheet( sheetName );
            for (int i = 1; i <= rowNum; i++) {
                //  HSSFRow parRow = sheet.getRow( i );
                XSSFRow parRow = sheet.getRow( row );
                url.add( parRow.getCell( 0 ).getStringCellValue() );
                login.add( parRow.getCell( 1 ).getStringCellValue() );
                password.add( parRow.getCell( 2 ).getStringCellValue() );
                expectedErrMsg.add( parRow.getCell( 3 ).getStringCellValue() );
            }
        } catch (IOException e) {
            System.out.println( "Something wrong" );
            e.printStackTrace();
        }
        this.url = url;
        this.login = login;
        this.password = password;
        this.expectedErrMsg = expectedErrMsg;
        System.out.println( "read from excel conf file" );

    }

    public String getUrl(int i) {
        return url.get( i );
    }

    public int geListSize() {
        return login.size();
    }

    public String getLogin(int i) {
        return login.get( i );
    }

    public String getPassword(int i) {
        return password.get( i );
    }

    public String getExpectedErrMsg(int i) {
        return expectedErrMsg.get( i );
    }
}
