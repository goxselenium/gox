package wd;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverCreator {

	public WebDriver chromeDriverConnection() throws Exception {
		System.setProperty("webdriver.chrome.driver", BrowserManager.setProperty);
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless");
		options.setPlatformName("Windows 7");
		options.setBrowserVersion(BrowserManager.browserVersion);
		// Descripción: Disable Chrome is being controlled by automated test software
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("--disable-dev-shm-usage", "--disable-extensions", "--disable-gpu",
		                "--disable-notifications", "--disable-popup-blocking", "--no-sandbox",
		                "--single-process", "--start-maximized", "disable-infobars",
		                "ignore-certificate-errors");
		options.setCapability("acceptInsecureCerts", true);
		// Description: solve timeout exception2
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		Map<String, Object> prefs = new HashMap<String, Object>();
		options.setExperimentalOption("prefs", prefs);
		prefs.put("credentials_enable_service", false);
		// Description: Disabled save pass prefs
		prefs.put("profile.password_manager_enabled", false);
		BrowserManager.instanceDriver = new ChromeDriver(options);
		return BrowserManager.instanceDriver;
	}
}
