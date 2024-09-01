package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerlink()
    {
        return BaseDriver.driver.findElement(By.className("ico-register"));
    }
}
