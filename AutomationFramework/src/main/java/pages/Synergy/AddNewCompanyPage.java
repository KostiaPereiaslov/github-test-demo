package pages.Synergy;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import pages.Page;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.*;

public class AddNewCompanyPage {

    public static long companyName;
    public static String CompanyName;
    public static String userName;

    //Buttons
    private By SaveChangesBtn = xpath("//*[@id='page-wrapper']//button[2]");

    private By CancelBtn = xpath("//*[@id='page-wrapper']//button[1]");

    private By ChooseFileBtn = xpath("//*[@id='page-wrapper']//form//button");

    //Fileds
    private By fieldFullName = By.cssSelector("#name");

    private By addressField = xpath("//input[contains(@class, 'ant-select-search__field')][1]");
    // id("address");

    private By WebsiteField = id("website");

    private By EmailField = id("email");

    private By PhoneField = id("phone");

    private By NumberOfEmployeesField = id("countEmployees");

    private By NumberOfEmployeesPlus = id("//*[@id='page-wrapper']//span//div[1]/span[1]");

    private By NumberOfEmployeesMinus = id("//*[@id='page-wrapper']//span//div[1]/span[1]");

    private By CompanyBioField = id("bio");

    private By ErrorDiv = xpath("//div[@class='ant-form-explain' and string-length(text())>0]");

    private By ErrorText = xpath("//div[@class=\"ant-form-explain\" and text()=\"%s\"]");


    //inicialize page

     public AddNewCompanyPage open() {
         Selenide.open("http://synergy3dmed1.azurewebsites.net/company/create");
         sleep(300);
         return this;
     }

    //_____________________Fields________________________________

    // Fill in the name field with data


    public AddNewCompanyPage typeRandomCompanyName(){
        companyName = java.lang.System.currentTimeMillis();
        $(fieldFullName).setValue("Company" + (companyName));
        return this;
    }

    // Fill in the adress field with data
    public AddNewCompanyPage typeAdress(String adress) {
        $(addressField).val(adress);
        sleep(300);
        return this;
    }

    public AddNewCompanyPage selectAddressFromList() {
        $("[data-value='Basel, Switzerland']").click();
        sleep(300);
        return this;
    }

    // Fill in the website field with data
    public AddNewCompanyPage typeWebSite(String website) {
        $(WebsiteField).val(website);
        return this;
    }

    // Fill in the Email field with data
    public AddNewCompanyPage typeEmail(String email) {
        $(EmailField).val(email);
        return this;
    }

    // Fill in the Phone field with data
    public AddNewCompanyPage typePhone(String phone) {
        $(PhoneField).val(phone);
        return this;
    }

    // Fill in the CountEmploee field with data
    public AddNewCompanyPage typeNumberEmployers(String countEmployees) {
        $(NumberOfEmployeesField).val(countEmployees);
        return this;
    }

    // Fill in the Bio field with data
    public AddNewCompanyPage typeCompanyBio(String bio) {
        $(CompanyBioField).val(bio);
        return this;
    }

    //_________________Buttons_________________________________


    // Click login button
    public AddNewCompanyPage clickSaveChangesBtn() {
        $(SaveChangesBtn).click();
       sleep(1000);
        return this;
    }

    public AddNewCompanyPage clickChooseFileBtn(String key) {
         $(ChooseFileBtn).sendKeys("C:\\Users\\Kostyantyn\\Pictures\\download.jpg");
         return this;
    }

    //____________________Errors____________________________________

    public ElementsCollection getErrors() {
        return $$(ErrorDiv);
    }

    //  public String getErrorsByNumber(int number) {
    // return getErrors().get(number -1).toString();
    // }

    // public boolean isErrorVisible(String message) {
    //        return $$(xpath(format(errorByText, message))).isDisplayed();

    // }
}

