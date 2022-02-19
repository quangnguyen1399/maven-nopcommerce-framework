package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.abstractTest;
import pageObject.PageGeneratorManager;
import pageObject.homePageObject;
import pageObject.loginPageObject;
import pageObject.searchPageObject;

public class User_04_Search extends abstractTest{
	WebDriver driver;
	homePageObject homePage;
	loginPageObject loginPage;
	searchPageObject searchPage;
	
	String messageNotExitData = "No products were found that matched your criteria.";
	
	@Parameters({"browser", "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appurl) {
		driver = getBrowserDriver(browserName, appurl);
		
		log.info("Pre-condition Step 01: Open homepage nop commerce");
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Pre-condition Step 02: Click and open login link");
		loginPage = homePage.clickToLoginLink();
		
		log.info("Pre-condition Step 03: Input to email textbox: " + User_01_Register.email);
		loginPage.inputToEmailTextbox(User_01_Register.email);
		
		log.info("Pre-condition Step 04: Input to password textbox: " + User_01_Register.password);
		loginPage.inputToPasswordTextbox(User_01_Register.password);
		
		log.info("Pre-condition Step 05: Click login button");
		homePage = loginPage.clickToLoginButton();
		
		log.info("Pre-condition Step 06: Click to search link at footer");
		searchPage = homePage.clickToSearchLink();
	}
	
	@Test
	public void Search_01_Empty_Data() {
		log.info("Search_Empty data Step 01: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Empty data Step 02: verify error empty data displayed");
		verifyEquals(searchPage.isErrorEmptyDataDisplayed(), "Search term minimum length is 3 characters");		
	}
	
	@Test
	public void Search_02_Not_Exit_Data() {
		log.info("Search_Not exit data Step 01: input to search keyword textbox: macbook pro 2015");
		searchPage.inputToSearchKeywordTextbox("macbook pro 2015");
		
		log.info("Search_Not exit data Step 02: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Not exit data Step 03: verify message not exit data: " + messageNotExitData);
		verifyEquals(searchPage.isMessageNotExitData(), messageNotExitData);
	}
	
	@Test
	public void Search_03_Relative_Product() {
		log.info("Search_Relative product Step 01: input to search keyword textbox: Lenovo");
		searchPage.inputToSearchKeywordTextbox("Lenovo");
		
		log.info("Search_Relative product Step 02: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Relative product Step 03: verify with relative product dispalyed");
		verifyEquals(searchPage.isLenovoIdeaCentre600AllInOnePC(), "Lenovo IdeaCentre 600 All-in-One PC");
		verifyEquals(searchPage.isLenovoThinkpadX1CarbonLaptop(), "Lenovo Thinkpad X1 Carbon Laptop");
		
	}
	
	@Test
	public void Search_04_Absolute_Product() {
		log.info("Search_Absolute product Step 01: input to search keyword textbox: ThinkPad X1 Carbon");
		searchPage.inputToSearchKeywordTextbox("ThinkPad X1 Carbon");
		
		log.info("Search_Absolute product Step 02: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Absolute product Step 03: verify with absolute product dispalyed");
		verifyEquals(searchPage.isLenovoThinkpadX1CarbonLaptop(), "Lenovo Thinkpad X1 Carbon Laptop");
	}
	
	@Test
	public void Search_05_Parent_Categories() {
		log.info("Search_Parent categories Step 01: input to search keyword textbox: Apple MacBook Pro");
		searchPage.inputToSearchKeywordTextbox("Apple MacBook Pro");
		
		log.info("Search_Parent categories Step 02: click to advanced search");
		searchPage.clickToAdvancedSearch();
		
		log.info("Search_Parent categories Step 03: input to category textbox: Computers");
		searchPage.inputToCategory("Computers");
		
		log.info("Search_Parent categories Step 04: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Parent categories Step 05: verify message not exit data: " + messageNotExitData);
		verifyEquals(searchPage.isMessageNotExitData(), messageNotExitData);
	}
	
	@Test
	public void Search_06_Sub_Categories() {
		log.info("Search_Sub categories Step 01: input to search keyword textbox: Apple MacBook Pro");
		searchPage.inputToSearchKeywordTextbox("Apple MacBook Pro");
		
		log.info("Search_Sub categories Step 02: input to category textbox: Computers");
		searchPage.inputToCategory("Computers");
		
		log.info("Search_Sub categories Step 03: click to sub categories");
		searchPage.clickToSubCategories();
		
		log.info("Search_Sub categories Step 04: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Sub categories Step 05: verify product dispalyed: Apple MacBook Pro 13-inch");
		verifyEquals(searchPage.isAppleMacbookPro13inch(), "Apple MacBook Pro 13-inch");
	}
	
	@Test
	public void Search_07_Incorrect_Manufacturer() {
		log.info("Search_Incorrect manufacturer Step 01: input to search keyword textbox: Apple MacBook Pro");
		searchPage.inputToSearchKeywordTextbox("Apple MacBook Pro");
		
		log.info("Search_Incorrect manufacturer Step 02: input to category textbox: Computers");
		searchPage.inputToCategory("Computers");
		
		log.info("Search_Incorrect manufacturer Step 03: input to manufacturer textbox: HP");
		searchPage.inputToManufacturer("HP");
		
		log.info("Search_Incorrect manufacturer Step 04: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Incorrect manufacturer Step 05: verify message not exit data: " + messageNotExitData);
		verifyEquals(searchPage.isMessageNotExitData(), messageNotExitData);
	}
	
	@Test
	public void Search_08_Correct_Manufacturer() {
		log.info("Search_Correct manufacturer Step 01: input to search keyword textbox: Apple MacBook Pro");
		searchPage.inputToSearchKeywordTextbox("Apple MacBook Pro");
		
		log.info("Search_Correct manufacturer Step 02: input to category textbox: Computers");
		searchPage.inputToCategory("Computers");
		
		log.info("Search_Correct manufacturer Step 03: input to manufacturer textbox: Apple");
		searchPage.inputToManufacturer("Apple");
		
		log.info("Search_Correct manufacturer Step 04: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Correct manufacturer Step 05: verify product dispalyed: Apple MacBook Pro 13-inch");
		verifyEquals(searchPage.isAppleMacbookPro13inch(), "Apple MacBook Pro 13-inch");
		
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}

}
