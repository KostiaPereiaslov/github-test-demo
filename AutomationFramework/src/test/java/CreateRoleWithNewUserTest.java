
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.*;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static org.apache.commons.lang3.RandomUtils.nextInt;
public class CreateRoleWithNewUserTest {

    static CompanyOrHospitalUserCreatePage companyOrHospitalUserCreatePage;
    static LoginPage loginPage;
    static UsersPage usersPage;
    static UpperSidebar upperSidebar;
    static AdminMainPage adminMainPage;
    static RolesPage rolesPage;
    static AddNewCompanyPage addNewCompanyPage;
    static CompanysPage companysPage;

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
    public void CreateRoleWithNewUser() {
    rolesPage = new RolesPage()
            .open()
            .pressEditBtn()
            .pressCreateBtn()
            .fillRoleNameCompanyField()
            .pressCreateInPopUp()
            .clickSaveHospitalOrCompanyChangesBtn()
            .roleTextIsPresent("ProgectManager" + (RolesPage.roleName));
    }
}