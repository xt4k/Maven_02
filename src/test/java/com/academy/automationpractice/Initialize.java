package com.academy.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Initialize {
    //String commonProperties = System.getProperty( "common.cfg" );
    private WebDriver driver;

    public Initialize(String browser) {
        String commonProperties = System.getProperty( "common.cfg" );
        Properties properties = new Properties();
        try {
            properties.load( new FileReader( commonProperties ) );
            //System.out.println("commonProperties: "+ commonProperties);

        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (browser) {
            case "chrome": {
                //  System.setProperty( "webdriver.chrome.driver", "c:/tools/chromedriver.exe" );
                System.setProperty( "webdriver.chrome.driver", properties.getProperty( "chrome.driver" ) );
                driver = new ChromeDriver();
                // driver.get( "https://www.ukr.net/" );
            }
            case "firefox": {
                //  System.setProperty( "webdriver.gecko.driver",  "c:/tools/geckodriver.exe" );
                System.setProperty( "webdriver.gecko.driver", properties.getProperty( "gecko.driver" ) );
                driver = new FirefoxDriver();
                // driver.get( "https://www.ukr.net/" );
            }

            default: {
                // System.setProperty( "webdriver.gecko.driver", "c:/tools/geckodriver.exe" );
                System.setProperty( "webdriver.ie.driver", properties.getProperty( "ie64.driver" ) );
                driver = new InternetExplorerDriver();
                // driver.get( "https://www.ukr.net/" );
            }
        }
        // driver = new FirefoxDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
