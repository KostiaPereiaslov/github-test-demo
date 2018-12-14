package pages.Synergy;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CompanyDetailPage {

    private By resorsesTab = By.xpath("//div[contains(text(), 'Resources')]");

    private By generalTab = By.xpath("//div[contains(text(), 'General')]");

    private By usersTab = By.xpath("//div[contains(text(), 'Users')]");

    private By departamentsTab = By.xpath("//div[contains(text(), 'Departments')]");

    private By progectsTab = By.xpath("//div[contains(text(), 'Projects')]");

    private By createNewResorsesBtn = By.xpath("//button[contains(text(), 'Create new Resource')]");

    public CompanyDetailPage clickResourcesTab() {
        $(resorsesTab).click();
        sleep(300);
        return this;
    }

    public CompanyDetailPage clickCreateNewResorsesBtn() {
        $(createNewResorsesBtn).click();
        sleep(300);
        return this;
    }
}
