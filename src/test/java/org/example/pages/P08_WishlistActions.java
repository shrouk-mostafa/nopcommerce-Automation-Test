package org.example.pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P08_WishlistActions {
    WebDriver driver = Hooks.driver;
    P08_WishlistLocators wishlistLocators = new P08_WishlistLocators();
    WebDriverWait wait;

    public P08_WishlistActions(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickWishlistHTC() {
        driver.findElement(wishlistLocators.wishlistButtonHTC).click();
    }

    public WebElement getSuccessMessage() {
        return driver.findElement(wishlistLocators.successMessage);
    }

    public String getSuccessMessageText() {
        return getSuccessMessage().getText();
    }

    public String getSuccessMessageBackgroundColor() {
        return getSuccessMessage().getCssValue("background-color");
    }

    public void waitForSuccessMessageToDisappear() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(wishlistLocators.successMessage));
    }

    public void clickWishlistTab() {
        driver.findElement(wishlistLocators.wishlistTab).click();
    }

    public int getWishlistQuantity() {
        String qtyValue = driver.findElement(wishlistLocators.wishlistQty).getAttribute("value");
        return Integer.parseInt(qtyValue);
    }
}
