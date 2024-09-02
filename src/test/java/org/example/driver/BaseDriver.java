package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {
    private static WebDriver driver;

    // Static block for initialization
    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Explicit wait to ensure driver is initialized and the page is loaded
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d != null && d.getCurrentUrl() != null;
            }
        });

        driver.get("https://demo.nopcommerce.com/register");
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Please ensure the browser is opened before accessing the driver.");
        }
        return driver;
    }
}
