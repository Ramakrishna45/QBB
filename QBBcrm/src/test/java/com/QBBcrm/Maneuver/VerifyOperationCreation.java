package com.QBBcrm.Maneuver;

import org.testng.annotations.Test;

import com.QBBcrm.genericlib.BaseTest;
import com.QBBcrm.genericlib.FileLib;
import com.QBBcrm.genericlib.WebDriverCommonLib;
import com.QBBcrm.pages.CreateCampainPage;
import com.QBBcrm.pages.DisplayingCustomViewDetailsPage;
import com.QBBcrm.pages.HomePage;

public class VerifyOperationCreation extends BaseTest {
	
	@Test
	public void verifyOperationTest() throws Throwable {
		//"open the browser and enter the url and Click on go button" and verify Login Page
		
		//Login to App and verify HOME PAGE
		ValidLoginTest vl = new ValidLoginTest();
		vl.loginToApp();
		
		//click on operation ,module
		HomePage hp = new HomePage() ;
		hp.clickCampaignLink();
		
		WebDriverCommonLib wdlib = new WebDriverCommonLib();
		FileLib flib = new FileLib();
		wdlib.verify(wdlib.getPageTitle(), flib.readPropData(PROP_PATH, "customViewTitle"), "Custom View Page");   
	
	
	    //click on New operation button
		DisplayingCustomViewDetailsPage dc = new DisplayingCustomViewDetailsPage();
		dc.clickNewCampaignBtn();
		wdlib.verify(wdlib.getPageTitle(), flib.readPropData(PROP_PATH, "createCampaignTitle"), "Create Campaign Page");
		
		CreateCampainPage ccp =new CreateCampainPage();
		ccp.enterCampaignName("RK");
		ccp.clicksavebtn();
		Thread.sleep(3000);
		hp.clickCampaignLink();
		Thread.sleep(3000);
		dc.verifyCampaignCreation("RK");
		
	}

}
