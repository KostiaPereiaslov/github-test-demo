
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.LoginPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;

public class LoginTest {
    LoginPage loginPage;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
     //   System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        baseUrl = "http://synergy3dmed1.azurewebsites.net/login";
        browser = "chrome";
    }

    @Test
    public void LoginTest() {
        loginPage = new LoginPage();
        loginPage.open()
                 .typeEmail("admin@mail.com")
                 .typePassword("Qwerty!234")
                 .clickLoginButton();
    }
}