import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.*;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.sleep;

public class CreateCompanyResorsesWithSMTest {

    static CompanyOrHospitalUserCreatePage companyOrHospitalUserCreatePage;
    static LoginPage loginPage;
    static UsersPage usersPage;
    static UpperSidebar upperSidebar;
    static AdminMainPage adminMainPage;
    static RolesPage rolesPage;
    static AddNewCompanyPage addNewCompanyPage;
    static CompanysPage companysPage;
    static AddNewHospitalPage addNewHospitalPage;
    static HospitalsPage hospitalsPage;
    static CompanyDetailPage companyDetailPage;
    static ResorcePage resorcePage;
    static ResorcesBilderPage resorcesBilderPage;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        baseUrl = "http://synergy3dmed1.azurewebsites.net";
        browser = "chrome";
        loginPage = new LoginPage()
                 .open()
                 .typeEmail("valik1537866769912@gmail.com")
                 .typePassword("Qwerty123!")
                 .clickLoginButton();
    }

    @Test
    public void enterCredentials() {
        companysPage = new CompanysPage()
                .open()
                .clickCompanyBtn();
        companyDetailPage = new CompanyDetailPage()
                .clickResourcesTab()
                .clickCreateNewResorsesBtn();
        resorcePage = new ResorcePage()
                .typeRandomresorseName()
                .checkNoRadiobutton()
                .clickResorseTypeDropDown()
                .checkFormType();
              //  .checkAllCheckboxes(); //MANDATORY_STEP_SKIPPED_CASE_SCROOL_IS_IMPOSSBLE_NOW
              //  Selenide.atBottom();
                resorcePage.clickEditInBulderBtn();
        resorcesBilderPage = new ResorcesBilderPage()
                .clickTextImputBtn()
                .clickTextImputSettingsBtn()
                .fillLabelField("NAME1")
                .clickApplyBtn()
                ////
                .clickTextImputBtn()
                .clickTextImputSettingsBtn()
                .fillLabelField("NAME2")
                .clickApplyBtn()
                ////
                .clickTextImputBtn()
                .clickTextImputSettingsBtn()
                .fillLabelField("NAME3")
                .clickApplyBtn()
                .clickSaveChangesBtn();
        resorcePage = new ResorcePage()
                .randomResorseIsPresent();
        sleep(4000);
    }

}
