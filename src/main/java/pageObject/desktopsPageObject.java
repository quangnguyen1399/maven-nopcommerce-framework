package pageObject;

import org.openqa.selenium.WebDriver;

import commons.abstractPage;
import pageUIs.desktopsPageUI;

public class desktopsPageObject extends abstractPage{
	WebDriver driver;
	public desktopsPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public void clickToBuildYourOwnComputerLink() {
		waitForElementClickable(driver, desktopsPageUI.BUILD_YOUR_OWN_COMPUTER_LINK);
		clickToElement(driver, desktopsPageUI.BUILD_YOUR_OWN_COMPUTER_LINK);
	}
	public void clickToAddYourReviewLink() {
		waitForElementClickable(driver, desktopsPageUI.ADD_YOUR_REVIEW_LINK);
		clickToElement(driver, desktopsPageUI.ADD_YOUR_REVIEW_LINK);
	}
	public void inputToReviewTitle(String value) {
		waitForElementVisible(driver, desktopsPageUI.REVIEW_TITLE_TEXTBOX);
		sendkeyToElement(driver, desktopsPageUI.REVIEW_TITLE_TEXTBOX, value);
		
	}
	public void inputToReviewText(String value) {
		waitForElementVisible(driver, desktopsPageUI.REVIEW_TEXT_TEXTBOX);
		sendkeyToElement(driver, desktopsPageUI.REVIEW_TEXT_TEXTBOX, value);
	}
	public void checkToRating(String value) {
		waitForElementClickable(driver, desktopsPageUI.RATING_CHECKBOX, value);
		checkToCheckboxOrRadio(driver, desktopsPageUI.RATING_CHECKBOX, value);
	}
	public void clickToSubmitReviewButton() {
		waitForElementClickable(driver, desktopsPageUI.SUBMIT_REVIEW_BUTTON);
		clickToElement(driver, desktopsPageUI.SUBMIT_REVIEW_BUTTON);
		
	}
	public myAccountPageObject clickToMyAccountLink() {
		waitForElementVisible(driver, desktopsPageUI.MYACCOUNT_LINK);
		clickToElement(driver, desktopsPageUI.MYACCOUNT_LINK);
		return PageGeneratorManager.getMyAccountPage(driver);
	}
}
