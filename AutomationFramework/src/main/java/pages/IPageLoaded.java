package pages;

import com.google.common.base.Function;
import org.openqa.selenium.WebDriver;

public interface IPageLoaded {
	
	Function<WebDriver, ?> isPageLoaded();

}
