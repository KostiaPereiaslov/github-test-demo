package pages.Synergy;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ProgectsPage {

    public ProgectsPage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net/projects");
        return this;
    }

    private By createNewProgectBtn = By.xpath("//*[contains(text(),'Create new project')]");

    private By incomingTab = By.xpath("//*[@id='page-wrapper-container']/div[1]//div[2]//div[2]/div[1]//div[2]//table/tbody");

    public ProgectsPage clickCreateNewProjectBtn() {
        $(createNewProgectBtn).click();
        sleep(300);
        return this;
    }

    public ProgectsPage clickIncomingTab() {
        $(createNewProgectBtn).click();
        sleep(300);
        return this;
    }

    public ProgectsPage incomingTableIncludeRandomProgect() {
        $(incomingTab).shouldHave(text("Id" + (CreateNewProjectPage.patientId)));
        sleep(300);
        return this;
    }
}
