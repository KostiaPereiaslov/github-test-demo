import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.*;
import pages.webdriver.WebDriverFactory;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static org.apache.commons.lang3.RandomUtils.nextInt;

public class SmokeTest {

    static LoginPage loginPage;
    AddNewCompanyPage addNewCompanyPage;
    CompanyOrHospitalUserCreatePage companyOrHospitalUserCreatePage;
    UpperSidebar upperSidebar;
    RolesPage rolesPage;
    AddNewHospitalPage addNewHospitalPage;
    WorkFlowsPage workFlowsPage;
    CreateWorkFlowPage createWorkFlowPage;
    ProgectsPage progectsPage;
    AddNewProgectPage addNewProgectPage;
    CreateNewProjectPage createNewProjectPage;

    @BeforeClass
    public static void setUp() {
       // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        baseUrl = "http://synergy3dmed1.azurewebsites.net/login";
        browser = "chrome";
        loginPage = new LoginPage()
                .open()
                .typeEmail("admin@mail.com")
                .typePassword("Qwerty!234")
                .clickLoginButton();
    }

    @Test(priority = 1)
    public void AddNewCompanyTest() {
        addNewCompanyPage = new AddNewCompanyPage()
                .open()
                .typeRandomCompanyName()
                .typeAdress("Basel, Switzerland")
                .selectAddressFromList()
                .typeWebSite("http://synergy3dmed1.azurewebsites.net/")
                .typeEmail("email" + nextInt() + "@mail.com")
                .typePhone("1234567890")
                .typeNumberEmployers("3")
                .clickChooseFileBtn("C:\\Users\\Pictures\\download.jpg")
                .clickSaveChangesBtn();
    }

    @Test(priority = 2)
    public void CreateCompanyUserTest() {
        companyOrHospitalUserCreatePage = new CompanyOrHospitalUserCreatePage()
                .open();
        addNewCompanyPage = new AddNewCompanyPage()
                .open();
        companyOrHospitalUserCreatePage = new CompanyOrHospitalUserCreatePage()
                .open()
                .fillUserNameField()
                .clickCompanyDropDown()
                .setCompanyRandomValue()
                .fillAddressField("Columbus, OH, USA")
                .selectAddressFromList()
                .clickSystemRoleDropDown()
                .fillSystemRoleCreateUserTest()
                .fillEmailField(CompanyOrHospitalUserCreatePage.userName + "@gmail.com")
                .fillPhoneNumberField("3214342134")
                .fillPaswordField("Qwerty123!")
                .fillPasswordConfirm("Qwerty123!")
                .fillFillBioField("Bio")
                .clickSaveChangesBtn();
    }

    @Test(priority = 3)
    public void LogOutTest() {
        upperSidebar = new UpperSidebar()
                .clickThreeDotsBtn()
                .clickLogOutBtn();
    }

    @Test(priority = 4)
    public void LoginWithNewCreateCompanyUserTest () {
        loginPage = new LoginPage()
                .typeEmail(CompanyOrHospitalUserCreatePage.userName + "@gmail.com")
                .typePassword("Qwerty123!")
                .clickLoginButton();
    }

    @Test(priority = 5)
    public void CreateRoleWithNewUser() {
        rolesPage = new RolesPage()
                .open()
                .pressEditBtn()
                .pressCreateBtn()
                .fillRoleNameCompanyField()
                .pressCreateInPopUp()
                .clickSaveHospitalOrCompanyChangesBtn();
    }

    @Test(priority = 6)
    public void CreateCompanyUserAsSoftwareManagerTest() {
        companyOrHospitalUserCreatePage = new CompanyOrHospitalUserCreatePage()
                .open()
                .fillUserNameField()
                .clickCompanyDropDown()
                .selectRandomCompanyNameDropDown()
                .fillAddressField("Columbus, OH, USA")
                .selectAddressFromList()
                .clickSystemRoleDropDown()
                .fillSystemRoleRandomDropDown()
                .fillEmailField("email" + nextInt() + "@dot.com")
                .fillPhoneNumberField("3214342134")
                .fillPaswordField("Qwerty123!")
                .fillPasswordConfirm("Qwerty123!")
                .fillFillBioField("Bio")
                .clickSaveChangesBtn();
    }

    @Test(priority = 7)
    public void AddNewHospitalTest() {
        addNewHospitalPage = new AddNewHospitalPage()
                .open()
                .typeRandomHospitalName()
                .checkPublictRadioBtn()
                .clickFoundationFiled()
                .chooseDataFoundationField()
                .fillAdressField("Columbus, OH, USA")
                .selectAddressFromList()
                .fillWebSiteField("http://synergy3dmed1.azurewebsites.net")
                .fillPhoneField("3214342134")
                .pressSaveCangesBtn();
    }

    @Test(priority = 8)
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

    @Test(priority = 9)
    public void CreateHospitalUserTest() {
        companyOrHospitalUserCreatePage = new CompanyOrHospitalUserCreatePage()
                .open()
                .fillUserNameField()
                .checkClientRadioBtn()////////////////////////
                .clickHospitalDropDown()
                .chooseHospitalFromList()
                .fillAddressField("Columbus, OH, USA")
                .selectAddressFromList()
                .clickSystemRoleDropDown()
                .selectRandomDoctorDropDown()
                .fillEmailField("valik" + CompanyOrHospitalUserCreatePage.userName + "@gmail.com")
                .fillPhoneNumberField("3214342134")
                .fillPaswordField("Qwerty123!")
                .fillPasswordConfirm("Qwerty123!")
                .fillFillBioField("Bio")
                .clickSaveChangesBtn();
    }

    @Test(priority = 10)
    public void createWorkFlowBySMTest() {
        workFlowsPage = new WorkFlowsPage()
                .open()
                .pressCreateNewWorkFlowBtn();
        createWorkFlowPage = new CreateWorkFlowPage()
                .fillRandomWorkFlowNameField()
                .clickCompanyDropDownField()
                .fillRandomCompanyNameDropDown()
                .clickPlusBtn()
                .clickRequiredResorseDropDownField()
                .fillRequiredResorses()
                .clickSaveChangesBtn();
    }

    @Test(priority = 11)
    public void CreateProgectAsSMTest() {
        progectsPage = new ProgectsPage()
                .open()
                .clickCreateNewProjectBtn();
        addNewProgectPage = new AddNewProgectPage()
                .clickSelectPlanBtn();
        createNewProjectPage = new CreateNewProjectPage()
                .fillRandomPatientId()
                .fillPatientinitials("Auto Koss Test")
                .clickBodyPasitionBtn()
                .chooseBrainPosition()
                .clickHospitalDropDovn()
                .chooseRandomHospitalFromList()
                .clickDoctorDropDovn()
                .setRandomDoctor()
                .clickDeliveryDay()
                .clikCalendarToday()
                .clikNextBtn()
                .clikNextBtn()
                .clikNextBtn()
                .clikMeetingDateAndTimeField()
                .clickNowCalendarBtn()
                .clikMeetingDateAndTimeField2()
                .clickNowCalendarBtn()
                .clickConfirmBtn()
                .clickConfirmInPopUp()
                .clickOkayBtn();
        progectsPage = new ProgectsPage()
                .incomingTableIncludeRandomProgect();
    }
}





