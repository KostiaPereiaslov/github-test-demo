
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.AddNewCompanyPage;
import pages.Synergy.CompanysPage;
import pages.Synergy.LoginPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static org.apache.commons.lang3.RandomUtils.nextInt;

public class AddNewCompanyTest {
    static LoginPage loginPage;
    AddNewCompanyPage addNewCompanyPage;
    CompanysPage companysPage;

    @BeforeClass
    public static void setUp () {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        baseUrl = "http://synergy3dmed1.azurewebsites.net/login";
        browser = "chrome";
        loginPage = new LoginPage()
                .open()
                .typeEmail("admin@mail.com")
                .typePassword("Qwerty!234")
                .clickLoginButton();
    }

    @Test
    public void AddNewCompanyTest() {
        addNewCompanyPage = new AddNewCompanyPage();
        addNewCompanyPage.open()
                .typeRandomCompanyName()
                .typeAdress("Lviv")
                .typeWebSite("http://synergy3dmed1.azurewebsites.net/")
                .typeEmail("email@"+nextInt()+"mail.com")
                .typePhone("1234567890")
                .typeNumberEmployers("3")
                .clickChooseFileBtn("C:\\Users\\Pictures\\download.jpg")
                .clickSaveChangesBtn();
        companysPage = new CompanysPage()
                .fiilSearchPageField()
                .companyTableUserIsPresent();
    }
}