package com.academy.rozetka;

import com.academy.framework.BaseTest;
import com.academy.framework.TestConfReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static java.lang.Thread.sleep;

public class RozetkaHomeTask5Filter extends BaseTest {


    @Test
    public void testSuccessProductLink() throws IOException {
        System.out.println("***Rozetka filter 5_rozetka_sort started ***");

        Properties loginProperties = new Properties();
        loginProperties.load(new FileReader(System.getProperty("rozetka.cfg")));

        TestConfReader testConfReader = new TestConfReader(loginProperties.getProperty("rozetka.data"), "auth_pass");

        driver.get(testConfReader.getUrl(1));

        Actions actions = new Actions(driver);
        String selectorProduct = "body > app-root > div > div:nth-child(2) > div.app-rz-header > header > div > div.header-bottomline > div.menu-outer.js-rz-fat-menu > fat-menu > div > ul > li.menu-categories__item.menu-categories__item_state_hovered > a";
        WebElement prodCat = driver.findElement(By.cssSelector(selectorProduct));
        actions.moveToElement(prodCat).perform();


        // new WebDriverWait()

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String selectorSubProduct = "body > app-root > div > div:nth-child(2) > div.app-rz-header > header > div > div.header-bottomline > div.menu-outer.js-rz-fat-menu > fat-menu > div > ul > li:nth-child(9) > div > div.menu__main-cats > div.menu__main-cats-inner > div:nth-child(1) > ul:nth-child(1) > li > ul > li:nth-child(4) > a";
        WebElement prodSubCat = driver.findElement(By.cssSelector(selectorSubProduct));
        System.out.println("prodCat: " + prodCat + prodCat.getText());
        System.out.println("prodSubCat: " + prodSubCat + prodSubCat.getText());

        prodSubCat.click();

        // actions.moveToElement(prodSubCat).perform();


        // prodSubCat.click();

        // WebElement prodCat = driver.findElement( By.linkText( prodCatLink ) );
        // WebElement prodSubCat = driver.findElement( By.linkText( prodSubCatLink ) );
        // ProductPage productPage = mainPage.clickProductLink();
        // getActions(new Actions(driver), prodCat, prodSubCat).click().perform();

    }

/*

    public Actions getActions(Actions actions, WebElement rootWE, WebElement childWE) {
        //Actions actions = new Actions( driver );
        return actions.moveToElement(rootWE).moveToElement(childWE);


    }*/
}