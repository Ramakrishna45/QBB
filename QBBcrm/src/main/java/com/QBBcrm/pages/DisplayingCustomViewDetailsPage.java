package com.QBBcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QBBcrm.genericlib.BaseTest;

public class DisplayingCustomViewDetailsPage {
	@FindBy(xpath="//input[@value='New Campaign']") private WebElement NewCampaignBtn;
	
	public DisplayingCustomViewDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}

	public WebElement getNewCampaignBtn() {
		return NewCampaignBtn;
	}
	
	public void setNewCampaignBtn(WebElement newCampaignBtn) {
		NewCampaignBtn = newCampaignBtn;
	}

	public void clickNewCampaignBtn() {
		NewCampaignBtn.click();
		
	}

	public void verifyCampaignCreation(String string) {
		// TODO Auto-generated method stub
		
	}
}
