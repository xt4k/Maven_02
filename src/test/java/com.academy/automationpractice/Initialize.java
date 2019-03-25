package com.academy.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Initialize {
    private String commonProperties = "C:\\Users\\xt4k\\IdeaProjects\\qa-ja-06_maven_02\\src\\main\\resources\\common.properties.properties";
    private WebDriver driver;

    public Initialize(String browser) {
        // this.properties = properties;
        Properties properties = new Properties();
        try {
            properties.load( new FileReader( commonProperties ) );

        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (browser) {
            case "chrome": {
                // System.setProperty( "webdriver.chrome.driver", "c:/tools/chromedriver.exe" );
                System.setProperty( "webdriver.chrome.driver", properties.getProperty( "chrome.driver" ) );
                driver = new ChromeDriver();
                driver.get( "https://www.ukr.net/" );
            }
            case "firefox": {
                // System.setProperty( "webdriver.gecko.driver",  "c:/tools/selenium/geckodriver.exe" );
                System.setProperty( "webdriver.gecko.driver", properties.getProperty( "gecko.driver" ) );
                driver = new FirefoxDriver();
                driver.get( "https://www.ukr.net/" );
            }

            default: {
                System.setProperty( "webdriver.gecko.driver", "c:/tools/selenium/geckodriver.exe" );
                // System.setProperty( "webdriver.gecko.driver", properties.getProperty( "gecko.driver" ) );
                driver = new FirefoxDriver();
                driver.get( "https://www.ukr.net/" );

            }
        }
        // driver = new FirefoxDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
