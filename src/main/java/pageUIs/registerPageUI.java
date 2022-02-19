package pageUIs;

public class registerPageUI {
	public static final String REGISTER_BUTTON = "//button[text()='Register']";
	
	public static final String FIRSTNAME_ERROR_MESSAGE = "//span[@id='FirstName-error']";
	
	public static final String LASTNAME_ERROR_MESSAGE = "//span[@id='LastName-error']";
	
	public static final String EMAIL_ERROR_MESSAGE = "//span[@id='Email-error']";
	
	public static final String PASSWORD_ERROR_MESSAGE = "//span[@id='Password-error']";
	
	public static final String CONFIRM_PASSWORD_ERROR_MESSAGE = "//span[@id='ConfirmPassword-error']";
	
	public static final String MALE_RADIO_BUTTON = "//input[@id='gender-male']";
	
	public static final String INPUT_FIRSTNAME_TEXTBOX = "//input[@id='FirstName']";

	public static final String INPUT_LASTNAME_TEXTBOX = "//input[@id='LastName']";
	
	public static final String DAY_SELECT = "//select[@name='DateOfBirthDay']/child::option[text()='%s']";
	
	public static final String MONTH_SELECT = "//select[@name='DateOfBirthMonth']/child::option[text()='%s']";
	
	public static final String YEAR_SELECT = "//select[@name='DateOfBirthYear']/child::option[text()='%s']";

	public static final String INPUT_EMAIL_TEXTBOX = "//input[@id='Email']";
	
	public static final String INPUT_COMPANY_TEXTBOX = "//input[@id='Company']";
	
	public static final String INPUT_PASSWORD_TEXTBOX = "//input[@id='Password']";
	
	public static final String INPUT_CONFIRM_PASSWORD_TEXTBOX = "//input[@id='ConfirmPassword']";
	
	public static final String WRONG_EMAIL_MESSAGE_DISPLAYED = "//span[text()='Wrong email']";
	
	public static final String EXISTS_EMAIL_MESSAGE_DISPLAYED = "//li[text()='The specified email already exists']";
	
	public static final String PASSWORD_ERROR_MESSAGE_DISPLAYED ="//span[@id=\"Password-error\" and contains(.,\"Password must meet the following rules: \") and contains(.,\"must have at least 6 characters\")]";
	
	public static final String CONFIRM_PASSWORD_ERROR_MESSAGE_DISPLAYED ="//span[@id='ConfirmPassword-error']";
	
	public static final String SUCCESS_MESSAGE_REGISTER_DISPLAYED ="//div[contains(text(),'Your registration completed')]";
	
	public static final String CONTINUE_BUTTON = "//a[text()='Continue']";
	
}
