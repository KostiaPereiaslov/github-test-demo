import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Synergy.LoginPage;
import pages.SynergyPageFactory;
import pages.utility.LogFactory;
import pages.utility.PropertyLoader;
import pages.webdriver.WebDriverFactory;

import java.util.concurrent.TimeUnit;

import static pages.utility.TestResultListener.LOG;

public class TestBaseSynergy {

    private static final Logger LOG = LogFactory.getLogger(TestBaseSynergy.class);
    protected WebDriver webDriver;
    protected LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        String browserName = System.getProperty("browser");
        webDriver = WebDriverFactory.getInstance(browserName);
        webDriver.manage().timeouts().implicitlyWait((long)Integer.valueOf(PropertyLoader.loadProperty("implicit.timeout")), TimeUnit.SECONDS);
        LOG.info("Navigating to test url");

        this.webDriver.get(PropertyLoader.loadProperty("http://synergy3dmed1.azurewebsites.net/login"));

     //   this.loginPage = (LoginPage) SynergyPageFactory.initElements(this.webDriver, LoginPage.class);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (webDriver != null) {
            WebDriverFactory.killDriverInstance();
        }
    }
}
