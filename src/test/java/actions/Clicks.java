package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Clicks {

	public static void clickLocator(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
}
