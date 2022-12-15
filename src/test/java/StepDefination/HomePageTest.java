package StepDefination;

import PageLayer.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageTest {
private HomePage homepage;
	
	@Then("Verify home page Title")
	public void verify_home_page_title() {
		homepage =new HomePage();
		Assert.assertEquals(true, homepage.captureHomePageTitle().contains("HRM"));
	
	}

	@Then("Verify Home Page Logo")
	public void verify_home_page_logo() {
		System.out.println(homepage.checkHomePageLogo());
		Assert.assertEquals(true, homepage.checkHomePageLogo());
	}

	@Then("Verify Home Page Url")
	public void verify_home_page_url() {
		Assert.assertEquals(true, homepage.captureHomePageUrl().contains("hrm"));
	}




	
	

}
