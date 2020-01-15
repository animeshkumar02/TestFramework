package DemoApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver lDriver;

    public LoginPage(WebDriver rDriver) {
        lDriver=rDriver;
        PageFactory.initElements(rDriver, this);
    }

    @FindBy(name = "uid")
    WebElement userName;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "btnLogin")
    WebElement loginButton;

    public void setUserName(String uName){
        userName.sendKeys(uName);
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void login() {
        loginButton.click();
    }
}
