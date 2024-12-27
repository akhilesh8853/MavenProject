package com.saleszenith.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(linkText = "Logout [rashmi@dell.com]")
    private WebElement logoutBtn;
    
    @FindBy(linkText = "Leads")
	private WebElement leadsBtn;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignsBtn;
	
	@FindBy(linkText = "Potentials")
	private WebElement potentialBtn;
	
	@FindBy(linkText = "Accounts")
	private WebElement accountsBtn;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsBtn;
	
	@FindBy(linkText = "Home")
	private WebElement homeBtn;
	
	@FindBy(linkText = "Products")
	private WebElement productsBtn;
	
	@FindBy(linkText = "Vendors")
	private WebElement vendorsBtn;

	@FindBy(linkText = "Price Books")
	private WebElement priceBooksBtn;
	
	@FindBy(linkText = "Quotes")
	private WebElement quotesBtn;
	
	@FindBy(linkText = "Sales Orders")
	private WebElement salesOrdersBtn;
	
	@FindBy(linkText = "Purchase Orders")
	private WebElement purchaseOrdersBtn;
	
	@FindBy(linkText = "Invoices")
	private WebElement invoicesBtn;

    // Constructor
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getLogoutBtn() {
        return logoutBtn;
    }
    
    public WebElement getLeadsBtn() {
		return leadsBtn;
	}

	public WebElement getCampaignsBtn() {
		return campaignsBtn;
	}

	public WebElement getPotentialBtn() {
		return potentialBtn;
	}

	public WebElement getAccountsBtn() {
		return accountsBtn;
	}

	public WebElement getContactsBtn() {
		return contactsBtn;
	}

	public WebElement getHomeBtn() {
		return homeBtn;
	}

	public WebElement getProductsBtn() {
		return productsBtn;
	}

	public WebElement getVendorsBtn() {
		return vendorsBtn;
	}

	public WebElement getPriceBooksBtn() {
		return priceBooksBtn;
	}

	public WebElement getQuotesBtn() {
		return quotesBtn;
	}

	public WebElement getSalesOrdersBtn() {
		return salesOrdersBtn;
	}

	public WebElement getPurchaseOrdersBtn() {
		return purchaseOrdersBtn;
	}

	public WebElement getInvoicesBtn() {
		return invoicesBtn;
	}
}
