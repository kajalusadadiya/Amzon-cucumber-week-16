package com.amzon.pages;

import com.amzon.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddToCart extends Utility {
    public AddToCart() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Added to Cart')]")
    WebElement addToCartConfirmationMessage;

    public void verifyTheAddToCartMessage(String message) throws InterruptedException {
        //pmWaitUntilVisibilityOfElementLocated(By.linkText("Added to Cart"), 30);
        String actualMessage = pmGetTextFromElement(addToCartConfirmationMessage);
        Thread.sleep(5000);
        pmVerifyElements(actualMessage,message , "Incorrect Message");
        Reporter.log("Verifying the Added To Cart Message :" + message);


    }
}

