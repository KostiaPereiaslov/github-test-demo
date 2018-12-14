package pages.Synergy;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import pages.IPageLoaded;
import pages.Page;
import pages.utility.LogFactory;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    //private static final Logger LOG = LogFactory.getLogger(LoginPage.class);

    private By emailField = By.id("email");
    private By passwordField = By.id("Password");
    private By loginButton = By.xpath("//*[@id='react-app']//div[2]//form//div[3]/button");
    private By registerButton = By.xpath("//*[@id='react-app']//div[2]//form//div[3]/a/button");
//    private rememberMeCheckbox;
    private By forgotPasswordLink = By.xpath("//*[@id='react-app']//div[2]//form//div[2]/div[2]/a");
    private By welcomeMessage = By.xpath("//*[contains(text(),'Welcome to Synergy 3D Med')]");

    public LoginPage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net/login");
        sleep(1000);
        return this;
    }

    // Fill in the email field with data
    public LoginPage typeEmail(String email) {
        $(emailField).sendKeys(email);
        sleep(1000);
        return this;
    }

    // Fill in the password field with data
    public LoginPage typePassword(String password) {
        $(passwordField).sendKeys(password);
        sleep(1000);
        return this;
    }

    // Click login button
    public LoginPage clickLoginButton() {
        $(loginButton).click();
        sleep(1000);
        return this;
    }

    // Click register button
    public LoginPage clickRegisterButton() {
        $(registerButton).click();
        return this;
    }

    // Click Forgot Password Link
    public LoginPage clickForgotPasswordLink() {
        $(forgotPasswordLink).click();
        return this;
    }

    public LoginPage textIsPresent(String message) {
        $(welcomeMessage).val(message).is(Condition.visible);
        return this;
         }
}
