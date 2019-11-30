package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

   By signInBtn = By.xpath("//span[contains(text(),'Hello')]");
    public HomePage(WebDriver driver) {
     super(driver);
    }

    public HomePage launchAmazonUrl(){
        driver.get("https://www.amazon.com.au");
        return this;
    }

    public SignInPage clickSignIn() throws InterruptedException {
     clickOnButton(signInBtn);
    // Thread.sleep(3000);
     return new SignInPage(driver);
    }
}
