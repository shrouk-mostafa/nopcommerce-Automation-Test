package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {
    private static WebDriver driver;

    // Static block for initialization
    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            // Navigate to the initial URL (registration page)
            driver.get("https://demo.nopcommerce.com");

            // Initialize WebDriverWait with a short timeout
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

            // Handle Cloudflare challenge if present
            handleCloudflareChallenge(wait);

            // Optionally wait for a successful URL change after challenge
            wait.until(ExpectedConditions.urlContains("some_expected_url_after_successful_challenge"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void handleCloudflareChallenge(WebDriverWait wait) {
        try {
            // Wait until the Cloudflare iframe is available and switch to it
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[title='Widget containing a Cloudflare security challenge']")));

            // Find the checkbox element using CSS selector and click it directly
            WebElement cloudflareCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label.cb-lb")));
            cloudflareCheckbox.click();

        } catch (Exception e) {
            // Cloudflare challenge was not present or another issue occurred
            System.out.println("Cloudflare challenge not detected or an error occurred.");
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Please ensure the browser is opened before accessing the driver.");
        }
        return driver;
    }
}
