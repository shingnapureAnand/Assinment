package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass {
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement login;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterUsernameAndPassword(String uname, String pass) {
		UtilsClass.sendData(username, uname);
		UtilsClass.sendData(password, pass);
	}

	public void clickOnLogin() {

		UtilsClass.clickOnObject(login);
	}
}
