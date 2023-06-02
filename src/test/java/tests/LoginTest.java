package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Tasks.LoginPageTask;
import actions.GetTitle;
import wd.BrowserManager;

@Listeners(listeners.TestListener.class)
public class LoginTest extends BrowserManager {

	@Test(priority = 0, enabled = true)
	public void testLogin() throws Exception {
		LoginPageTask.loginUserPage(BrowserManager.instanceDriver);
		assertEquals(GetTitle.getTitlePage(BrowserManager.instanceDriver), "Warframe");
	}
}
