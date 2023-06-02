package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Write {

	public static void typeText(WebDriver driver, By locator, String text) {
		driver.findElement(locator).click();
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	}

}
