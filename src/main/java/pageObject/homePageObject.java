package pageObject;

import org.openqa.selenium.WebDriver;

import commons.abstractPage;
import pageUIs.homePageUI;

public class homePageObject extends abstractPage {
	WebDriver driver;
	public homePageObject(WebDriver driver) {
		this.driver = driver;
	}
	public registerPageObject clickToRegisterLink() {
		waitForElementClickable(driver, homePageUI.REGISTER_LINK);
		clickToElement(driver, homePageUI.REGISTER_LINK);
		return PageGeneratorManager.getRegisterPage(driver);
	}

	public loginPageObject clickToLoginLink() {
		waitForElementClickable(driver, homePageUI.LOGIN_LINK);
		clickToElement(driver, homePageUI.LOGIN_LINK);
		return PageGeneratorManager.getLoginPage(driver);
	}
	public void clickToLogoutLink() {
		waitForElementClickable(driver, homePageUI.LOGOUT_LINK);
		clickToElement(driver, homePageUI.LOGOUT_LINK);
	}
	public boolean isHomePageDisplayed() {
		waitForElementVisible(driver, homePageUI.IMG_NOPCOMMERCE_LINK);
		return isElementDisplayed(driver, homePageUI.IMG_NOPCOMMERCE_LINK);
	}
	public desktopsPageObject clickToDesktopsLink() {
		waitForElementVisible(driver, homePageUI.COMPUTER_LINK);
		hoverToElement(driver, homePageUI.COMPUTER_LINK);
		waitForElementClickable(driver, homePageUI.DESKTOPS_LINK);
		clickToElement(driver, homePageUI.DESKTOPS_LINK);
		return PageGeneratorManager.getDesktopsPage(driver);
	}
	public searchPageObject clickToSearchLink() {
		waitForElementClickable(driver, homePageUI.SEARCH_LINK);
		clickToElement(driver, homePageUI.SEARCH_LINK);
		return PageGeneratorManager.getSearchPage(driver);
	}


}
