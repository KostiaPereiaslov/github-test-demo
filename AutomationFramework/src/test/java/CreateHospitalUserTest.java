
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.*;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static org.apache.commons.lang3.RandomUtils.nextInt;

public class CreateHospitalUserTest {

    static CompanyOrHospitalUserCreatePage companyOrHospitalUserCreatePage;
    static LoginPage loginPage;
    static UsersPage usersPage;
    static UpperSidebar upperSidebar;
    static AdminMainPage adminMainPage;
    static RolesPage rolesPage;
    static AddNewCompanyPage addNewCompanyPage;
    static CompanysPage companyPage;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        baseUrl = "http://synergy3dmed1.azurewebsites.net/login";
        browser = "chrome";
        loginPage = new LoginPage();
        loginPage.open()
                 .typeEmail("valik1537866769912@gmail.com")
                 .typePassword("Qwerty123!")
                 .clickLoginButton();
    }

    @Test
    public void CreateHospitalUserTest() {
        companyOrHospitalUserCreatePage = new CompanyOrHospitalUserCreatePage()
                .open()
                .fillUserNameField()
                .checkClientRadioBtn()
                .clickHospitalDropDown()
                .chooseHospitalFromList()
                .fillAddressField("zaritskih")
                .clickSystemRoleDropDown()
                .fillSystemRoleDropDown()
                .fillEmailField("valik"+ CompanyOrHospitalUserCreatePage.userName+"@gmail.com")
                .fillPhoneNumberField("3214342134")
                .fillPaswordField("Qwerty123!")
                .fillPasswordConfirm("Qwerty123!")
                .fillFillBioField("qwerqwer")
                .clickSaveChangesBtn();
    }
}