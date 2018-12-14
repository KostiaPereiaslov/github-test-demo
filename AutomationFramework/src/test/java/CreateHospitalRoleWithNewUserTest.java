
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.AddNewHospitalPage;
import pages.Synergy.LoginPage;
import pages.Synergy.RolesPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static org.apache.commons.lang3.RandomUtils.nextInt;

public class CreateHospitalRoleWithNewUserTest {

    static LoginPage loginPage;
    static RolesPage rolesPage;
    static AddNewHospitalPage addNewHospitalPage;

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
    public void CreateHospitalRoleWithNewUserTest() {
        rolesPage = new RolesPage()
                .open()
                .clickHospitalRadioBtn()
                .pressEditBtn()
                .pressCreateBtn()
                .fillRoleNameHospitalField()
                .pressCreateInPopUp()
                .clickSaveHospitalOrCompanyChangesBtn();
    }
}


