package pageObject;

import org.openqa.selenium.WebDriver;

import commons.abstractPage;
import pageUIs.myAccountPageUI;

public class myAccountPageObject extends abstractPage{
	WebDriver driver;
	public myAccountPageObject(WebDriver driver) {
		this.driver =driver;
	}
	
	public void clickToFemaleRadioButton() {
		waitForElementClickable(driver, myAccountPageUI.FEMALE_RADIO_BUTTON);
		checkToCheckboxOrRadio(driver, myAccountPageUI.FEMALE_RADIO_BUTTON);
	}

	public void inputToFirstnameTextbox(String firstname) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_FIRSTNAME_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_FIRSTNAME_TEXTBOX, firstname);
	}

	public void inputToLastnameTextbox(String lastname) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_LASTNAME_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_LASTNAME_TEXTBOX, lastname);
	}

	public void selectDay(String day) {
		waitForElementClickable(driver, myAccountPageUI.DAY_SELECT, day);
		clickToElement(driver, myAccountPageUI.DAY_SELECT, day);
	}

	public void selectMonth(String month) {
		waitForElementClickable(driver, myAccountPageUI.MONTH_SELECT, month);
		clickToElement(driver, myAccountPageUI.MONTH_SELECT, month);
	}

	public void selectYear(String year) {
		waitForElementClickable(driver, myAccountPageUI.YEAR_SELECT, year);
		clickToElement(driver, myAccountPageUI.YEAR_SELECT, year);
	}

	public void inputToEmailTextbox(String invalidEmail) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_EMAIL_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_EMAIL_TEXTBOX, invalidEmail);
	}

	public void inputToCompanynameTextbox(String company) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_COMPANY_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_COMPANY_TEXTBOX, company);
	}

	public void clickToSaveButton() {
		waitForElementClickable(driver, myAccountPageUI.SAVE_BUTTON);
		clickToElement(driver, myAccountPageUI.SAVE_BUTTON);
		
	}

	public boolean isFemaleDisplayed() {
		waitForElementVisible(driver, myAccountPageUI.IS_FEMALE_DISPLAYED);
		return isElementSelected(driver, myAccountPageUI.IS_FEMALE_DISPLAYED);
	}

	public Object isFirstnameDisplayed() {
		waitForElementVisible(driver, myAccountPageUI.IS_FIRSTNAME_DISPLAYED);
		return getElementAttributeValue(driver, myAccountPageUI.IS_FIRSTNAME_DISPLAYED);
	}

	public Object isLastnameDisplayed() {
		waitForElementVisible(driver, myAccountPageUI.IS_LASTNAME_DISPLAYED);
		return getElementAttributeValue(driver, myAccountPageUI.IS_LASTNAME_DISPLAYED);
	}

	public Object isDayDisplayed() {
		waitForElementVisible(driver, myAccountPageUI.IS_DATE_DISPLAYED);
		return getElementAttributeValue(driver, myAccountPageUI.IS_DATE_DISPLAYED);
	}

	public Object isMonthDisplayed() {
		waitForElementVisible(driver, myAccountPageUI.IS_MONTH_DISPLAYED);
		return getElementText(driver, myAccountPageUI.IS_MONTH_DISPLAYED);
	}

	public Object isYearDisplayed() {
		waitForElementVisible(driver, myAccountPageUI.IS_YEAR_DISPLAYED);
		return getElementAttributeValue(driver, myAccountPageUI.IS_YEAR_DISPLAYED);
	}

	public Object isEmailDisplayed() {
		waitForElementVisible(driver, myAccountPageUI.IS_EMAIL_DISPLAYED);
		return getElementAttributeValue(driver, myAccountPageUI.IS_EMAIL_DISPLAYED);
	}

	public Object isCompanynameDisplayed() {
		waitForElementVisible(driver, myAccountPageUI.IS_COMPANY_DISPLAYED);
		return getElementAttributeValue(driver, myAccountPageUI.IS_COMPANY_DISPLAYED);
	}

	public void clickToAddresses() {
		waitForElementClickable(driver, myAccountPageUI.ADDRESSES);
		clickToElement(driver, myAccountPageUI.ADDRESSES);
	}

	public void clickToAddNewButton() {
		waitForElementClickable(driver, myAccountPageUI.ADD_NEW_BUTTON);
		clickToElement(driver, myAccountPageUI.ADD_NEW_BUTTON);
	}
	
	//Address
	
	public void inputAddressFirstName(String addressFirtName) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_ADDRESS_FIRSTNAME_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_ADDRESS_FIRSTNAME_TEXTBOX, addressFirtName);
	}
	
	public void inputAddressLastName(String addressLastName) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_ADDRESS_LASTNAME_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_ADDRESS_LASTNAME_TEXTBOX, addressLastName);
	}

	public void inputAddressEmail(String addressEmail) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_ADDRESS_EMAIL_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_ADDRESS_EMAIL_TEXTBOX, addressEmail);
	}

	public void inputAddressCompany(String addressCompany) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_ADDRESS_COMPANY_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_ADDRESS_COMPANY_TEXTBOX, addressCompany);
	}

	public void selectAddressCountry(String addressCountry) {
		waitForElementClickable(driver, myAccountPageUI.ADDRESS_COUNTRY_SELECT, addressCountry);
		clickToElement(driver, myAccountPageUI.ADDRESS_COUNTRY_SELECT, addressCountry);
	}

	public void selectAddressState(String addressState) {
		waitForElementClickable(driver, myAccountPageUI.ADDRESS_STATE_SELECT, addressState);
		clickToElement(driver, myAccountPageUI.ADDRESS_STATE_SELECT, addressState);
	}

	public void inputAddressCity(String addressCity) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_ADDRESS_CITY_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_ADDRESS_CITY_TEXTBOX, addressCity);
	}

	public void inputAddress1(String address1) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_ADDRESS_1_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_ADDRESS_1_TEXTBOX, address1);
	}

	public void inputAddress2(String address2) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_ADDRESS_2_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_ADDRESS_2_TEXTBOX, address2);
	}

	public void inputAddressZip(String addressZip) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_ADDRESS_Zip_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_ADDRESS_Zip_TEXTBOX, addressZip);
	}

	public void inputAddressPhoneNumber(String addressPhoneNumber) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_ADDRESS_PHONE_NUMBER_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_ADDRESS_PHONE_NUMBER_TEXTBOX, addressPhoneNumber);
	}

	public void inputAddressFaxNumber(String addressFaxNumber) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_ADDRESS_FAX_NUMBER_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_ADDRESS_FAX_NUMBER_TEXTBOX, addressFaxNumber);
	}

	public void clickToAddressSaveButton() {
		waitForElementClickable(driver, myAccountPageUI.ADDRESS_SAVE_BUTTON);
		clickToElement(driver, myAccountPageUI.ADDRESS_SAVE_BUTTON);
	}

	public Object isNameDisplayed(String name) {
		waitForElementVisible(driver, myAccountPageUI.IS_ADDRESS_NAME_INFOR_DISPLAYED, name);
		return getElementText(driver, myAccountPageUI.IS_ADDRESS_NAME_INFOR_DISPLAYED, name);
	}

	//Change password
	
	public void clickToChangePassword() {
		waitForElementClickable(driver, myAccountPageUI.CHANGE_PASSWORD);
		clickToElement(driver, myAccountPageUI.CHANGE_PASSWORD);
	}

	public void inputToOldPassword(String password) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_OLD_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_OLD_PASSWORD_TEXTBOX, password);
	}

	public void inputToNewPassword(String newPassword) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_NEW_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_NEW_PASSWORD_TEXTBOX, newPassword);
	}

	public void inputToNewConfirmPassword(String newPassword) {
		waitForElementVisible(driver, myAccountPageUI.INPUT_NEW_CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, myAccountPageUI.INPUT_NEW_CONFIRM_PASSWORD_TEXTBOX, newPassword);
	}

	public void clickToChangePasswordButton() {
		waitForElementClickable(driver, myAccountPageUI.CHANGE_PASSWORD_BUTTON);
		clickToElement(driver, myAccountPageUI.CHANGE_PASSWORD_BUTTON);
	}

	public homePageObject clickToNopCommerceLink() {
		waitForElementClickable(driver, myAccountPageUI.NOPCOMMERCE_LINK);
		clickToElement(driver, myAccountPageUI.NOPCOMMERCE_LINK);
		return PageGeneratorManager.getHomePage(driver);
	}

	public void clickToMyproductsReviewsLink() {
		waitForElementClickable(driver, myAccountPageUI.MY_PRODUCT_REVIEWS_LINK);
		clickToElement(driver, myAccountPageUI.MY_PRODUCT_REVIEWS_LINK);
	}

	public Object isReviewTitleDisplayed(String reviewTitle) {
		waitForElementVisible(driver, myAccountPageUI.IS_REVIEW_TITLE_DISPLAYED, reviewTitle);
		return getElementText(driver, myAccountPageUI.IS_REVIEW_TITLE_DISPLAYED, reviewTitle);
	}

	public Object isReviewTextDisplayed(String reviewText) {
		waitForElementVisible(driver, myAccountPageUI.IS_REVIEW_TEXT_DISPLAYED, reviewText);
		return getElementText(driver, myAccountPageUI.IS_REVIEW_TEXT_DISPLAYED, reviewText);
	}
	
	


}
