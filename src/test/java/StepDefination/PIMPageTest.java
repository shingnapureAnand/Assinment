package StepDefination;

import PageLayer.PIMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class PIMPageTest {
	private PIMPage pimpage;
	public static String empid;
	
	@When("User is on PIM page")
	public void user_is_on_pim_page() {
		pimpage=new PIMPage();
		pimpage.clickOnPIMLink();
	}

	@Then("validate user is on pim page using url")
	public void validate_user_is_on_pim_page_using_url() {
		Assert.assertEquals(true,pimpage.capturepimpageUrl().contains("pim"));
		
	}

	@When("user click on Add button")
	public void user_click_on_add_button() {
		pimpage=new PIMPage();
		pimpage.clickOnAddButton();
		
	}

	@When("user is on Add Employee Page")
	public void user_is_on_add_employee_page() {
		
	Assert.assertEquals(true,pimpage.captureAddEmployeePageUrl().contains("addEmployee"));	
	}

	@Then("user can enter firstname and last name")
	public void user_can_enter_firstname_and_last_name() {
	pimpage.enterFirstAndLastName("Pallavi", "kale");	
	}

	@Then("user can capture employee id")
	public void user_can_capture_employee_id() {
		 empid=pimpage.captureEmployeeid();
		System.out.println(empid);
		
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		pimpage.clickOnSaveButton();
		
	}

	@When("user click on employee list")
	public void user_click_on_employee_list() {
		pimpage=new PIMPage();
		pimpage.clickOnEmployeeList();

	}

	@When("user enter employee id Number")
	public void user_enter_employee_id_number() {
		pimpage.typeEmpid(empid);
		
	}

	@Then("user click on search button")
	public void user_click_on_search_button() {
		pimpage.clickOnseachButton();
		
	}

	@Then("user click on checkbox")
	public void user_click_on_checkbox() throws InterruptedException {
		Thread.sleep(4000);
		pimpage.clickOnCheckbox();
		
	}

	@Then("click on Delete selected")
	public void click_on_delete_selected() throws InterruptedException {
		Thread.sleep(4000);
		pimpage.clickOnDelete();
	}

	@Then("capture popup text")
	public void capture_popup_text() throws InterruptedException {
		Thread.sleep(4000);
		pimpage.deleteId();
	}

	@Then("click on yes delete button")
	public void click_on_yes_delete_button() throws InterruptedException {
		Thread.sleep(4000);
		pimpage.clickOnDelete();
	}

}
