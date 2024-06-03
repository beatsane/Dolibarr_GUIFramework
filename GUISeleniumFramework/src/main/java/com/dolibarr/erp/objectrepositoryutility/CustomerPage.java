package com.dolibarr.erp.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage 
{
	WebDriver driver;
	public CustomerPage(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy (linkText= "Create proposal")
	private WebElement CreateProposalLink;
	
	@FindBy (linkText= "Create order")
	private WebElement CreateOrderLink;
	
	@FindBy (linkText= "Create contract")
	private WebElement CreateContractLink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateProposalLink() {
		return CreateProposalLink;
	}

	public WebElement getCreateOrderLink() {
		return CreateOrderLink;
	}

	public WebElement getCreateContractLink() {
		return CreateContractLink;
	}
	
	
	
	
	

}
