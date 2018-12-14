package pages.Synergy;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class AddNewHospitalPage {

    public static long hospitalName;

    public AddNewHospitalPage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net/hospital/create");
        return this;
    }

    private By fullNameField = id("name");

    private By companydropDownField = id("companyId");

    private By addressField = xpath("//input[contains(@class, 'ant-select-search__field')][1]");

    private By webSiteField = id("website");

    private By phoneNumberField = id("phone");

    private By numberOfBeldsField = id("countBeds");

    private By numberOfDoctorsField = id("countDoctors");

    private By numberOfDepartmentManagersField = id("countDepartmentManagers");

    private By bioField = id("bio");

    private By foundationField = id("fundation");

    private By saveChangesBtn = xpath("//*[contains(text(),'Save Changes')]");

    public AddNewHospitalPage typeRandomHospitalName() {
        hospitalName = System.currentTimeMillis();
        $(fullNameField).setValue("Hospital" + String.valueOf(hospitalName));
        return this;
    }

    public AddNewHospitalPage checkPrivateRadioBtn() {
        $("input[value='0']").parent().click();
        return this;
    }

    public AddNewHospitalPage checkPublictRadioBtn() {
        $("input[value='1']").parent().click();
        return this;
    }

    public AddNewHospitalPage clickFoundationFiled() {
        $(foundationField).click();
        return this;
    }

    public AddNewHospitalPage chooseDataFoundationField() {
        $("[data-value='1993']").click();
        return this;
    }

    public AddNewHospitalPage fillAdressField(String adress) {
        $(addressField).val(adress);
        sleep(300);
        return this;
    }

    public AddNewHospitalPage selectAddressFromList() {
        $("[data-value='Columbus, OH, USA']").click();
        sleep(300);
        return this;
    }

    public AddNewHospitalPage fillWebSiteField(String website) {
        $(webSiteField).val(website);
        return this;
    }

    public AddNewHospitalPage fillPhoneField(String phone) {
        $(phoneNumberField).val(phone);
        return this;
    }

    public AddNewHospitalPage pressSaveCangesBtn() {
        $(saveChangesBtn).click();
        sleep(300);
        return this;
    }



}
