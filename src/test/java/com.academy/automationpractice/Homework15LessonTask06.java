package com.academy.automationpractice;

import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Homework15LessonTask06 {

    public static void main(String[] args) {
        WebDriver driver;

        String loginDetails = "C:\\Users\\xt4k\\IdeaProjects\\qa-ja-06_maven_02\\src\\main\\resources\\automationpractice.properties.properties";
        Initialize initialize = new Initialize( "chrome" );

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

/*        WebElement loginField = driver.findElement( By.cssSelector( "#header > div.nav > div > div > nav > div.header_user_info > a" ) );
        loginField.click();

        for (int i = 0; i < testConfReader.geListSize(); i++) {

            WebElement emailField = driver.findElement( By.id( "email" ) );
            emailField.click();
            emailField.clear();
            emailField.sendKeys( testConfReader.getLogin( i ) );

            WebElement passwordField = driver.findElement( By.id( "passwd" ) );
            passwordField.click();
            passwordField.clear();
            passwordField.sendKeys( testConfReader.getLogin( i ) );

            driver.findElement( By.id( "SubmitLogin" ) ).click();
            String actErrorField = driver.findElement( By.cssSelector( errMsgLocator ) ).getText();
            actualErrMsg.add( actErrorField );

            try {
                assertEquals( actualErrMsg.get( i ), testConfReader.getExpectedErrMsg( i ) );
            } catch (Error e) {
                verificationErrors.append( e.toString() );
            }
        }*/

        System.out.println( "Site: " + driver.getCurrentUrl() );


    }
}
