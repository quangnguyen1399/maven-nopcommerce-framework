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
import pageObject.registerPageObject;


public class User_01_Register extends abstractTest{
	WebDriver driver;
	homePageObject homePage;
	registerPageObject registerPage;
	loginPageObject loginPage;
	
	String firstname, lastname, day, month, year, company, confirmpassword;
	String existEmail, errorConfirmPassword;
	
	public static String email, password, invalidEmail, smallPassword;
	
	@Parameters({"browser", "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appurl) {
		driver = getBrowserDriver(browserName,appurl);
		
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("Pre-condition Step 01: Open Register link");
		registerPage = homePage.clickToRegisterLink();
		
		firstname = "quang";
		lastname = "nguyen";
		day = "3";
		month = "March";
		year = "1999";
		email = "quangnguyen" + getRandom() + "@gmail.com";
		company ="hutech";
		password = "123456";
		confirmpassword = "123456";
		invalidEmail ="123@.com";
		existEmail = "automationfc.vn@gmail.com";
		smallPassword = "123";
		errorConfirmPassword = "123456789";
	}
	
	
	public void User_01_Register_With_Empty_Data() {
		log.info("Register_Empty data - Step 01: Click to register button");
		registerPage.clickToRegisterButton();
		
		log.info("Register_Empty data - Step 02: Verify firtname error message");
		verifyTrue(registerPage.isFirstnameErrorDisplayed());
		
		log.info("Register_Empty data - Step 03: Verify lastname error message");
		verifyTrue(registerPage.isLastnameErrorDisplayed());
		
		log.info("Register_Empty data - Step 04: Verify email error message");
		verifyTrue(registerPage.isEmailErrorDisplayed());
		
		log.info("Register_Empty data - Step 05: Verify password error message");
		verifyTrue(registerPage.isPasswordErrorDisplayed());
		
		log.info("Register_Empty data - Step 06: Verify confirm password error message");
		verifyTrue(registerPage.isConfigPasswordErrorDisplayed());
	}
	
	
	public void User_02_Register_With_Invalid_Email() {
		registerPage.refreshPage(driver);
		
		log.info("Register_Invalid email - Step 01: Click to Male radio button");
		registerPage.clickToMaleRadioButton();
		
		log.info("Register_Invalid email - Step 02: Input firstname textbox: " + firstname);
		registerPage.inputToFirstnameTextbox(firstname);
		
		log.info("Register_Invalid email - Step 03: Input lastname textbox:" + lastname);
		registerPage.inputToLastnameTextbox(lastname);
		
		log.info("Register_Invalid email - Step 04: Selected day: " + day);
		registerPage.selectDay(day);
		
		log.info("Register_Invalid email - Step 05: Selected month: " + month);
		registerPage.selectMonth(month);
		
		log.info("Register_Invalid email - Step 06: Selected year: " + year);
		registerPage.selectYear(year);
		
		log.info("Register_Invalid email - Step 07: Input invalid email textbox: " + invalidEmail);
		registerPage.inputToEmailTextbox(invalidEmail);
		
		log.info("Register_Invalid email - Step 08: Input company textbox: " + company);
		registerPage.inputToCompanynameTextbox(company);
		
		log.info("Register_Invalid email - Step 09: Input password textbox: " + password);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(confirmpassword);
		
		log.info("Register_Invalid email - Step 10: Click to register button");
		registerPage.clickToRegisterButton();
		
		log.info("Register_Invalid email - Step 11: Verify wrong email");
		verifyEquals(registerPage.isWrongEmailDisplayed(), "Wrong email");
	}
	
	@Test
	public void User_03_Register_With_Success_Email_Password() {
		registerPage.refreshPage(driver);
		
		log.info("Register_Invalid email - Step 01: Click to Male radio button");
		registerPage.clickToMaleRadioButton();
		
		log.info("Register_Invalid email - Step 02: Input firstname textbox: " + firstname);
		registerPage.inputToFirstnameTextbox(firstname);
		
		log.info("Register_Invalid email - Step 03: Input lastname textbox:" + lastname);
		registerPage.inputToLastnameTextbox(lastname);
		
		log.info("Register_Invalid email - Step 04: Selected day: " + day);
		registerPage.selectDay(day);
		
		log.info("Register_Invalid email - Step 05: Selected month: " + month);
		registerPage.selectMonth(month);
		
		log.info("Register_Invalid email - Step 06: Selected year: " + year);
		registerPage.selectYear(year);
		
		log.info("Register_Invalid email - Step 07: Input invalid email textbox: " + email);
		registerPage.inputToEmailTextbox(email);
		
		log.info("Register_Invalid email - Step 08: Input company textbox: " + company);
		registerPage.inputToCompanynameTextbox(company);
		
		log.info("Register_Invalid email - Step 09: Input password textbox: " + password);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(confirmpassword);
		
		log.info("Register_Invalid email - Step 10: Click to register button");
		registerPage.clickToRegisterButton();
		
		log.info("Register_Invalid email - Step 11: Verify success message register");
		verifyEquals(registerPage.isSuccessMessageDisplayed(), "Your registration completed");
		
		homePage = registerPage.clickToContinueButton();
		
		homePage.clickToLogoutLink();
		
		loginPage = homePage.clickToLoginLink();
		
		registerPage = loginPage.clickToRegisterLink();
		
		
		
	}
	
	public void User_04_Register_With_Exist_Email() {
		registerPage.refreshPage(driver);
		
		log.info("Register_Invalid email - Step 01: Click to Male radio button");
		registerPage.clickToMaleRadioButton();
		
		log.info("Register_Invalid email - Step 02: Input firstname textbox: " + firstname);
		registerPage.inputToFirstnameTextbox(firstname);
		
		log.info("Register_Invalid email - Step 03: Input lastname textbox:" + lastname);
		registerPage.inputToLastnameTextbox(lastname);
		
		log.info("Register_Invalid email - Step 04: Selected day: " + day);
		registerPage.selectDay(day);
		
		log.info("Register_Invalid email - Step 05: Selected month: " +month);
		registerPage.selectMonth(month);
		
		log.info("Register_Invalid email - Step 06: Selected year: " + year);
		registerPage.selectYear(year);
		
		log.info("Register_Invalid email - Step 07: Input invalid email textbox: " + email);
		registerPage.inputToEmailTextbox(email);
		
		log.info("Register_Invalid email - Step 08: Input company textbox: " + company);
		registerPage.inputToCompanynameTextbox(company);
		
		log.info("Register_Invalid email - Step 09: Input password textbox: " + password);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(confirmpassword);
		
		log.info("Register_Invalid email - Step 10: Click to register button");
		registerPage.clickToRegisterButton();
		
		verifyEquals(registerPage.isExistsEmailDisplayed(), "The specified email already exists");
	}
	

	public void User_05_Register_With_Password_Small_6_Characters() {
		registerPage.refreshPage(driver);
		
		log.info("Register_Error password - Step 01: Click to Male radio button");
		registerPage.clickToMaleRadioButton();
		
		log.info("Register_Error password - Step 02: Input firstname textbox: " + firstname);
		registerPage.inputToFirstnameTextbox(firstname);
		
		log.info("Register_Error password - Step 03: Input lastname textbox:" + lastname);
		registerPage.inputToLastnameTextbox(lastname);
		
		log.info("Register_Error password - Step 04: Selected day: " + day);
		registerPage.selectDay(day);
		
		log.info("Register_Error password - Step 05: Selected month: " +month);
		registerPage.selectMonth(month);
		
		log.info("Register_Error password - Step 06: Selected year: " + year);
		registerPage.selectYear(year);
		
		log.info("Register_Error password - Step 07: Input invalid email textbox: " + email);
		registerPage.inputToEmailTextbox(email);
		
		log.info("Register_Error password - Step 08: Input company textbox: " + company);
		registerPage.inputToCompanynameTextbox(company);
		
		log.info("Register_Error password - Step 09: Input password textbox: " + smallPassword);
		registerPage.inputToPasswordTextbox(smallPassword);
		registerPage.inputToConfirmPasswordTextbox(smallPassword);
		
		log.info("Register_Error passwordl - Step 10: Verify Password error message displayed");
		verifyEquals(registerPage.isPasswordErrorMessageDisplayed(), "Password must meet the following rules:\nmust have at least 6 characters");	
		
	}

	
	public void User_06_Register_With_Error_Confirm_Password() {
		registerPage.refreshPage(driver);
		
		log.info("Register_Error confirm password - Step 01: Click to Male radio button");
		registerPage.clickToMaleRadioButton();
		
		log.info("Register_Error confirm password - Step 02: Input firstname textbox: " + firstname);
		registerPage.inputToFirstnameTextbox(firstname);
		
		log.info("Register_Error confirm password - Step 03: Input lastname textbox:" + lastname);
		registerPage.inputToLastnameTextbox(lastname);
		
		log.info("Register_Error confirm password- Step 04: Selected day: " + day);
		registerPage.selectDay(day);
		
		log.info("Register_Error confirm password - Step 05: Selected month: " +month);
		registerPage.selectMonth(month);
		
		log.info("Register_Error confirm password - Step 06: Selected year: " + year);
		registerPage.selectYear(year);
		
		log.info("Register_Error confirm password- Step 07: Input invalid email textbox: " + email);
		registerPage.inputToEmailTextbox(email);
		
		log.info("Register_Error confirm password - Step 08: Input company textbox: " + company);
		registerPage.inputToCompanynameTextbox(company);
		
		log.info("Register_Error confirm password - Step 09: Input password textbox: " + password);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(errorConfirmPassword);
		registerPage.clickToRegisterButton();
		
		log.info("Register_Error confirm password - Step 10: Verify confirm password do not match with password");
		verifyEquals(registerPage.isConfirmPasswordErrorMessageDisplayed(), "The password and confirmation password do not match.");
		
	}
	
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}

}
