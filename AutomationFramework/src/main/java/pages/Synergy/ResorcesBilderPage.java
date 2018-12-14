package pages.Synergy;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class ResorcesBilderPage {

    private By labelBtn = xpath("//*[contains(text(),'Label')]");

    private By textInputBtn = xpath("//*[@id='page-wrapper-container']/div[1]/div[2]//div[2]/div[3]//button[2]");

    private By textAreaBtn = xpath("//*[contains(text(),'Text Area')]");

    private By checkBoxBtn = xpath("//*[contains(text(),'Check Box')]");

    private By uploadZoneBtn = xpath("//*[contains(text(),'Upload Zone')]");

    private By uploadBtn = xpath("//*[contains(text(),'Upload')]");

    private By editInBuilderBtn = xpath("//*[contains(text(),'Select Control')]");

    private By dadioControlBtn = xpath("//*[contains(text(),'Radio Control')]");

    private By dateControlBtn = xpath("//*[contains(text(),'Date Control')]");

    private By uploadSTLBtn = xpath("//*[contains(text(),'Upload STL')]");

    private By tableBtn = xpath("//*[contains(text(),'Table')]");

    private By dicomBtn = xpath("//*[contains(text(),'Dicom')]");

    private By dploadImageBtn = xpath("//*[contains(text(),'Upload Image')]");

    private By applyBtn = xpath("//*[contains(text(),'Apply')]");

    private By saveChangesBtn = xpath("//*[contains(text(),'Save Changes')]");

    private By settingsAtTextImputBtn = cssSelector(".form-items-settings-wraper > .ant-btn");

    private By labelField = By.id("label");

    public ResorcesBilderPage clickTextImputBtn() {
        $(textInputBtn).click();
        sleep(300);
        return this;
    }

    public ResorcesBilderPage clickTextImputSettingsBtn() {
        $(settingsAtTextImputBtn).click();
        sleep(300);
        return this;
    }

    public ResorcesBilderPage fillLabelField(String name) {
        $(labelField).val(name);
        sleep(300);
        return this;
    }

    public ResorcesBilderPage clickApplyBtn() {
        $(applyBtn).click();
        sleep(300);
        return this;
    }

    public ResorcesBilderPage clickSaveChangesBtn() {
        $(saveChangesBtn).click();
        sleep(500);
        return this;
    }

}
