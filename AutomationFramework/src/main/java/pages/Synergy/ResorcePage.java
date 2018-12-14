package pages.Synergy;

import javafx.scene.web.WebEngine;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ResorcePage {

    long resorceName;
    WebEngine js;

    private By resorseNameField =id("name");

    private By resourceTypeDropDownField = id("type");

    private By yesRadioBtn = cssSelector("input[value='1']");

    private By noRadioBtn = cssSelector("input[value='2']");

    private By optionalRadioBtn = cssSelector("input[value='3']");

    private By editInBuilderBtn = cssSelector(".builder-button");

    private By selectAllChrckbox = xpath("//*[@id='page-wrapper-container']/div[1]/div[2]//form/div[3]//div[2]/div[2]//table/tbody/tr/td[1]//label");

    private By page = id("page-wrapper");

    private By resorsesList = xpath("//*[@id='resourceCompany']//table");

    public ResorcePage typeRandomresorseName(){
        resorceName = System.currentTimeMillis();
        $(resorseNameField).setValue((String.valueOf(resorceName)) + "Resorce");
        sleep(100);
        return this;
    }

    public ResorcePage checkAllCheckboxes() {
        $(selectAllChrckbox).click();
        sleep(500);
        return this;
    }

    public ResorcePage checkNoRadiobutton() {
        $(noRadioBtn).parent().click();
        sleep(300);
        return this;
    }

    public ResorcePage clickResorseTypeDropDown() {
        $(resourceTypeDropDownField).click();
        sleep(300);
        return this;
    }

    public ResorcePage checkFormType () {
        $("[data-value='Form']").click();
        sleep(300);
        return this;
    }

    public ResorcePage clickEditInBulderBtn () {
        $(".builder-button").click();
        sleep(500);
        return this;
    }

    public ResorcePage scrollPage () {
        Actions action = new Actions((WebDriver) By.id("page-wrapper"));
        actions().keyUp((CharSequence) By.id("page-wrapper")).click().perform();
        sleep(300);
        return this;
    }

    public ResorcePage randomResorseIsPresent() {
        $(resorsesList).shouldHave(text(String.valueOf(resorceName)));
        sleep(300);
        return this;
    }

}
