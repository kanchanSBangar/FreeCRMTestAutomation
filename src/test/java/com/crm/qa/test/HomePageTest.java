package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LogInPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LogInPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public HomePageTest(){
		super();
		}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil= new TestUtil();
		contactsPage= new ContactsPage();
		loginPage= new LogInPage();
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
	
	@Test(enabled= false)
	public void verifyHomePageTitleTest() {
		String homePageTitle= homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO", "HomePage Title not matched.");	
	}
	
	@Test(enabled= false)
	public void verifyUserNameTest() {
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUsername());
	}
	
	@Test
	public void verifyContactsLinkTest() {
		testUtil.switchToFrame();
		contactsPage= homePage.clickOnContactsLink();
		
	}
	
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}*/
	
}
