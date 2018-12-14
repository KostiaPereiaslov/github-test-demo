
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.AddNewProgectPage;
import pages.Synergy.CreateNewProjectPage;
import pages.Synergy.LoginPage;
import pages.Synergy.ProgectsPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;

public class CreateProgectAsSMTest {

    static LoginPage loginPage;
    static ProgectsPage progectsPage;
    static AddNewProgectPage addNewProgectPage;
    static CreateNewProjectPage createNewProjectPage;

    @BeforeClass
    public static void setUp () {
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
                .setHospital()
                .clickDoctorDropDovn()
                .setDoctor()
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