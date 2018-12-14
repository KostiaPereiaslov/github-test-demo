package pages.Synergy;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.xpath;

public class CompanysPage {

    public CompanysPage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net/companies");
        sleep(300);
        return this;
    }

    private By addNewCompanyBtn = xpath("//*[@id='page-wrapper']//button/a");

    private By companiesBlockClinicName = xpath("//*[@id='page-wrapper']//td[1]//a");

    private By searchField = xpath("//input[@placeholder='input search text']");

    private By clearAllBtn = xpath("//*[@id='page-wrapper']//div[3]/span");

    private By addCustomfilterBtn = xpath("//*[@id='page-wrapper']/div/div[1]/div[2]//div[1]/button");

    private By companyBtn = xpath("//tbody[@class='ant-table-tbody']");

    public CompanysPage fiilSearchPageField() {
        $(searchField).setValue("Company" + (AddNewCompanyPage.companyName)).pressEnter();
        sleep(500);
        return this;
    }

    public CompanysPage companyTableUserIsPresent() {
        $(companiesBlockClinicName).shouldHave(text(("Company" + AddNewCompanyPage.companyName)));
        sleep(300);
        return this;
    }

    public CompanysPage clickCompanyBtn() {
        $(companiesBlockClinicName).click();
        sleep(300);
        return this;
    }

}
