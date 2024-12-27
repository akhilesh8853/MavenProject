package com.saleszenith.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CampaignPage {

	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement newCampaignBtn;

	@FindBy(xpath = "//input[@name='property(Campaign Name)']")
	private WebElement campaignNameTbx;

	@FindBy(xpath = "//input[@name='property(Start Date)']")
	private WebElement startDateTbx;

	@FindBy(xpath = "//input[@name='property(End Date)']")
	private WebElement endDateTbx;

	@FindBy(xpath = "//input[@name='property(Expected Revenue)']")
	private WebElement expectedRevenueTbx;

	@FindBy(xpath = "//input[@name='property(Actual Cost)']")
	private WebElement actualCostTbx;

	@FindBy(xpath = "//input[@name='property(Num sent)']")
	private WebElement numSentTbx;

	@FindBy(xpath = "//input[@name='property(Budgeted Cost)']")
	private WebElement budgetedCostTbx;

	@FindBy(xpath = "//input[@name='property(Expected Response)']")
	private WebElement expectedResponseTbx;

	@FindBy(xpath = "//select[@name='property(Type)']")
	private WebElement typeDropdown;

	public CampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Method to select an option by visible text 
	public void selectTypeByVisibleText(String visibleText) { 
		Select select = new Select(typeDropdown);
		select.selectByVisibleText(visibleText); 
	}
	
	
}
