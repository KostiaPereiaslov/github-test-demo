package pages.Synergy;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class RolesPage {

    public static long hospitalName;
    public static long roleName;

    public RolesPage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net/role");
        sleep(300);
        return this;
    }

    private By companyRadioBtn = cssSelector("input[value='0']");

    private By hospitalRadioBtn = cssSelector("input[value='1']");

    private By roleEditBtn = xpath("//*[@id='page-wrapper']//button");

    private By roleSavechangesBtn = xpath("//*[contains(text(),'Save Changes')]");

    private By roleCancelBthn = xpath("//*[contains(text(),'Cancel')]");

    private By dropDownWithComanyNameBtn = xpath("//*[@id='page-wrapper']//div[1]/div[2]//div[1]//div[2]");

    //for this butn use douple-clik (its block where we set names for maptree)
    private By rectangleBlockBtn = xpath("//*[contains(text(),'Software Manager')]");

    private By plusOnMapBtn = xpath("//*[@id='page-wrapper']//div[2]//div[1]/div[1]/button[2]");

    private By minusOnMapBtn = xpath("//*[@id='page-wrapper']//div[2]//div[1]/div[1]/button[3]");

    private By changeTreeViewBthn = xpath("//*[@id='page-wrapper']//div[2]//div[1]/div[1]/button[1]");

    private By statickSizeBtn = xpath("//*[@id='page-wrapper']//div[2]//div[1]/div[1]/button[4]");

    private By createBtn = xpath("//*[contains(text(),'Create')]");

    private By edit2Btn = xpath("//*[@id='page-wrapper']//div[2]/div[1]//div[2]/button[2]");

    private By createInPopUpBtn = xpath("createRoleBtn");

    private By roleNameField = xpath("//input[@placeholder='Role name']");

    private By roleTree = By.id("roleTree");

    private By SaveChangesBtn = xpath("//*[@id='page-wrapper']//button[2]");

    public RolesPage clicAtCompanyOrHospitalNamedropDown() {
        $(dropDownWithComanyNameBtn).click();
        sleep(500);
        return this;
    }

    public RolesPage selectRandomCompanyFromList() {
        $("[data-value='Company1537866757422']").click();
        sleep(300);
        return this;
    }

    public RolesPage selectRandomHospitalFromList() {
        $("[data-value='Hospital1537867247374']").click();
        return this;
    }

    public RolesPage pressEditBtn() {
        $(roleEditBtn).click();
        sleep(500);
        return this;
    }

    public RolesPage pressCreateBtn() {
        $(createBtn).click();
        sleep(400);
        return this;
    }

    public RolesPage fillRoleNameCompanyField() {
        roleName = System.currentTimeMillis();
        $(roleNameField).setValue("ProgectManager" + (roleName));
        sleep(300);
        return this;
    }
    public RolesPage fillRoleNameHospitalField() {
        roleName = java.lang.System.currentTimeMillis();
        $(roleNameField).setValue("Doctor" + (roleName));
        sleep(500);
        return this;
    }

    public RolesPage pressCreateInPopUp() {
        $(createInPopUpBtn).click();
        sleep(300);
        return this;
    }

    public RolesPage roleTextIsPresent(String message) {
        $(roleTree).shouldHave(Condition.text(message));
        sleep(500);
        return this;
    }

    public RolesPage clickHospitalRadioBtn() {
        $(hospitalRadioBtn).parent().click();
        sleep(1000);
        return this;
    }

    public RolesPage clickSaveHospitalOrCompanyChangesBtn() {
        $(SaveChangesBtn).click();
        sleep(300);
        return this;
    }



}
