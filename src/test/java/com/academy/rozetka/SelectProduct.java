package com.academy.rozetka;

import com.academy.framework.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectProduct extends BaseTest {

    private String prodCatLocator = "body > * > * > * > * > * > * > * > * > fat-menu > * > * > *:nth-child(2) > a";
    private String prodSubCatLocator = "content-inner-block > * > * > * > * > * > * > * > * > * > * > * > * > * > *:nth-child(2) > *:nth-child(3) > * > * > *:nth-child(6) > a";

    private String prodCatLink = "https://rozetka.com.ua/ua/telefony-tv-i-ehlektronika/c4627949";
    private String prodSubCatLink = "https://rozetka.com.ua/ua/zaryadnye-ustroystva-dlya-foto-i-videokamer/c83878";

    @Test
    public void SelectProductByClickSuccess() {
        driver.get( "http://rozetka.com.ua" );

        WebElement prodCat = driver.findElement( By.cssSelector( prodCatLocator ) );
        prodCat.click();

        WebElement prodSubCat = driver.findElement( By.cssSelector( prodSubCatLocator ) );
        prodSubCat.click();

    }

}
