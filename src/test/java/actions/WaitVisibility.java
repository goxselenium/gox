package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitVisibility {

	public static boolean waitForElementToAppear(WebDriver driver, By locator) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(15)).until(
					wait -> ExpectedConditions.visibilityOfElementLocated(locator).apply(driver));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
