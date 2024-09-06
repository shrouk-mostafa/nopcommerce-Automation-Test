package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public static void OpenBrowser() {
        // 1- Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // 2- Create an object of ChromeDriver
        driver = new ChromeDriver();

        // 3- Configure browser settings
        driver.manage().window().maximize();

        // Updated Implicit Wait (using Duration)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 4- Navigate to URL
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public static void quitDriver() throws InterruptedException {
        // Wait for a few seconds before quitting (just for observation)
        Thread.sleep(3000);

        // 5- Quit the browser and clean up resources
        driver.quit();
    }
}
