package com.academy.rozetka;

import com.academy.framework.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelectProductHover extends BaseTest {
    private String prodCatLocator = "body > * > * > * > * > * > * > * > * > fat-menu > * > * > *:nth-child(2) > a";
    private String prodSubCatLocator = "body > * > * > * > * > * > * > * > * > * > * > * > *.menu-categories__item_state_hovered > * > * > * > *:nth-child(2) > *:nth-child(1) > * > * > *:nth-child(7) > a";
    private String prodCatLink = "https://rozetka.com.ua/ua/telefony-tv-i-ehlektronika/c4627949";
    private String prodSubCatLink = "https://rozetka.com.ua/ua/zaryadnye-ustroystva-dlya-foto-i-videokamer/c83878";

    @Test
    public void SelectSubCategoryProductSuccess() {
        driver.get( "http://rozetka.com.ua" );

        WebElement prodCat = driver.findElement( By.cssSelector( prodCatLocator ) );
        WebElement prodSubCat = driver.findElement( By.cssSelector( prodSubCatLocator ) );

        // WebElement prodCat = driver.findElement( By.linkText( prodCatLink ) );
        // WebElement prodSubCat = driver.findElement( By.linkText( prodSubCatLink ) );

        getActions( new Actions( driver ), prodCat, prodSubCat ).click().perform();
    }


    public Actions getActions(Actions actions, WebElement rootWE, WebElement childWE) {
        //Actions actions = new Actions( driver );
        return actions.moveToElement( rootWE ).moveToElement( childWE );
    }


}
