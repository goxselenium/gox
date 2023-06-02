package ui;

import org.openqa.selenium.By;

public class LoginPage {

	public static By btnLoginLocator = By.xpath("//a[@id='btnLogin']/button/span");
	public static By userNameLocator = By.id("fldEmail"); // Ingreso el email
	public static By passwordLocator = By.id("fldPassword"); // Ingreso Pass
	public static By submitLocator = By.xpath("//input[@id='btnLogin']"); // Boton ingresar
	public static By checkHomeLocator = By.xpath("//span[contains(text(),'Zenks123')]"); // Chequeo avatar del
	                                                                                     // usuario

}
