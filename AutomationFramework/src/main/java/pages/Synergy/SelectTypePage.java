package pages.Synergy;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.sleep;

public class SelectTypePage {

    public SelectTypePage open() {
        Selenide.open("http://synergy3dmed1.azurewebsites.net/project/selectType");
        sleep(300);
        return this;
    }
    private By secectPran1Btn = By.xpath("//*[@id='page-wrapper-container']/div[1]/div[2]//div[1]/div[2]/button");


}
