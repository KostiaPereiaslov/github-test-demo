
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.*;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;

public class LoginWithNewCreateCompanyUserTest {

    static CompanyOrHospitalUserCreatePage companyOrHospitalUserCreatePage;
    static LoginPage loginPage;
    static UsersPage usersPage;
    static UpperSidebar upperSidebar;
    static AdminMainPage adminMainPage;
    static AddNewCompanyPage addNewCompanyPage;

    @BeforeClass
    public static void setUp() {
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
    public void LoginWithNewCreateCompanyUserTest() {
        companyOrHospitalUserCreatePage = new CompanyOrHospitalUserCreatePage()
                .open()
                .fillUserNameField()
                .clickCompanyDropDown()
                .chooseValueInCompanyDropDovnLogWithNewSM()
                .fillAddressField("daritskih")
                .clickSystemRoleDropDown()
                .fillSystemRoleCreateUserTest()
                .fillEmailField("valik"+ CompanyOrHospitalUserCreatePage.userName+"@gmail.com")
                .fillPhoneNumberField("3214342134")
                .fillPaswordField("Qwerty123!")
                .fillPasswordConfirm("Qwerty123!")
                .fillFillBioField("qwerqwer")
                .clickSaveChangesBtn();
        upperSidebar = new UpperSidebar()
                .clickThreeDotsBtn()
                .clickLogOutBtn();
        loginPage = new LoginPage()
                .typeEmail("valik" + CompanyOrHospitalUserCreatePage.userName + "@gmail.com")
                .typePassword("Qwerty123!")
                .clickLoginButton();
        adminMainPage = new AdminMainPage()
                .verifyRandomUsernameIsPresent();
    }
}
