package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{

	public static void sendData(WebElement wb,String value)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.sendKeys(value);
		}
	}
	public static void clickOnObject(WebElement wb) {
		if(wb.isDisplayed())
		{
			wb.click();
		}
		
	}

}
