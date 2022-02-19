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

public class User_02_Login extends abstractTest{
	WebDriver driver;
	homePageObject homePage;
	loginPageObject loginPage;
	
	String newEmail = "quang" + getRandom() + "sh@gmail.com";
	
	@Parameters({"browser", "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appurl) {
		driver = getBrowserDriver(browserName,appurl);
		
		log.info("Pre-condition Step 01: Open homepage nop commerce");
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Pre-condition Step 02: Click and open login link");
		loginPage =  homePage.clickToLoginLink();

	}
	
	@Test
	public void User_01_Login_With_Empty_Data() {
		log.info("Login_With empty data - Step 01: Click to login button");
		loginPage.clickToLoginButton();
		
		log.info("Login_With empty data - Step 02: Verify empty data error message");
		verifyEquals(loginPage.isEmptyDataErrorMessage(), "Please enter your email");
		
	}
	
	@Test
	public void User_02_Login_With_Invalid_Email() {
		loginPage.refreshPage(driver);
		
		log.info("Login_With invalid email - Step 01: Input to email textbox with invalid email: " + User_01_Register.invalidEmail);
		loginPage.inputToEmailTextbox(User_01_Register.invalidEmail);
		
		log.info("Login_With invalid email - Step 02: Input to password textbox: " + User_01_Register.password);
		loginPage.inputToPasswordTextbox(User_01_Register.password);
		
		log.info("Login_With invalid email - Step 03: Verify wrong email displayed");
		verifyEquals(loginPage.isWrongEmailDisplayed(), "Wrong email");
		
	}
	
	@Test
	public void User_03_Login_With_Email_Not_Register() {
		loginPage.refreshPage(driver);
		
		log.info("Login_With email not register - Step 01: Input to email textbox with email not register: " + newEmail);
		loginPage.inputToEmailTextbox(newEmail);
		
		log.info("Login_With email not register - Step 02: Input to password textbox: " + User_01_Register.password);
		loginPage.inputToPasswordTextbox(User_01_Register.password);
		
		log.info("Login_With email not register - Step 03: Click to login button");
		loginPage.clickToLoginButton();
		
		log.info("Login_With invalid email - Step 04: Verify email not register displayed");
		verifyEquals(loginPage.isLoginEmailNotRegisterDisplayed(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
		
		
	}
	
	@Test
	public void User_04_Login_With_Not_Password() {
		loginPage.refreshPage(driver);
		
		log.info("Login_With not password - Step 01: Input to email textbox: " + User_01_Register.email);
		loginPage.inputToEmailTextbox(User_01_Register.email);
		
		log.info("Login_With not password - Step 02: Input to password textbox with not password: ");
		loginPage.inputToPasswordTextbox("");
		
		log.info("Login_With not password - Step 03: Click to login button");
		loginPage.clickToLoginButton();
		
		log.info("Login_With not password - Step 04: Verify login unsuccessful displayed");
		verifyEquals(loginPage.isLoginUnsuccessfulDisplayed(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");

		
	}
	
	@Test
	public void User_05_Login_With_Wrong_Password() {
		loginPage.refreshPage(driver);
		
		log.info("Login_With wrong password - Step 01: Input to email textbox: " + User_01_Register.email);
		loginPage.inputToEmailTextbox(User_01_Register.email);
		
		log.info("Login_With wrong password - Step 02: Input to password textbox with wrong password: " + User_01_Register.smallPassword);
		loginPage.inputToPasswordTextbox(User_01_Register.smallPassword);
		
		log.info("Login_With wrong password - Step 03: Click to login button");
		loginPage.clickToLoginButton();
		
		log.info("Login_With wrong password - Step 04: Verify login unsuccessful displayed");
		verifyEquals(loginPage.isLoginUnsuccessfulDisplayed(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");

	}
	
	@Test
	public void User_06_Login_With_Email_And_Password() {
		loginPage.refreshPage(driver);
		
		log.info("Login_With email and password - Step 01: Input email textbox: " + User_01_Register.email);
		loginPage.inputToEmailTextbox(User_01_Register.email);
		
		log.info("Login_With email and password - Step 02: Input password textbox: " + User_01_Register.password);
		loginPage.inputToPasswordTextbox(User_01_Register.password);
		
		log.info("Login_With email and password - Step 03: Click to login button");
		homePage = loginPage.clickToLoginButton();
		
		log.info("Login_With email and password - Step 04: Verify login successful displayed and homepage appear");
		verifyTrue(homePage.isHomePageDisplayed());
		
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}

}
