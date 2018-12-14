package pages.Synergy;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class WorkFlowsPage {

    public WorkFlowsPage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net/workflows");
        sleep(300);
        return this;
    }

    private By createNewWorkflowBtn = By.xpath("//*[contains(text(),'Create new workflow')]");

    private By workFlowsList = By.xpath("//*[@id='page-wrapper-container']/div[1]//div[2]//div[2]//table/tbody/tr/td[1]//div[1]/div");

    public WorkFlowsPage pressCreateNewWorkFlowBtn() {
     $(createNewWorkflowBtn).click();
        return this;
    }

    public WorkFlowsPage verifyThatWorkflowCreated() {
            $(workFlowsList).shouldHave(text(String.valueOf(CreateWorkFlowPage.workFlowName) + "Workflow"));
            sleep(300);
            return this;
    }
}
