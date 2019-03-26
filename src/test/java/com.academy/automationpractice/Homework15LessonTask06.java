package com.academy.automationpractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Homework15LessonTask06 {
    WebDriver driver;

    @Test
    public static void main(String[] args) {
        WebDriver driver;

        String loginDetails = "C:\\Users\\xt4k\\IdeaProjects\\qa-ja-06_maven_02\\src\\main\\resources\\automationpractice.properties.properties";
        //Initialize initialize = new Initialize( "chrome" );

        Initialize initialize = new Initialize( "" );

        driver = initialize.getDriver();
        driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );

        Properties loginProperties = new Properties();
        try {
            loginProperties.load( new FileReader( loginDetails ) );

        } catch (IOException e) {
            e.printStackTrace();
        }


        Login login = new Login( loginProperties.getProperty( "automation.auth.data.exc" ), "login", 1 );

        driver.get( login.getUrl() );
        System.out.println( "Site: " + driver.getCurrentUrl() );


    }

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional("firefox") String browser) {
        Initialize initialize = new Initialize( browser );
        driver = initialize.getDriver();
        driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );

        System.out.println();
    }
}
