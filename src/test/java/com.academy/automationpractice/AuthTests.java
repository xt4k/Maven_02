package com.academy.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;


public class AuthTests {
    private String commonProperties = "C:\\Users\\xt4k\\IdeaProjects\\qa-ja-06_maven_02\\src\\main\\resources\\common.properties.properties";
    private String loginDetails = "C:\\Users\\xt4k\\IdeaProjects\\qa-ja-06_maven_02\\src\\main\\resources\\automationpractice.properties.properties";
    private WebDriver driver;
    private String baseUrl;
    private String geckoDriver;
    private String chromeDriver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        initDrivers();

        baseUrl = "http://automationpractice.com/index.php";
        driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS );
    }

    private void initDrivers() {
        Properties properties = new Properties();

        try {
            properties.load( new FileReader( commonProperties ) );

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.setProperty( "webdriver.chrome.driver", properties.getProperty( "chrome.driver" ) );
        System.setProperty( "webdriver.gecko.driver", properties.getProperty( "gecko.driver" ) );
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
    }

    @Test
    public void testUntitledTestCase() {

        Properties loginProperties = new Properties();
        try {
            loginProperties.load( new FileReader( loginDetails ) );

        } catch (IOException e) {
            e.printStackTrace();
        }


        TestConfReader testConfReader = new TestConfReader( loginProperties.getProperty( "automation.auth.data.exc" ), "login_credentials", 7 );

        for (int i = 0; i < testConfReader.geListSize(); i++) {
            driver.get( testConfReader.getUrl( i ) );
            driver.findElement( By.linkText( "Sign in" ) ).click();
            driver.findElement( By.id( "email" ) ).click();
            driver.findElement( By.id( "email" ) ).clear();
            driver.findElement( By.id( "email" ) ).sendKeys( testConfReader.getLogin( i ) );
            driver.findElement( By.id( "passwd" ) ).click();
            driver.findElement( By.id( "passwd" ) ).clear();
            driver.findElement( By.id( "passwd" ) ).sendKeys( testConfReader.getPassword( i ) );
            String actualErrMsg = driver.findElement( By.cssSelector( "#center_column > div.alert.alert-danger > ol > li" ) ).getText();
            System.out.println( "Actual Err MSg: " + actualErrMsg + " Expected Err Msg " + testConfReader.getExpectedErrMsg( i ) );
            System.out.println();
            //         driver.findElement( By.xpath( "(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]" ) ).click();
            // driver.findElement( By.xpath( "(.//*[normalize-space(text()) and normalize-space(.)='Authentication'])[2]/following::div[1]" ) ).click();
        }
        try {
            //  assertEquals( driver.fndElement( By.xpath( "(.//*[normalize-space(text()) and normalize-space(.)='Authentication'])[2]/following::li[1]" ) ).getText(), "Authentication failed." );
            //     assertEquals( driver.findElement( By.cssSelector( "#center_column > div.alert.alert-danger > ol > li" ) ).getText(), "Authentication failed." )
        } catch (Error e) {
            verificationErrors.append( e.toString() );
        }
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