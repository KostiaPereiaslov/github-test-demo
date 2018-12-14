package pages.Synergy;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class LeftSidebarMenu {

    private By dashboardBtn = xpath("//span[contains(@class, 'nav-label')]");

    private By progectsBtn= xpath("//*[contains(text(),'Projects')]");

    private By userManagmentBtn = xpath("//*[contains(text(),'User Management')]");

    private By rolesBtn = xpath("//*[contains(text(),'Roles')]");

    private By usersBtn = xpath("//*[contains(text(),'Users')]");

    private By organisationsBtn = xpath("//*[contains(text(),'Organisations')]");

    private By hospitalsBtn = xpath("//*[contains(text(),'Hospitals')]");

    private By companiesBtn = xpath("//*[contains(text(),'Companies')]");

    private By workFlowsBtn = xpath("//*[contains(text(),'WorkFlows')]");

    private By marcetingBtn = xpath("//*[contains(text(),'Marketing')]");

    private By calendarBtn = xpath("//*[contains(text(),'Calendar')]");

}
