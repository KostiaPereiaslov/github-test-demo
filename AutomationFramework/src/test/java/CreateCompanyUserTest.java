
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.CompanyOrHospitalUserCreatePage;
import pages.Synergy.LoginPage;
import pages.Synergy.UpperSidebar;
import pages.Synergy.UsersPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.apache.commons.lang3.RandomUtils.nextInt;

public class CreateCompanyUserTest {

    static CompanyOrHospitalUserCreatePage companyOrHospitalUserCreatePage;
    static LoginPage loginPage;
    static UsersPage usersPage;
    static UpperSidebar upperSidebar;

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
        sleep(1000);
    }

    @Test
    public void CreateCompanyUserTest(){
                companyOrHospitalUserCreatePage = new CompanyOrHospitalUserCreatePage()
                        .open()
                        .fillUserNameField()
                        .clickCompanyDropDown()
                        .setCompanyValue()
                        .fillAddressField("maritskih 25")
                        .clickSystemRoleDropDown()
                        .fillSystemRoleCreateUserTest()
                        .fillEmailField(CompanyOrHospitalUserCreatePage.userName + "@gmail.com")
                        .fillPhoneNumberField("3214342134")
                        .fillPaswordField("Qwerty123!")
                        .fillPasswordConfirm("Qwerty123!")
                        .fillFillBioField("qwerqwer")
                        .clickSaveChangesBtn();
                usersPage = new UsersPage()
                        .clickDropDownBtn()
                        .setWalueInDropDown()
                        .userIsPresentCompanyTable();
                }
}

