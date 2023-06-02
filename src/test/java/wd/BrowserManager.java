package wd;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import patterns.Singleton;
import utils.ReadParameters;

public class BrowserManager {

	protected static String setProperty;
	public static String browserVersion;
	public static String browserName;
	public static WebDriver instanceDriver;
	// protected ThreadLocal<WebDriver> webDriverThread = new ThreadLocal<>();

	@BeforeClass
	@Parameters({ "BrowserType", "Version" })
	public void initilize(String browserType, String version) throws Exception {

		browserVersion = version;
		browserName = browserType;
		instanceDriver = Singleton.getInstance().getDriver();

		// Chequeo que sea la misma instancia
		// Singleton singleton = Singleton.getInstance();
		// Singleton singleton2 = Singleton.getInstance();
		// Log4j2.info("Instancia S1: " + singleton);
		// Log4j2.info("Instancia S2: " + singleton2);
		// System.out.println("Hilo Init: -->" + Thread.currentThread().getId());

		if (instanceDriver == null) {
			if (browserName.equalsIgnoreCase("Chrome")) {
				ChromeDriverCreator driverCreator = new ChromeDriverCreator();
				setProperty = ReadParameters.getProperty("chromeDrv");
				instanceDriver = driverCreator.chromeDriverConnection();
			} else {
				throw new Exception("Browser is not correct");
			}
		}

		instanceDriver.get(ReadParameters.getProperty("host"));
		instanceDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() throws InterruptedException {
		if (instanceDriver != null) {
			try {
				instanceDriver.quit();
				instanceDriver = null;
			} catch (Exception e) {
			}
		}
	}
}