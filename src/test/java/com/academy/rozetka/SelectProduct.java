package com.academy.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectProduct extends AuthTests {

    WebElement prodCat = driver.findElement( By.cssSelector( "body > * > * > * > * > * > * > *> * > fat-menu > div > ul > li:nth-child(3) > a" ) );

    Actions actions = new Actions( driver );
    WebElement we = driver.findElement( By.linkText( "menulink" ) );
actions.moveToElement(we)

    WebElement subMenu = driver.findElement( By.cssSelector( "subLinklocator" ) );
actions.moveToElement(subMenu)
actions.click().

    build().

    perform();


}
