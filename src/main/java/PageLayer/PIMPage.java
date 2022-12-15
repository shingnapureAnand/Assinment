package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimlink;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnPIMLink() {
		UtilsClass.clickOnObject(pimlink);
	}

	public String capturepimpageUrl() {
		return driver.getCurrentUrl();
	}

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addButton;

	@FindBy(name = "firstName")
	private WebElement firstname;

	@FindBy(name = "lastName")
	private WebElement lastName;

	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-')])[5]")
	private WebElement empid;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebutton;

	public void clickOnAddButton() {
		UtilsClass.clickOnObject(addButton);
	}

	public String captureAddEmployeePageUrl() {
		return driver.getCurrentUrl();
	}

	public void enterFirstAndLastName(String fname, String lname) {
		UtilsClass.sendData(firstname, fname);
		UtilsClass.sendData(lastName, lname);
	}

	public String captureEmployeeid() {
		return empid.getAttribute("value");
	}

	public void clickOnSaveButton() {
		UtilsClass.clickOnObject(savebutton);
	}

	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement employeelistlink;

	public void clickOnEmployeeList() {
		UtilsClass.clickOnObject(employeelistlink);
	}

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement searchEmpid;

	public void typeEmpid(String id) {
		UtilsClass.sendData(searchEmpid, id);
	}

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchbutton;

	public void clickOnseachButton() {
		UtilsClass.clickOnObject(searchbutton);
	}
	
	@FindBy(xpath="(//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[2]")
	private WebElement delete;
	public void clickOnCheckbox()
	{
		UtilsClass.clickOnObject(delete);
			
	}
	
	@FindBy(xpath="//button[contains(@class,'-margin')]")
	private WebElement deletedbox;
	
	public void deleteId()
	{
		UtilsClass.clickOnObject(deletedbox);
	}
	@FindBy(xpath="//button[text()=' Yes, Delete ']")
	private WebElement yesDelete;
	public void clickOnDelete()
	{
		UtilsClass.clickOnObject(yesDelete);
	}
	

}
