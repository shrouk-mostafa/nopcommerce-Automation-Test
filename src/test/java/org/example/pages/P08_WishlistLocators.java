package org.example.pages;

import org.openqa.selenium.By;

public class P08_WishlistLocators {
    public By wishlistButtonHTC = By.cssSelector("div[data-productid='18'] button.add-to-wishlist-button");
    public By successMessage = By.cssSelector("div.bar-notification.success");
    public By wishlistTab = By.cssSelector("a[href='/wishlist']");
    public By wishlistQty = By.cssSelector("input.qty-input");
}

