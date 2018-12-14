package pages.Synergy;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;
public class CompanyOrHospitalUserCreatePage {

    public static long userName;

    public CompanyOrHospitalUserCreatePage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net/user/create");
        sleep(300);
        return this;
    }

    // We create test for Client , at finish we will add hospital

    //Block for filling user info

    private By userNameField = id("userName");

    private By companyRadioBtn = xpath("//input[contains(@value, '0')]");

    private By clientRadioBtn = cssSelector("input[value='1']");

    private By companyDropDownBtn = xpath("//*[@id='page-wrapper']/div/div[1]/div[2]/div/div/div/div/div/form/div/div/div[1]/div[3]/div[2]/div");

    private By hospitalFieldBtn = id("hospitalId");

    private By companyDepartmentBtn = xpath("//*[@id='page-wrapper']//div[1]/div[2]//div[1]/div[4]/div[2]");

    private By adressField = xpath("//input[contains(@class, 'ant-select-search__field')][1]");

    private By systemRoleBtn = xpath("//*[@id='page-wrapper-container']/div[1]/div[2]//form//div[1]/div[6]/div[2]//span//div[1]//div");

    private By systemRoleList = xpath("//*[@id='page-wrapper']//form//div[1]/div[6]/div[2]//span//div[2]/div/div");

    private By emailField = id("email");

    private By phoneField = id("Phone");

    private By passwordField = id("Password");

    private By passwordConfirmField = id("ConfirmPassword");

    private By bioField = id("bio");

    private By chooseFileBtn = xpath("//*[contains(text(),'Choose file')]");

    private By cancelBtn = xpath("//*[contains(text(),'Cancel')]");

    private By saveChangesBtn = xpath("//*[contains(text(),'Save Changes')]");

    // private Select dropDownCustomList = new Select((WebElement) By.xpath("//ul[contains(@role, 'listbox')]"));

    public CompanyOrHospitalUserCreatePage fillUserNameField() {
        userName = java.lang.System.currentTimeMillis();
        $(userNameField).setValue("User" + (userName));
        sleep(100);
        return this;
    }

    public CompanyOrHospitalUserCreatePage fillAddressField(String address) {
        $(adressField).setValue(address);
        return this;
    }

    public CompanyOrHospitalUserCreatePage selectAddressFromList() {
        $("[data-value='Columbus, OH, USA']").click();
        sleep(300);
        return this;
    }

    public CompanyOrHospitalUserCreatePage fillEmailField(String email) {
        $(emailField).setValue(email);
        return this;
    }

    public CompanyOrHospitalUserCreatePage fillPhoneNumberField(String number) {
        $(phoneField).setValue(number);
        return this;
    }

    public CompanyOrHospitalUserCreatePage fillPaswordField(String password) {
        $(passwordField).setValue(password);
        return this;
    }

    public CompanyOrHospitalUserCreatePage fillPasswordConfirm(String password) {
        $(passwordConfirmField).setValue(password);
        return this;
    }


    public CompanyOrHospitalUserCreatePage fillFillBioField(String bio) {
        $(bioField).setValue(bio);
        return this;
    }

    public CompanyOrHospitalUserCreatePage clickSystemRoleDropDown() {
        $(systemRoleBtn).click();
        sleep(600);
        return this;
    }

    public CompanyOrHospitalUserCreatePage fillSystemRoleDropDownCreateCompanyUserAsSM() {
        $("[data-value='Software Manager']").click();
        sleep(500);
        return this;
    }

    public CompanyOrHospitalUserCreatePage fillSystemRoleDropDown() {
        $("[data-value='Doctor1537872173736']").click();
        sleep(500);
        return this;
    }

    public CompanyOrHospitalUserCreatePage fillSystemRoleRandomDropDown() {
        $("[data-value='" + "ProgectManager" + (RolesPage.roleName) + "']").click();
        sleep(500);
        return this;
    }

    public CompanyOrHospitalUserCreatePage selectRandomDoctorDropDown() {
        $("[data-value='" + "Doctor" + (RolesPage.roleName) + "']").click();
        sleep(500);
        return this;
    }



    public CompanyOrHospitalUserCreatePage fillSystemRoleCreateUserTest() {
        $("[data-value='Software Manager']").click();
        sleep(500);
        return this;
    }

    public CompanyOrHospitalUserCreatePage fillSystemRoleHospitalUserDropDown() {
        $("[data-value='RoleHospital1537373061953']").click();
        return this;
    }


    //Rariobtns&dropdowns
    public CompanyOrHospitalUserCreatePage clickCompanyDropDown() {
        $(companyDropDownBtn).click();
        sleep(900);
        return this;
    }

    public CompanyOrHospitalUserCreatePage chooseValueInCompanyDropDovn() {
        $("[data-value='Company1537866757422']").click();
        sleep(500);
        return this;
    }

    public CompanyOrHospitalUserCreatePage selectRandomCompanyNameDropDown() {
        $("[data-value='" + "Company" + ((AddNewCompanyPage.companyName) +"']")).click();
        sleep(400);
        return this;
    }

    public CompanyOrHospitalUserCreatePage chooseValueInCompanyDropDovnLogWithNewSM() {
        $("[data-value='Hoffing 3D']").click();
        sleep(500);
        return this;
    }

    public CompanyOrHospitalUserCreatePage clickCompanyDepartmentDropDovn() {
        $(companyDepartmentBtn).click();
        return this;
    }

    public CompanyOrHospitalUserCreatePage selectFromCompanyRandomValue() {
        $("[data-value='" + "Company" + ((AddNewCompanyPage.companyName) +"']")).click();
        return this;
    }

    public CompanyOrHospitalUserCreatePage clickSaveChangesBtn() {
        $(saveChangesBtn).click();
        sleep(1100);
        return this;
    }

    public CompanyOrHospitalUserCreatePage getSelect(WebElement element) {
        Select select = new Select(element);
        return this;
    }

    public CompanyOrHospitalUserCreatePage checkClientRadioBtn() {
        $(clientRadioBtn).parent().click();
        sleep(500);
        return this;
    }

    public CompanyOrHospitalUserCreatePage checkHospitalRadioBtn() {
        $(clientRadioBtn).parent().click();
        sleep(500);
        return this;
    }

    public CompanyOrHospitalUserCreatePage clickHospitalDropDown() {
        $(hospitalFieldBtn).click();
        sleep(700);
        return this;
    }

    public CompanyOrHospitalUserCreatePage chooseHospitalFromList() {
        $("[data-value='" + "Hospital" + (AddNewHospitalPage.hospitalName) + "']").click();
        sleep(500);
        return this;
    }

    public CompanyOrHospitalUserCreatePage setCompanyValue() {
        $("[data-value='Hoffing 3D']").click();
        sleep(500);
        return this;
    }

    public CompanyOrHospitalUserCreatePage setCompanyRandomValue() {
        $("[data-value='" + "Company" + ((AddNewCompanyPage.companyName) +"']")).click();
        sleep(500);
        return this;
    }
}