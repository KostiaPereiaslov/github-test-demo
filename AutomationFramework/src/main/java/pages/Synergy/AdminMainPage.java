package pages.Synergy;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AdminMainPage {

    public AdminMainPage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net");
        return this;
    }
    //private By welcomeMessage = By.xpath("//*[@id='page-wrapper']/div/div[1]/div/div/div/h1");
    private By userNameField = By.xpath("//*[@id='wrapper']/nav[1]/ul/li[4]/span[1]");

    public AdminMainPage verifyUserNameIsPresent() {
        $(userNameField).shouldHave(Condition.text("admin@mail.com"));
        return this;
    }

    public AdminMainPage verifyRandomUsernameIsPresent() {
        $(userNameField).shouldHave(Condition.text(String.valueOf("User" + CompanyOrHospitalUserCreatePage.userName)));
        return this;
    }
}
