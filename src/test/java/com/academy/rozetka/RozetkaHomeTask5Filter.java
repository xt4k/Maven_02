package com.academy.rozetka;

import com.academy.framework.BaseTest;
import com.academy.framework.TestConfReader;
import com.academy.rozetka.page.MainPage;
import com.academy.rozetka.page.ProductPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class RozetkaHomeTask5Filter extends BaseTest {


    @Test
    public void testSuccessProductLink() throws IOException {
        System.out.println("***Rozetka 5_rozetka_sort started ***");

        Properties loginProperties = new Properties();
        loginProperties.load(new FileReader(System.getProperty("rozetka.cfg")));

        TestConfReader testConfReader = new TestConfReader(loginProperties.getProperty("rozetka.data"), "auth_pass");

        driver.get(testConfReader.getUrl(1));


        MainPage mainPage = new MainPage(driver);

        ProductPage productPage = mainPage.clickProductLink();

/*
        WebElement prodCat = driver.findElement(By.cssSelector("body > * > * > *:nth-child(2) > * > * > * > * > * > * > * > ul > *:nth-child(9) > a"));
        WebElement prodSubCat = driver.findElement(By.cssSelector("body > app-root > div > div:nth-child(2) > div.app-rz-header > header > div > div.header-bottomline > div.menu-outer.js-rz-fat-menu > fat-menu > div > ul > li.menu-categories__item.menu-categories__item_state_hovered > div > div.menu__main-cats > div.menu__main-cats-inner > div:nth-child(1) > ul:nth-child(1) > li > ul > li:nth-child(4) > a"));

        // WebElement prodCat = driver.findElement( By.linkText( prodCatLink ) );
        // WebElement prodSubCat = driver.findElement( By.linkText( prodSubCatLink ) );

        getActions(new Actions(driver), prodCat, prodSubCat).click().perform();*/
    }


    public Actions getActions(Actions actions, WebElement rootWE, WebElement childWE) {
        //Actions actions = new Actions( driver );
        return actions.moveToElement(rootWE).moveToElement(childWE);

    }
}