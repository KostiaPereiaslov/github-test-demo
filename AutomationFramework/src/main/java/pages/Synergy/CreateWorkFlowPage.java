package pages.Synergy;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.By.id;

public class CreateWorkFlowPage {

    static long workFlowName;

    private By workFlowNameField = id("name");

    private By companyDropDownField = id("companyId");

    //private By plusBtn = By.cssSelector(".anticon-plus");

    private By plusBtn = id("addResourceBtn");

    private By requiredResourcesFieldBtn = By.xpath("//*[@id='page-wrapper-container']/div[1]/div[2]//form//div[3]/div[2]//div[2]//div[1]/div[1]/div");

    private By saveChangesBtn = By.xpath("//*[contains(text(),'Save Changes')]");

    public CreateWorkFlowPage clickSaveChangesBtn() {
        $(saveChangesBtn).click();
        sleep(300);
        return this;
    }

    public CreateWorkFlowPage clickPlusBtn() {
        $(plusBtn).click();
        sleep(300);
        return this;
    }

    public CreateWorkFlowPage fillRandomWorkFlowNameField() {
        workFlowName = System.currentTimeMillis();
        $(workFlowNameField).setValue((String.valueOf(workFlowName)) + "Workflow");
        return this;
    }

    public CreateWorkFlowPage clickCompanyDropDownField() {
        $(companyDropDownField).click();
        sleep(600);
        return this;
    }

    public CreateWorkFlowPage fillCompanyNameDropDown() {
        $("[data-value='Company1537866757422']").click();
        sleep(300);
        return this;
    }

    public CreateWorkFlowPage fillRandomCompanyNameDropDown() {
        $("[data-value='" + "Company" + ((AddNewCompanyPage.companyName) +"']")).click();
        sleep(300);
        return this;
    }

    public CreateWorkFlowPage clickRequiredResorseDropDownField() {
        $(requiredResourcesFieldBtn).click();
        sleep(300);
        return this;
    }

    public CreateWorkFlowPage fillRequiredResorses() {
        $("[data-value='109 Form']").click();
        sleep(300);
        return this;
    }

}