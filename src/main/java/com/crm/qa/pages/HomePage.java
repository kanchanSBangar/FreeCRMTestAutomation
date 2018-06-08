package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]/font")
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(), 'Contacts')]")
	WebElement contactsLink;

	@FindBy(xpath = "////a[contains(text(), 'Tasks')]")
	WebElement tasksLink;

	@FindBy(xpath = "//a[contains(text(), 'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(), 'Companies')]")
	WebElement CompaniesLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUsername() {
		return userNameLabel.isDisplayed();
	
	}

	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();

	}

	public CompaniesPage clickOnCompaniesLink() {
		CompaniesLink.click();
		return new CompaniesPage();
}
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
}
	
	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
}
}
