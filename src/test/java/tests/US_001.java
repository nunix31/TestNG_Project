package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Allure2youPage;
import utilities.Driver;

public class US_001 {

    @Test
    public void vendorRegistiration() {
        Faker faker = new Faker();
        Allure2youPage page = new Allure2youPage();
        Driver.getDriver().get("https://allure2you.com/");
        page.registerButton.click();
        page.becomeAVendorButton.click();
        page.bavEmailBox.sendKeys("karakosenurullah@gmail.com");
        page.bavPasswordBox.sendKeys("Nunix.123");
        page.bavConfirmPasswordBox.sendKeys("Nunix.123", Keys.ENTER);
    }
}
