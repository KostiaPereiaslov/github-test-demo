
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.*;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;

public class CreateWorkFlowBySMTest {

    static CompanyOrHospitalUserCreatePage companyOrHospitalUserCreatePage;
    static LoginPage loginPage;
    static UsersPage usersPage;
    static UpperSidebar upperSidebar;
    static AdminMainPage adminMainPage;
    static RolesPage rolesPage;
    static AddNewCompanyPage addNewCompanyPage;
    static WorkFlowsPage workFlowsPage;
    static CreateWorkFlowPage createWorkFlowPage;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        baseUrl = "http://synergy3dmed1.azurewebsites.net/login";
        browser = "chrome";
        loginPage = new LoginPage()
                .open()
                .typeEmail("valik1537866769912@gmail.com")
                .typePassword("Qwerty123!")
                .clickLoginButton();
    }

    @Test
    public void createWorkFlowBySMTest() {
    workFlowsPage = new WorkFlowsPage()
            .open()
            .pressCreateNewWorkFlowBtn();
    createWorkFlowPage = new CreateWorkFlowPage()
            .fillRandomWorkFlowNameField()
            .clickCompanyDropDownField()
            .fillCompanyNameDropDown()
            .clickPlusBtn()
            .clickRequiredResorseDropDownField()
            .fillRequiredResorses()
            .clickSaveChangesBtn();
    workFlowsPage = new WorkFlowsPage()
            .verifyThatWorkflowCreated();
    }
}
