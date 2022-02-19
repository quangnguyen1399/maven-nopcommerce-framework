package pageObject;

import org.openqa.selenium.WebDriver;

import commons.abstractPage;
import pageUIs.homePageUI;
import pageUIs.loginPageUI;
import pageUIs.myAccountPageUI;

public class loginPageObject extends abstractPage {
	WebDriver driver;
	public loginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public registerPageObject clickToRegisterLink() {
		waitForElementClickable(driver, homePageUI.REGISTER_LINK);
		clickToElement(driver, homePageUI.REGISTER_LINK);
		return PageGeneratorManager.getRegisterPage(driver);
	}
	public homePageObject clickToLoginButton() {
		waitForElementClickable(driver, loginPageUI.LOGIN_BUTTON);
		clickToElement(driver, loginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getHomePage(driver);
	}
	public Object isEmptyDataErrorMessage() {
		waitForElementVisible(driver, loginPageUI.EMPTY_DATA_ERROR_MESSAGE);
		return getElementText(driver, loginPageUI.EMPTY_DATA_ERROR_MESSAGE);
	}
	public void inputToEmailTextbox(String invalidEmail) {
		waitForElementVisible(driver, loginPageUI.INPUT_EMAIL_TEXTBOX);
		sendkeyToElement(driver, loginPageUI.INPUT_EMAIL_TEXTBOX, invalidEmail);
		
	}
	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, loginPageUI.INPUT_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, loginPageUI.INPUT_PASSWORD_TEXTBOX, password);
	}
	public Object isWrongEmailDisplayed() {
		waitForElementVisible(driver, loginPageUI.IS_WRONG_EMAIL_DISPLAYED);
		return getElementText(driver, loginPageUI.IS_WRONG_EMAIL_DISPLAYED);
	}
	public Object isLoginUnsuccessfulDisplayed() {
		waitForElementVisible(driver, loginPageUI.IS_LOGIN_UNSUCCESSFUL_DISPLAYED);
		return getElementText(driver, loginPageUI.IS_LOGIN_UNSUCCESSFUL_DISPLAYED);
	}
	public Object isLoginEmailNotRegisterDisplayed() {
		waitForElementVisible(driver, loginPageUI.IS_LOGIN_EMAIL_NOT_REGISTER_DISPLAYED);
		return getElementText(driver, loginPageUI.IS_LOGIN_EMAIL_NOT_REGISTER_DISPLAYED);
	}
	public myAccountPageObject clickToContinueButton() {
		waitForElementClickable(driver, loginPageUI.CONTINUE_BUTTON);
		clickToElement(driver, loginPageUI.CONTINUE_BUTTON);
		return PageGeneratorManager.getMyAccountPage(driver);
	}
	public myAccountPageObject clickToMyAccountLink() {
		waitForElementClickable(driver, myAccountPageUI.MYACCOUNT_LINK);
		clickToElement(driver, myAccountPageUI.MYACCOUNT_LINK);
		return PageGeneratorManager.getMyAccountPage(driver);
	}
	
	

}
