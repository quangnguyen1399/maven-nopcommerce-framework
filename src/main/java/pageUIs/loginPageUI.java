package pageUIs;

public class loginPageUI {
	public static final String REGISTER_LINK = "//a[text()='Register']";
	
	public static final String LOGIN_BUTTON = "//button[text()='Log in']";
	
	public static final String CONTINUE_BUTTON = "//a[text()='Continue']";

	
	public static final String EMPTY_DATA_ERROR_MESSAGE = "//span[text()='Please enter your email']";
	
	public static final String INPUT_EMAIL_TEXTBOX = "//input[@id='Email']";
	
	public static final String INPUT_PASSWORD_TEXTBOX = "//input[@id='Password']";
	
	public static final String IS_WRONG_EMAIL_DISPLAYED = "//span[@id='Email-error']";
	
	public static final String IS_LOGIN_EMAIL_NOT_REGISTER_DISPLAYED = "//div[@class=\"message-error validation-summary-errors\" and contains(.,\"Login was unsuccessful. Please correct the errors and try again.\") and contains(.,\"No customer account found\")]";
	
	public static final String IS_LOGIN_UNSUCCESSFUL_DISPLAYED = "//div[@class=\"message-error validation-summary-errors\" and contains(.,\"Login was unsuccessful. Please correct the errors and try again.\") and contains(.,\"The credentials provided are incorrect\")]";

	
}
