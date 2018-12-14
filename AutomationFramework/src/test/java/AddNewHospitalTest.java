
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Synergy.AddNewHospitalPage;
import pages.Synergy.HospitalsPage;
import pages.Synergy.LoginPage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static org.apache.commons.lang3.RandomUtils.nextInt;

public class AddNewHospitalTest {

    static LoginPage loginPage;

    AddNewHospitalPage addNewHospitalPage;
    HospitalsPage hospitalsPage;

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
    public void AddNewHospitalTest() {
        addNewHospitalPage = new AddNewHospitalPage()
                .open()
                .typeRandomHospitalName()
                .checkPublictRadioBtn()
                .clickFoundationFiled()
                .chooseDataFoundationField()
                .fillAdressField("Uzgorod")
                .fillWebSiteField("http://synergy3dmed1.azurewebsites.net")
                .fillPhoneField("3214342134")
                .pressSaveCangesBtn();
        hospitalsPage = new HospitalsPage()
                .open()
                .randomHospitalIsPresentInList();
    }
}
