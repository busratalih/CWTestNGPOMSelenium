package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {


    // Page class ı initialize etmek adına kullanılır
    public SauceDemoLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    //@FinBy annotasyonu elementleri locate ederken kullandıgımız ve initElements methodu ile elemmentlerin
     //bulunmasını saglayan bir anotasyondur


    @FindBy(id="user-name")
    public WebElement txtUsername;

    @FindBy(id="password")
    public WebElement txtPassword;

    @FindBy(xpath="//*[@id='login-button']")
    public WebElement btnLogin;




}
