package pages.Synergy;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class UpperSidebar {

    private By threeDotsBtn = By.xpath("//i[contains (@class, 'fa fa-ellipsis-v')]");

    private By settingsBtn = By.xpath("//*[@id='wrapper']/nav[1]/ul/li[5]/a/i");

    private By logOutBtn = By.xpath("//*[@id='wrapper']/nav[1]/ul/li[5]/ul/li[3]/a");

    public UpperSidebar clickThreeDotsBtn() {
        $(threeDotsBtn).click();
        sleep(1000);
        return this;
    }

    public UpperSidebar clickSettingsBtn() {
        $(settingsBtn).click();
        return this;
    }

    public UpperSidebar clickLogOutBtn() {
        $(logOutBtn).click();
        sleep(300);
        return this;
    }
}

