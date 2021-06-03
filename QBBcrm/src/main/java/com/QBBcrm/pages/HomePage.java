package com.QBBcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QBBcrm.genericlib.BaseTest;

public class HomePage {
	
	//Declaration
	//@Findby(locatorName="locatorvalue") accessSpecifier ReturnType elementName
	@FindBy(xpath = "//a[ text()='Campaigns']") private WebElement campaignsList;
	
	//Initialization
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	//Utilization
	  //Address returning method
	public WebElement getCampaignsList() {
		return campaignsList;
	}
	
	//Action performing method
	public void clickCampaignLink() {
		 campaignsList.click();
	}
	  

}
