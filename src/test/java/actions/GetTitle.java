package actions;

import org.openqa.selenium.WebDriver;

public class GetTitle {

	public static String getTitlePage(WebDriver driver) {
		return driver.getTitle();
	}
}
