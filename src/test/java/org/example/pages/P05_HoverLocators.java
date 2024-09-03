package org.example.pages;

import org.openqa.selenium.By;

public class P05_HoverLocators {
    // Locators for main categories
    public By mainCategories = By.cssSelector("ul.top-menu.notmobile > li");

    // Locator for sub-categories under a main category
    public By subCategories = By.cssSelector("ul.sublist.first-level > li");

    // Locator for the page title
    public By pageTitle = By.cssSelector("div[class='page-title'] h1");
}
