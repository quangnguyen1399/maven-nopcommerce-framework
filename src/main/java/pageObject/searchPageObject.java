package pageObject;

import org.openqa.selenium.WebDriver;

import commons.abstractPage;
import pageUIs.searchPgaeUI;

public class searchPageObject extends abstractPage {
	WebDriver driver;
	public searchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public void clickToSearchButton() {
		waitForElementClickable(driver, searchPgaeUI.SEARCH_BUTTON);
		clickToElement(driver, searchPgaeUI.SEARCH_BUTTON);
	}
	public Object isErrorEmptyDataDisplayed() {
		waitForElementVisible(driver, searchPgaeUI.IS_ERROR_EMPTY_DATA_DISPLAYED);
		return getElementText(driver, searchPgaeUI.IS_ERROR_EMPTY_DATA_DISPLAYED);
	}
	public void inputToSearchKeywordTextbox(String value) {
		waitForElementVisible(driver, searchPgaeUI.INPUT_SEARCH_KEYWORD_TEXTBOX);
		sendkeyToElement(driver, searchPgaeUI.INPUT_SEARCH_KEYWORD_TEXTBOX, value);
		
	}
	public Object isMessageNotExitData() {
		waitForElementVisible(driver, searchPgaeUI.IS_ERROR_NOT_EXIT_DATA_DISPLAYED);
		return getElementText(driver, searchPgaeUI.IS_ERROR_NOT_EXIT_DATA_DISPLAYED);
	}
	public Object isLenovoIdeaCentre600AllInOnePC() {
		waitForElementVisible(driver, searchPgaeUI.IS_LENOVO_IDEACENTRE_600_ALL_IN_ONE_PC);
		return getElementText(driver, searchPgaeUI.IS_LENOVO_IDEACENTRE_600_ALL_IN_ONE_PC);
	}
	public Object isLenovoThinkpadX1CarbonLaptop() {
		waitForElementVisible(driver, searchPgaeUI.IS_LENOVA_THINKPAD_X1_CARBON_LAPTOP);
		return getElementText(driver, searchPgaeUI.IS_LENOVA_THINKPAD_X1_CARBON_LAPTOP);
	}
	public void clickToAdvancedSearch() {
		waitForElementClickable(driver, searchPgaeUI.ADVANCED_SEARCH_CHECKBOX);
		clickToElement(driver, searchPgaeUI.ADVANCED_SEARCH_CHECKBOX);
	}
	public void inputToCategory(String value) {
		waitForElementClickable(driver, searchPgaeUI.SELECTED_CATAGORY, value);
		clickToElement(driver, searchPgaeUI.SELECTED_CATAGORY, value);
	}
	public void clickToSubCategories() {
		waitForElementClickable(driver, searchPgaeUI.SUB_CATEGORIES_CHECKBOX);
		clickToElement(driver, searchPgaeUI.SUB_CATEGORIES_CHECKBOX);
	}
	public Object isAppleMacbookPro13inch() {
		waitForElementVisible(driver, searchPgaeUI.IS_APPLE_MACBOOK_PRO_13_INCH);
		return getElementText(driver, searchPgaeUI.IS_APPLE_MACBOOK_PRO_13_INCH);
	}
	public void inputToManufacturer(String value) {
		waitForElementClickable(driver, searchPgaeUI.SELECTED_MANUFACTURER, value);
		clickToElement(driver, searchPgaeUI.SELECTED_MANUFACTURER, value);
	}

}
