package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LogInPage extends TestBase {

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit' and @value='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[contains(text(), 'Sign Up']")
	WebElement signUpBtn;

	@FindBy(xpath = "//img[contains(@class, 'img-responsive')]")
	WebElement crmLogo;

	
	//Initialising the Page objects
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.submit();
		return new HomePage();
	}

}
