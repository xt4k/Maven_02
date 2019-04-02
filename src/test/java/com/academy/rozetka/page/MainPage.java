package com.academy.rozetka.page;

import com.academy.framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    final private String enterLinkLocator = "body > * > * > * > * > * > * > * > * > * > p > a";
    private WebDriver driver;
    @FindBy(css = enterLinkLocator)
    private WebElement enterLink;

    public MainPage(WebDriver driver) {
        super( driver );
    }

    public String getEnterLinkText() {
        this.driver = driver;
        return enterLink.getText().trim();
    }

    public AuthFormPage clickEnterLink() {
        this.driver = driver;
        enterLink.click();
        return new AuthFormPage( driver );
    }

    public MainPage waitUntilLinkTextChanged(String oldMessage) {
        waitUntilLinkTextChanged( enterLinkLocator, oldMessage );
        // WebDriverWait webDriverWait = new WebDriverWait( driver, 5 );
        ///  webDriverWait.until( ExpectedConditions.not( ExpectedConditions.textToBe( By.cssSelector( enterLinkLocator ), oldMessage ) ) );
        return this;
    }
}
