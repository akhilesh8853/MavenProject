package com.saleszenith.testscript;

import org.testng.annotations.Test;

import com.saleszenith.generic.BaseClass;
import com.saleszenith.pom.HomePage;

public class CampaignModule extends BaseClass{
	
	@Test
	public void creatingCampaign() {
		HomePage h = new HomePage(driver);
		h.getCampaignsBtn().click(); // switching to the campaign module
		
		
	}
}
