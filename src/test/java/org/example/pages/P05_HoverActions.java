package org.example.pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.Random;

public class P05_HoverActions {

    WebDriver driver = Hooks.driver;
    P05_HoverLocators locators = new P05_HoverLocators();
    Actions actions;

    public P05_HoverActions(WebDriver driver) {
        this.actions = new Actions(driver);
    }

    // Method to hover over a random main category
    public void hoverOverRandomMainCategory() {
        List<WebElement> categories = driver.findElements(locators.mainCategories);
        WebElement selectedCategory = categories.get(new Random().nextInt(categories.size()));
        actions.moveToElement(selectedCategory).perform();
        selectedCategory.getText();
    }

    // Method to select a random sub-category
    public String selectRandomSubCategory() {
        List<WebElement> subCategories = driver.findElements(locators.subCategories);
        WebElement selectedSubCategory = subCategories.get(new Random().nextInt(subCategories.size()));
        String subCategoryText = selectedSubCategory.getText().toLowerCase().trim();
        selectedSubCategory.click();
        return subCategoryText;
    }

    // Method to get the page title
    public String getPageTitle() {
        return driver.findElement(locators.pageTitle).getText().toLowerCase().trim();
    }
}

