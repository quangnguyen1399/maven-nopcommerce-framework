package pageObject;

import org.openqa.selenium.WebDriver;



public class PageGeneratorManager {
	
	public static registerPageObject getRegisterPage(WebDriver driver) {
		return new registerPageObject(driver);
	}
	public static homePageObject getHomePage(WebDriver driver) {
		return new homePageObject(driver);
	}
	public static loginPageObject getLoginPage(WebDriver driver) {
		return new loginPageObject(driver);
	}
	public static myAccountPageObject getMyAccountPage(WebDriver driver) {
		return new myAccountPageObject(driver);
	}
	public static desktopsPageObject getDesktopsPage(WebDriver driver) {
		return new desktopsPageObject(driver);
	}
	public static searchPageObject getSearchPage(WebDriver driver) {
		return new searchPageObject(driver);
	}
}
