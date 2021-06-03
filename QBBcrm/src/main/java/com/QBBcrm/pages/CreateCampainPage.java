package com.QBBcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QBBcrm.genericlib.BaseTest;

public class CreateCampainPage {
	
	@FindBy(name = "property(Campaign Name)") private WebElement CampaigName;
	@FindBy(xpath = "//td[contains(text(), ' Create Campaign')]/ancestor::table/following-sibling::table[2]/descendant::input[@value='Save']")
	private WebElement saveBtn;
	
	
	public CreateCampainPage() {
		PageFactory.initElements(BaseTest.driver, this);	
	}

	public WebElement getCampaigName() {
		return CampaigName;
	}
	 
	public void enterCampaignName(String campaignName) {
		CampaigName.sendKeys(campaignName);
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void clicksavebtn() {
		saveBtn.click();
	}

}
