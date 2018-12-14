package pages.Synergy;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HospitalsPage {

    public HospitalsPage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net/hospitals");
        return this;
    }

    private By addNewHospitalBtn = By.xpath("//a[contains(text(), 'Add new hospital')]");

    private By searchHospitalField = By.xpath("//input[@placeholder='input search text']");

    private By hospitalsList = By.xpath("//tbody[@class='ant-table-tbody']");

    public HospitalsPage randomHospitalIsPresentInList() {
        $(hospitalsList).shouldHave(text("Hospital" + (AddNewHospitalPage.hospitalName)));
        return this;
    }



}

