package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginClassTest extends BaseClass {
	private LoginPage loginpage;

	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		BaseClass.initialization();

	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		loginpage = new LoginPage();
		loginpage.enterUsernameAndPassword("Admin","admin123");

	}

	@Then("user click on login")
	public void user_click_on_login() {
		loginpage.clickOnLogin();
	}

}
