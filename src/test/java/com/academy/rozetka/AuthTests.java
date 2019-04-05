package com.academy.rozetka;

import com.academy.framework.BaseTest;
import com.academy.framework.TestConfReader;
import com.academy.rozetka.page.AuthFormPage;
import com.academy.rozetka.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AuthTests extends BaseTest {
    // protected String baseUrl = "https://rozetka.com.ua/ua/";
    // private String linkEnterLocator = "body > app-root > div > div:nth-child(2) > div.app-rz-header > header > div > div.header-topline > div.header-topline__user.js-rz-auth > div.header-topline__user-wrapper > p > a";
    //   private String shortLogOnLocator = "body > * > * > * > * > * > * > * > * > * > p > a";
//    private String shortLogIntoLocator = "body > * > * > * > * > * > * > * > * > * > * > * > * > * > button";

    @Test
    public void testSuccessAuth() throws IOException {
        System.out.println( "***Rozetka test Auth started***" );

        Properties loginProperties = new Properties();
        loginProperties.load( new FileReader( System.getProperty( "rozetka.cfg" ) ) );

        TestConfReader testConfReader = new TestConfReader( loginProperties.getProperty( "rozetka.data" ), "auth_pass" );

        driver.get(testConfReader.getUrl(1));
        MainPage mainPage = new MainPage( driver );

        String oldMessage = mainPage.getEnterLinkText();
        System.out.println();

        AuthFormPage authFormPage = mainPage.clickEnterLink();

        System.out.println("testConfReader.getLogin(1): " + testConfReader.getLogin(1));
        System.out.println("testConfReader.getPassword(1): " + testConfReader.getPassword(1));
        authFormPage.enterLogin(testConfReader.getLogin(1));
        authFormPage.enterPasword(testConfReader.getPassword(1));

        mainPage = (MainPage) authFormPage.submit( true );
        //authFormPage.submit( true );

        mainPage = mainPage.waitUntilLinkTextChanged( oldMessage );
        String username = mainPage.getEnterLinkText();
        Assert.assertEquals( username, testConfReader.getExpectedErrMsg( 1 ) );

/*        driver.get( testConfReader.getUrl( 1 ) );
        WebElement enterLink = driver.findElement( By.cssSelector( shortLogOnLocator ) );
        String oldMessage = enterLink.getText();
        enterLink.click();*/
       /* WebElement loginField = driver.findElement( By.id( testConfReader.getLogin( 0 ) ) );
        loginField.click();
        loginField.clear();
        loginField.sendKeys( testConfReader.getLogin( 1 ) );
        WebElement passwordField = driver.findElement( By.id( testConfReader.getPassword( 0 ) ) );
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys( testConfReader.getPassword( 1 ) );*/
        // driver.findElement( By.cssSelector( shortLogIntoLocator ) ).click();
        //className( "button_color_navy auth-modal__login-button" ) );
        //  driver.findElement( By.cssSelector( "body > app-root > div > div:nth-child(2) > div.app-rz-common > auth-modal > modal-window > div > div > div > auth-content > div > form > div > button" ) ).click();
        // Подождать, пока не закроется всплывающее окно
/*        WebDriverWait webDriverWait = new WebDriverWait( driver, 5 );
        webDriverWait.until( ExpectedConditions.not( ExpectedConditions.textToBe( By.cssSelector( shortLogOnLocator ), oldMessage ) ) );
        String userName = driver.findElement( By.cssSelector( "body > app-root > div > div:nth-child(2) > div.app-rz-header > header > div > div.header-topline > div.header-topline__user.js-rz-auth > div.header-topline__user-wrapper > p > a" ) ).getText().trim();*/
        //  Assert.assertEquals( , testConfReader.getExpectedErrMsg( 1 ) );
    }
}