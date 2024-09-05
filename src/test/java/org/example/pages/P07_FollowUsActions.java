package org.example.pages;


import org.openqa.selenium.WebDriver;
import org.example.driver.BaseDriver;

public class P07_FollowUsActions {
    WebDriver driver = BaseDriver.getDriver();
    P07_FollowUsLocators followUsLocators = new P07_FollowUsLocators(); // Initialize locators

    // Methods to click the links
    public void clickFacebook() {
        driver.findElement(followUsLocators.facebookLink).click();
    }

    public void clickTwitter() {
        driver.findElement(followUsLocators.twitterLink).click();
    }

    public void clickRss() {
        driver.findElement(followUsLocators.rssLink).click();
    }

    public void clickYoutube() {
        driver.findElement(followUsLocators.youtubeLink).click();
    }
}

