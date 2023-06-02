package patterns;
package patterns;

import org.openqa.selenium.WebDriver;

public class Singleton {

	// Instance of type singleton
	private static Singleton instance = null;
	private WebDriver driver;

	// Constructor restricted to this class itself
	private Singleton() {
	}

	// Create instance of Singleton Class
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// To get driver
	public WebDriver getDriver() {
		return driver;
	}
}
