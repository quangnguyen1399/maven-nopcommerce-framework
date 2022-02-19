package pageObject;

import org.openqa.selenium.WebDriver;

import commons.abstractPage;
import pageUIs.registerPageUI;

public class registerPageObject extends abstractPage{
	WebDriver driver;
	public registerPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickToRegisterButton() {
		waitForElementClickable(driver, registerPageUI.REGISTER_BUTTON);
		clickToElement(driver, registerPageUI.REGISTER_BUTTON);
	}
	
	public boolean isFirstnameErrorDisplayed() {
		waitForElementVisible(driver, registerPageUI.FIRSTNAME_ERROR_MESSAGE);
		return isElementDisplayed(driver, registerPageUI.FIRSTNAME_ERROR_MESSAGE);
	}
	public boolean isLastnameErrorDisplayed() {
		waitForElementVisible(driver, registerPageUI.LASTNAME_ERROR_MESSAGE);
		return isElementDisplayed(driver, registerPageUI.LASTNAME_ERROR_MESSAGE);
	}
	public boolean isEmailErrorDisplayed() {
		waitForElementVisible(driver, registerPageUI.EMAIL_ERROR_MESSAGE);
		return isElementDisplayed(driver, registerPageUI.EMAIL_ERROR_MESSAGE);
	}
	public boolean isPasswordErrorDisplayed() {
		waitForElementVisible(driver, registerPageUI.PASSWORD_ERROR_MESSAGE);
		return isElementDisplayed(driver, registerPageUI.PASSWORD_ERROR_MESSAGE);
	}
	public boolean isConfigPasswordErrorDisplayed() {
		waitForElementVisible(driver, registerPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return isElementDisplayed(driver, registerPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	public void clickToMaleRadioButton() {
		waitForElementClickable(driver, registerPageUI.MALE_RADIO_BUTTON);
		clickToElement(driver, registerPageUI.MALE_RADIO_BUTTON);
	}

	public void inputToFirstnameTextbox(String firstname) {
		waitForElementVisible(driver, registerPageUI.INPUT_FIRSTNAME_TEXTBOX);
		sendkeyToElement(driver, registerPageUI.INPUT_FIRSTNAME_TEXTBOX, firstname);
	}

	public void inputToLastnameTextbox(String lastname) {
		waitForElementVisible(driver, registerPageUI.INPUT_LASTNAME_TEXTBOX);
		sendkeyToElement(driver, registerPageUI.INPUT_LASTNAME_TEXTBOX, lastname);
	}

	public void selectDay(String day) {
		waitForElementClickable(driver, registerPageUI.DAY_SELECT, day);
		clickToElement(driver, registerPageUI.DAY_SELECT, day);
	}

	public void selectMonth(String month) {
		waitForElementClickable(driver, registerPageUI.MONTH_SELECT, month);
		clickToElement(driver, registerPageUI.MONTH_SELECT, month);
	}

	public void selectYear(String year) {
		waitForElementClickable(driver, registerPageUI.YEAR_SELECT, year);
		clickToElement(driver, registerPageUI.YEAR_SELECT, year);
	}

	public void inputToEmailTextbox(String invalidEmail) {
		waitForElementVisible(driver, registerPageUI.INPUT_EMAIL_TEXTBOX);
		sendkeyToElement(driver, registerPageUI.INPUT_EMAIL_TEXTBOX, invalidEmail);
	}

	public void inputToCompanynameTextbox(String company) {
		waitForElementVisible(driver, registerPageUI.INPUT_COMPANY_TEXTBOX);
		sendkeyToElement(driver, registerPageUI.INPUT_COMPANY_TEXTBOX, company);
		
	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, registerPageUI.INPUT_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, registerPageUI.INPUT_PASSWORD_TEXTBOX, password);
		
	}

	public void inputToConfirmPasswordTextbox(String confirmpassword) {
		waitForElementVisible(driver, registerPageUI.INPUT_CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, registerPageUI.INPUT_CONFIRM_PASSWORD_TEXTBOX, confirmpassword);
		
	}

	public Object isWrongEmailDisplayed() {
		waitForElementVisible(driver, registerPageUI.WRONG_EMAIL_MESSAGE_DISPLAYED);
		return getElementText(driver, registerPageUI.WRONG_EMAIL_MESSAGE_DISPLAYED);
	}

	public Object isExistsEmailDisplayed() {
		waitForElementVisible(driver, registerPageUI.EXISTS_EMAIL_MESSAGE_DISPLAYED);
		return getElementText(driver, registerPageUI.EXISTS_EMAIL_MESSAGE_DISPLAYED);
	}

	public Object isPasswordErrorMessageDisplayed() {
		waitForElementVisible(driver, registerPageUI.PASSWORD_ERROR_MESSAGE_DISPLAYED);
		return getElementText(driver, registerPageUI.PASSWORD_ERROR_MESSAGE_DISPLAYED);
	}

	public Object isConfirmPasswordErrorMessageDisplayed() {
		waitForElementVisible(driver, registerPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE_DISPLAYED);
		return getElementText(driver, registerPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE_DISPLAYED);
	}

	public Object isSuccessMessageDisplayed() {
		waitForElementVisible(driver, registerPageUI.SUCCESS_MESSAGE_REGISTER_DISPLAYED);
		return getElementText(driver, registerPageUI.SUCCESS_MESSAGE_REGISTER_DISPLAYED);
	}

	public homePageObject clickToContinueButton() {
		waitForElementClickable(driver, registerPageUI.CONTINUE_BUTTON);
		clickToElement(driver, registerPageUI.CONTINUE_BUTTON);
		return PageGeneratorManager.getHomePage(driver);
	}

}
