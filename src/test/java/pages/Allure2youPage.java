package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Allure2youPage {
    public Allure2youPage() { // constructor oluşuturup public yapmamız gerekir.

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement signInButton;

    @FindBy(xpath = "(//*[@class='woocommerce-Input woocommerce-Input--text input-text'])[1]")
    public WebElement signInEmailBox;

    @FindBy(xpath = "(//*[@class='woocommerce-Input woocommerce-Input--text input-text'])[2]")
    public WebElement signInPasswordBox;

    @FindBy (xpath = "//*[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement signInSignInButton;

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement becomeAVendorButton;

    @FindBy(xpath = "//*[@id='user_email']")
    public WebElement bavEmailBox; //become a vendor'a tıkladıktan sonra gelen e-mail adres kutusu

    @FindBy(xpath = "//*[@id='passoword']")
    public WebElement bavPasswordBox; // become a vonder'a tıkladıktan sonra gelen password kutusu

    @FindBy(xpath = "//*[@id='confirm_pwd']")
    public WebElement bavConfirmPasswordBox; //become a vonder'a tıkladıktan sonra gelen confirm password kutusu

}
