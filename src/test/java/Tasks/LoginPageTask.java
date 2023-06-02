package Tasks;

import org.openqa.selenium.WebDriver;

import actions.Clicks;
import actions.WaitVisibility;
import actions.Write;
import ui.LoginPage;
import utils.Log4j2;
import utils.ReadParameters;

public class LoginPageTask {
	public static String expectedCondition;

	public static void loginUserPage(WebDriver instanceDriver) throws Exception {

		Clicks.clickLocator(instanceDriver, LoginPage.btnLoginLocator);
		Thread.sleep(5000);
		Log4j2.info("Ingreso usuario y contraseña");
		Write.typeText(instanceDriver, LoginPage.userNameLocator, ReadParameters.getProperty("user"));
		Write.typeText(instanceDriver, LoginPage.passwordLocator, ReadParameters.getProperty("pass"));
		Clicks.clickLocator(instanceDriver, LoginPage.submitLocator);

		Log4j2.info("Espero a que cargue el Avatar");
		WaitVisibility.waitForElementToAppear(instanceDriver, LoginPage.checkHomeLocator);

	}
}
