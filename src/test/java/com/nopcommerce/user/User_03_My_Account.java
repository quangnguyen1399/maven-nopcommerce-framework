package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.abstractTest;
import pageObject.PageGeneratorManager;
import pageObject.desktopsPageObject;
import pageObject.homePageObject;
import pageObject.loginPageObject;
import pageObject.myAccountPageObject;

public class User_03_My_Account extends abstractTest{
	WebDriver driver;
	homePageObject homePage;
	loginPageObject loginPage;
	myAccountPageObject myAccountPage;
	desktopsPageObject desktopsPage;
	
	String newFirstName, newLastName, newDate, newMonth, newYear, newemail, newCompany ;
	
	String addressFirtName, addressLastName, addressEmail, addressCompany, addressCountry, addressState, addressCity, address1, address2, addressZip, addressPhoneNumber, addressFaxNumber;
	
	String newPassword = "quangnguyen";
	@Parameters({"browser", "url"})
	@BeforeClass()
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
		
		log.info("Pre-condition Step 06: Click and open my account link");
		myAccountPage = loginPage.clickToMyAccountLink();
		
	}
	
	@Test
	public void MyAccount_01_Customer_Infor() {
		newemail ="automationfc" + getRandom() + ".vn@gmail.com";
		newFirstName = "automation";
		newLastName = "FC";
		newDate = "1";
		newMonth ="January";
		newYear ="1999";
		newCompany ="Automation FC";
		
		log.info("MyAccount_Customer infor - Step 01: Click to female radio button");
		myAccountPage.clickToFemaleRadioButton();
		
		log.info("MyAccount_Customer infor - Step 02: Change firt name textbox: " +newFirstName);
		myAccountPage.inputToFirstnameTextbox(newFirstName);
		
		log.info("MyAccount_Customer infor - Step 03: Change last name textbox: " +newLastName);
		myAccountPage.inputToLastnameTextbox(newLastName);
		
		log.info("MyAccount_Customer infor - Step 04: Select new date: "+newDate);
		myAccountPage.selectDay(newDate);
		
		log.info("MyAccount_Customer infor - Step 05: Select new month: "+newMonth);
		myAccountPage.selectMonth(newMonth);
		
		log.info("MyAccount_Customer infor - Step 06: Select new year: "+newYear);
		myAccountPage.selectYear(newYear);
		
		log.info("MyAccount_Customer infor - Step 07: Change email textbox: "+ newemail);
		myAccountPage.inputToEmailTextbox(newemail);
		
		log.info("MyAccount_Customer infor - Step 08: Change company name textbox: "+ newCompany);
		myAccountPage.inputToCompanynameTextbox(newCompany);
		
		log.info("MyAccount_Customer infor - Step 09: Click to save button");
		myAccountPage.clickToSaveButton();
		
		log.info("MyAccount_Customer infor - Step 10: verify female radio button displayed");
		verifyTrue(myAccountPage.isFemaleDisplayed());
		
		log.info("MyAccount_Customer infor - Step 11: verify new firt name displayed: " + newFirstName);
		verifyEquals(myAccountPage.isFirstnameDisplayed(), newFirstName);
		
		log.info("MyAccount_Customer infor - Step 12: verify new last name displayed: " + newLastName);
		verifyEquals(myAccountPage.isLastnameDisplayed(), newLastName);

		log.info("MyAccount_Customer infor - Step 13: verify new date displayed: " + newDate);
		verifyEquals(myAccountPage.isDayDisplayed(), newDate);

		log.info("MyAccount_Customer infor - Step 14: verify new month displayed: " + newMonth);
		verifyEquals(myAccountPage.isMonthDisplayed(), newMonth);

		log.info("MyAccount_Customer infor - Step 15: verify new year displayed: " + newYear);
		verifyEquals(myAccountPage.isYearDisplayed(), newYear);
		
		log.info("MyAccount_Customer infor - Step 16: verify new email displayed: " + newemail);
		verifyEquals(myAccountPage.isEmailDisplayed(), newemail);
		
		log.info("MyAccount_Customer infor - Step 17: verify new company displayed: " + newCompany);
		verifyEquals(myAccountPage.isCompanynameDisplayed(), newCompany);

	}
	
	@Test
	public void MyAccount_02_Addresses() {
		addressFirtName="Automation";
		addressLastName="FC";
		addressEmail="automationfc.vn@gmail.com";
		addressCompany="Automation FC";
		addressCountry="Viet Nam";
		addressState="Other";
		addressCity="Da Nang";
		address1="123/04 Le Lai";
		address2="234/05 Hai Phong";
		addressZip="55000";
		addressPhoneNumber="0123456789";
		addressFaxNumber="0944248240";
		log.info("MyAccount_Addresses infor - Step 01: click to Addresses");
		myAccountPage.clickToAddresses();
		
		log.info("MyAccount_Addresses infor - Step 02: click to add new button");
		myAccountPage.clickToAddNewButton();
		
		log.info("MyAccount_Addresses infor - Step 03: input Address Firstname: " + addressFirtName);
		myAccountPage.inputAddressFirstName(addressFirtName);
		
		log.info("MyAccount_Addresses infor - Step 04: input Address Lastname: " + addressLastName);
		myAccountPage.inputAddressLastName(addressLastName);
		
		log.info("MyAccount_Addresses infor - Step 05: input Email: " + addressEmail);
		myAccountPage.inputAddressEmail(addressEmail);
		
		log.info("MyAccount_Addresses infor - Step 06: input Company: " + addressCompany);
		myAccountPage.inputAddressCompany(addressCompany);
		
		log.info("MyAccount_Addresses infor - Step 07: input Country: " + addressCountry);
		myAccountPage.selectAddressCountry(addressCountry);
		
		log.info("MyAccount_Addresses infor - Step 08: input State: " + addressState);
		myAccountPage.selectAddressState(addressState);
		
		log.info("MyAccount_Addresses infor - Step 09: input City: " + addressCity);
		myAccountPage.inputAddressCity(addressCity);
		
		log.info("MyAccount_Addresses infor - Step 10: input address 1: " + address1);
		myAccountPage.inputAddress1(address1);
		
		log.info("MyAccount_Addresses infor - Step 11: input address 2: " + address2);
		myAccountPage.inputAddress2(address2);
		
		log.info("MyAccount_Addresses infor - Step 12: input Zip: " + addressZip);
		myAccountPage.inputAddressZip(addressZip);
		
		log.info("MyAccount_Addresses infor - Step 13: input Phone number: " + addressPhoneNumber);
		myAccountPage.inputAddressPhoneNumber(addressPhoneNumber);
		
		log.info("MyAccount_Addresses infor - Step 14: input Fax number: " + addressFaxNumber);
		myAccountPage.inputAddressFaxNumber(addressFaxNumber);
		
		log.info("MyAccount_Addresses infor - Step 15: click to Address Save Button");
		myAccountPage.clickToAddressSaveButton();
		
		log.info("MyAccount_Addresses infor - Step 16: verify name is displayed.");
		String name=addressFirtName + " " + addressLastName;
		verifyEquals(myAccountPage.isNameDisplayed(name), name);

	}
	
	@Test
	public void MyAccount_03_Change_Password() {
		log.info("MyAccount_Change Pasword infor - Step 01: click to change password ");
		myAccountPage.clickToChangePassword();
		
		log.info("MyAccount_Change Pasword infor - Step 02: input old password: " + User_01_Register.password);
		myAccountPage.inputToOldPassword(User_01_Register.password);
		
		log.info("MyAccount_Change Pasword infor - Step 03: input new password: " + newPassword);
		myAccountPage.inputToNewPassword(newPassword);

		log.info("MyAccount_Change Pasword infor - Step 04: input confirm password: " + newPassword);
		myAccountPage.inputToNewConfirmPassword(newPassword);
		
		log.info("MyAccount_Change Pasword infor - Step 05: click to change password button.");
		myAccountPage.clickToChangePasswordButton();
		
	}
	
	@Test
	public void MyAccount_04_Myproduct_Reviews() {
		String reviewTitle = "quang nguyen";
		String reviewText = "good product!!!!!!!!!!!";
		
		log.info("MyAccount_Myproduct Reviews infor - Step 01: click to logo Nop Commerce");
		homePage= myAccountPage.clickToNopCommerceLink();
		
		log.info("MyAccount_Myproduct Reviews infor - Step 02: click to Desktops link on menu");
		desktopsPage = homePage.clickToDesktopsLink();
		
		log.info("MyAccount_Myproduct Reviews infor - Step 03: click to build your own computer");
		desktopsPage.clickToBuildYourOwnComputerLink();
		
		log.info("MyAccount_Myproduct Reviews infor - Step 04: click to add your review link");
		desktopsPage.clickToAddYourReviewLink();
		
		log.info("MyAccount_Myproduct Reviews infor - Step 05: input to review title: " + reviewTitle);
		desktopsPage.inputToReviewTitle(reviewTitle);
		
		log.info("MyAccount_Myproduct Reviews infor - Step 06: input to review text: " + reviewText);
		desktopsPage.inputToReviewText(reviewText);
		
		log.info("MyAccount_Myproduct Reviews infor - Step 07: click to rating with 5 start");
		desktopsPage.checkToRating("5");
		
		log.info("MyAccount_Myproduct Reviews infor - Step 08: click to submit review button");
		desktopsPage.clickToSubmitReviewButton();
		
		log.info("MyAccount_Myproduct Reviews infor - Step 09: click to my account link");
		myAccountPage = desktopsPage.clickToMyAccountLink();
		
		log.info("MyAccount_Myproduct Reviews infor - Step 10: click to my product review link");
		myAccountPage.clickToMyproductsReviewsLink();
		
		log.info("MyAccount_Myproduct Reviews infor - Step 11: verify information review.");
		verifyEquals(myAccountPage.isReviewTitleDisplayed(reviewTitle), reviewTitle);
		verifyEquals(myAccountPage.isReviewTextDisplayed(reviewText), reviewText);
		
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}

}
