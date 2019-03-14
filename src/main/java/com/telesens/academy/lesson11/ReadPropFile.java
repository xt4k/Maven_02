package com.telesens.academy.lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

    private String path_xlsx;
    private String path_txt;
    private String path_sort_txt;
    private String path_zip;
    private String pathM_FirstNames;
    private String pathM_LastNames;
    private String pathF_FirstNames;
    private String pathF_LastNames;
    private int ageFrom;
    private int ageTo;
    private boolean ageGaussian;

    public String getPath_xlsx() {
        return path_xlsx;
    }

    public String getPath_txt() {
        return path_txt;
    }

    public String getPath_sort_txt() {
        return path_sort_txt;
    }

    public String getPath_zip() {
        return path_zip;
    }

    public String getPathM_FirstNames() {
        return pathM_FirstNames;
    }

    public String getPathM_LastNames() {
        return pathM_LastNames;
    }

    public String getPathF_FirstNames() {
        return pathF_FirstNames;
    }

    public String getPathF_LastNames() {
        return pathF_LastNames;
    }

    public int getAgeFrom() {
        return ageFrom;
    }

    public int getAgeTo() {
        return ageTo;
    }

    public boolean isAgeGaussian() {
        return ageGaussian;
    }

    public ReadPropFile(String s) throws FileNotFoundException, IOException {

        Properties properties = new Properties();
        File file = new File(s);

        try (FileInputStream fis = new FileInputStream( file )) {
            properties.load(fis);
            path_xlsx = properties.getProperty( "subscriber.exc" );
            path_txt = properties.getProperty( "subscriber.txt" );
            path_sort_txt = properties.getProperty( "subscriber.sort.txt");
            path_zip = properties.getProperty( "subscriber.arc");
            pathM_FirstNames = properties.getProperty("male.firstnames");
            pathM_LastNames = properties.getProperty("male.lastnames");
            pathF_FirstNames = properties.getProperty("female.firstnames");
            pathF_LastNames = properties.getProperty("female.lastnames");
            ageFrom = Integer.parseInt( properties.getProperty("age.from"));
            ageTo = Integer.parseInt( properties.getProperty("age.to"));
            ageGaussian = Boolean.parseBoolean( properties.getProperty("age.gaussian") );
        }
        catch (IOException e) {
            e.printStackTrace();
        }



    }
}
