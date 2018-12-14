package pages.Synergy;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class AddNewProgectPage {

    private By selectPlan1Btn = By.xpath("//*[@id='page-wrapper-container']/div[1]/div[2]//div[1]/div[2]/button");

    public AddNewProgectPage clickSelectPlanBtn() {
        $(selectPlan1Btn).click();
        sleep(300);
        return this;
    }

}
