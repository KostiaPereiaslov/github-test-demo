
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.CompanyOrHospitalUserCreatePage;
import pages.Synergy.LoginPage;
import pages.Synergy.UsersPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;
import static org.apache.commons.lang3.RandomUtils.nextInt;

public class CreateCompanyUserAsSoftwareManagerTest {

    static CompanyOrHospitalUserCreatePage companyOrHospitalUserCreatePage;
    static LoginPage loginPage;
    static UsersPage usersPage;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        baseUrl = "http://synergy3dmed1.azurewebsites.net/login";
        browser = "chrome";
        loginPage = new LoginPage()
                .open()
                .typeEmail("valik1537866769912@gmail.com")
                .typePassword("Qwerty123!")
                .clickLoginButton();
    }

    @Test
    public void CreateCompanyUserAsSoftwareManagerTest() {
        companyOrHospitalUserCreatePage = new CompanyOrHospitalUserCreatePage()
                .open()
                .fillUserNameField()
                .clickCompanyDropDown()
                .chooseValueInCompanyDropDovn()
                .fillAddressField("Hogwarts Castle, Orlando, FL, USA")
                .clickSystemRoleDropDown()
                .fillSystemRoleDropDownCreateCompanyUserAsSM()
                .fillEmailField("email" + nextInt() + "@dot.com")
                .fillPhoneNumberField("3214342134")
                .fillPaswordField("Qwerty123!")
                .fillPasswordConfirm("Qwerty123!")
                .fillFillBioField("qwerqwer")
                .clickSaveChangesBtn();
    }
}