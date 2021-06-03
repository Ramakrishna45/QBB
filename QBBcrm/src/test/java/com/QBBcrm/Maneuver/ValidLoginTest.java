 package com.QBBcrm.Maneuver;

import org.testng.annotations.Test;

import com.QBBcrm.genericlib.BaseTest;
import com.QBBcrm.genericlib.FileLib;
import com.QBBcrm.pages.LoginPage;

public class ValidLoginTest extends BaseTest {
	
	@Test
	public void loginToApp() throws Throwable {
		LoginPage lp = new LoginPage();
		FileLib fl = new FileLib() ;
	    lp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password"));	
	    
	   
	}

}
