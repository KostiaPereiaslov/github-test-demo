package pages.Synergy;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class CreateNewProjectPage {
    static long patientId;

    private By patientIdField = By.id("patientLocalId");

    private By patientInitialsField = By.id("patientName");

    private By bodyPositionField = By.id("bodyPosition");

    private By SuggestedWorkFlowField = By.id("type");

    private By hospitalWorkFlowField = By.id("hospitalId");

    private By doctorDropDownField = By.id("doctorId");

    private By progecktStartField = By.id("patientLocalId");

    private By deliveryField = id("deliveryDate");

    private By nextBtn = By.xpath("//*[contains(text(),'Next')]");

    private By resorsesYesBtn = cssSelector("input[value='1']");

    private By pricingYesBtn = cssSelector("input[value='1']");

    private By calendarTodayBtn = xpath("//a[text()='Today']");

    private By metting1DateTimeField = id("Metting1DateTime");

    private By nowDayCalendarBtn = xpath("//a[text()='Now']");

    private By getMetting1DateTime2Field = id("Metting2DateTime");

    private By confirmBtn = xpath("//button[text()='Confirm']");

    private By confirmInPopUpBtn = id("confirmCreateProject");

    private By okayBtn = id("thanksModalOkay");

    public CreateNewProjectPage fillRandomPatientId() {
        patientId = System.currentTimeMillis();
        $(patientIdField).setValue("Id" + (patientId));
        sleep(100);
            return this;
        }

    public CreateNewProjectPage fillPatientinitials(String initials) {
        $(patientInitialsField).val(initials);
        sleep(100);
        return this;
    }

    public CreateNewProjectPage fillBodyPosition(String position) {
        $(bodyPositionField).val(position);
        sleep(300);
        return this;
    }

    public CreateNewProjectPage clickHospitalDropDovn() {
        $(hospitalWorkFlowField).click();
        sleep(100);
        return this;
    }

    public CreateNewProjectPage setHospital() {
        $("[data-value='Hospital1537867247374']").click();
        sleep(300);
        return this;
    }

    public CreateNewProjectPage chooseRandomHospitalFromList() {
        $("[data-value='" + "Hospital" + (AddNewHospitalPage.hospitalName) + "']").click();
        sleep(500);
        return this;
    }

    public CreateNewProjectPage clickDoctorDropDovn() {
        $(doctorDropDownField).click();
        sleep(100);
        return this;
    }

    public CreateNewProjectPage setDoctor() {
        $("[data-value='User1537873648197']").click();
        sleep(300);
        return this;
    }

    public CreateNewProjectPage setRandomDoctor() {
        $("[data-value='" +  "User" + (CompanyOrHospitalUserCreatePage.userName) + "']").click();
        sleep(500);
        return this;
    }

    public CreateNewProjectPage clickDeliveryDay() {
        $(deliveryField).click();
        sleep(100);
        return this;
    }

    public CreateNewProjectPage clikCalendarToday() {
        $(calendarTodayBtn).parent().click();
        sleep(100);
        return this;
    }

    public CreateNewProjectPage clikNextBtn() {
        $(nextBtn).click();
        sleep(300);
        return this;
    }

    public CreateNewProjectPage clikMeetingDateAndTimeField() {
        $(metting1DateTimeField).click();
        sleep(300);
        return this;
    }

    public CreateNewProjectPage clickNowCalendarBtn() {
        $(nowDayCalendarBtn).click();
        sleep(300);
        return this;
    }

    public CreateNewProjectPage clikMeetingDateAndTimeField2() {
        $(getMetting1DateTime2Field).click();
        sleep(300);
        return this;
    }

    public CreateNewProjectPage clickConfirmBtn() {
        $(confirmBtn).click();
        sleep(300);
        return this;
    }

    public CreateNewProjectPage clickConfirmInPopUp() {
        $(confirmInPopUpBtn).click();
        sleep(300);
        return this;
    }

    public CreateNewProjectPage clickOkayBtn() {
        $(okayBtn).click();
        sleep(300);
        return this;
    }

    public CreateNewProjectPage chooseBrainPosition() {
        $(By.cssSelector("li[title='Brain']")).click();
        sleep(300);
        return this;
    }

    public CreateNewProjectPage clickBodyPasitionBtn() {
        $(bodyPositionField).click();
        sleep(300);
        return this;
    }
}