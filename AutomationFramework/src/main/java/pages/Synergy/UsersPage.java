package pages.Synergy;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.By.xpath;

public class UsersPage extends CompanyOrHospitalUserCreatePage {

    public UsersPage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net/users");
        sleep(300);
        return this;
    }

    private By createNewUserBtn = xpath("//*[contains(text(),'Create new user')]");

    private By itemsPerPageBtn  = xpath("//*[@id='page-wrapper-container']/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/ul/li[5]/div/div/div/div");

    private By hospitalDropDown = xpath("//*[@id='page-wrapper-container']/div[1]/div[2]//div[1]//div[2]//div");

   // private By roleSavechangesBtn = xpath("//*[contains(text(),'Save Changes')]");

   // private By roleSavechangesBtn = xpath("//*[contains(text(),'Save Changes')]");

    //private By roleSavechangesBtn = xpath("//*[contains(text(),'Save Changes')]");

   // private By roleSavechangesBtn = xpath("//*[contains(text(),'Save Changes')]");

    //private By roleSavechangesBtn = xpath("//*[contains(text(),'Save Changes')]");

   // private By roleSavechangesBtn = xpath("//*[contains(text(),'Save Changes')]");

   // private By roleSavechangesBtn = xpath("//*[contains(text(),'Save Changes')]");

   private By usersList = xpath("//tbody[@class='ant-table-tbody']");

    public UsersPage userIsPresentCompanyTable() {
        $(usersList).shouldHave(text("User" + String.valueOf(userName)));
        sleep(300);
        return this;
    }

    public UsersPage clikItemsPerPageBtn() {
        $(itemsPerPageBtn).click();
        return this;
    }

    public UsersPage clickDropDownBtn() {
        $(hospitalDropDown).click();
        sleep(300);
        return this;
    }

    public UsersPage setWalueInDropDownCreateUserAsSM() {
        $("[data-value='Company1537866757422']").click();
        sleep(300);
        return this;
    }

    public UsersPage setWalueInDropDown() {
        $("[data-value='Hoffing 3D']").click();
        sleep(300);
        return this;
    }

    public UsersPage checkHospitalRadioBtn() {
        $("input[value='1']").parent().click();
        sleep(300);
        return this;
    }

    public UsersPage setWalueInRoleDropDown() {
        $("[data-value='Hoffing 3D']").click();
        sleep(300);
        return this;
    }

}