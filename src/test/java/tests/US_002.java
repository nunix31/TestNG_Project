package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Allure2youPage;
import utilities.Driver;

public class US_002 {

    @Test
    public void vendorSignIn() {

        Allure2youPage page = new Allure2youPage();
        Driver.getDriver().get("https://allure2you.com/");
        page.signInButton.click();
        page.signInEmailBox.sendKeys("karakosenurullah@gmail.com");
        page.signInPasswordBox.sendKeys("Nunix.123");
        page.signInSignInButton.click();




    }
}
