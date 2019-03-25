package com.academy.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;


public class AuthTests {
    private String loginDetails = "C:\\Users\\xt4k\\IdeaProjects\\qa-ja-06_maven_02\\src\\main\\resources\\automationpractice.properties.properties";
    private WebDriver driver;
    private String baseUrl;
    private String geckoDriver;
    private String chromeDriver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private String errMsgLocator = "#center_column > div.alert.alert-danger > ol > li";

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional("firefox") String browser) {
        Initialize initialize = new Initialize( "chrome" );
        driver = initialize.getDriver();
        driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );

        initialize = new Initialize( "firefox" );
        driver = initialize.getDriver();
        driver.manage().timeouts().implicitlyWait( 5, TimeUnit.SECONDS );

        System.out.println();

    }

    @Test
    public void testUntitledTestCase() {

        Properties loginProperties = new Properties();
        try {
            loginProperties.load( new FileReader( loginDetails ) );

        } catch (IOException e) {
            e.printStackTrace();
        }


        TestConfReader testConfReader = new TestConfReader(
                loginProperties.getProperty( "automation.auth.data.exc" ), "login_credentials", 7 );

        ArrayList<String> actualErrMsg = new ArrayList<>();

        driver.get( testConfReader.getUrl( 0 ) );

        WebElement loginField = driver.findElement( By.cssSelector( "#header > div.nav > div > div > nav > div.header_user_info > a" ) );
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
        }

        System.out.println( "Webpage error messages" + actualErrMsg );


    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals( verificationErrorString )) {
            fail( verificationErrorString );
        }
    }
}