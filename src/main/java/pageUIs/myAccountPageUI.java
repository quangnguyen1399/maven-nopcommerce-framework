package pageUIs;

public class myAccountPageUI {
	public static final String MYACCOUNT_LINK = "//a[text()='My account']";
	public static final String FEMALE_RADIO_BUTTON = "//input[@id='gender-female']";
	public static final String INPUT_FIRSTNAME_TEXTBOX = "//input[@id='FirstName']";
	public static final String INPUT_LASTNAME_TEXTBOX = "//input[@id='LastName']";
	public static final String DAY_SELECT = "//select[@name='DateOfBirthDay']/child::option[text()='%s']";
	public static final String MONTH_SELECT = "//select[@name='DateOfBirthMonth']/child::option[text()='%s']";
	public static final String YEAR_SELECT = "//select[@name='DateOfBirthYear']/child::option[text()='%s']";
	public static final String INPUT_EMAIL_TEXTBOX = "//input[@id='Email']";
	public static final String INPUT_COMPANY_TEXTBOX = "//input[@id='Company']";
	public static final String SAVE_BUTTON = "//button[@id='save-info-button']";

	public static final String IS_FEMALE_DISPLAYED = "//input[@id='gender-female']";
	public static final String IS_FIRSTNAME_DISPLAYED = "//input[@id='FirstName']";
	public static final String IS_LASTNAME_DISPLAYED = "//input[@id='LastName']";
	public static final String IS_DATE_DISPLAYED = "//select[@name='DateOfBirthDay']/child::option[text()='1']";
	public static final String IS_MONTH_DISPLAYED = "//select[@name='DateOfBirthMonth']/child::option[text()='January']";
	public static final String IS_YEAR_DISPLAYED = "//select[@name='DateOfBirthYear']/child::option[text()='1999']";
	public static final String IS_EMAIL_DISPLAYED = "//input[@id='Email']";
	public static final String IS_COMPANY_DISPLAYED = "//input[@value='Automation FC']";
	
	public static final String ADDRESSES = "//li[@class='customer-addresses inactive']/a[text()='Addresses']";
	public static final String ADD_NEW_BUTTON = "//button[text()='Add new']";
	
	public static final String INPUT_ADDRESS_FIRSTNAME_TEXTBOX = "//input[@id='Address_FirstName']";
	public static final String INPUT_ADDRESS_LASTNAME_TEXTBOX = "//input[@id='Address_LastName']";
	public static final String INPUT_ADDRESS_EMAIL_TEXTBOX = "//input[@id='Address_Email']";
	public static final String INPUT_ADDRESS_COMPANY_TEXTBOX = "//input[@id='Address_Company']";
	public static final String ADDRESS_COUNTRY_SELECT = "//select[@id='Address_CountryId']/child::option[text()='%s']";
	public static final String ADDRESS_STATE_SELECT = "//select[@id='Address_StateProvinceId']/child::option[text()='%s']";
	public static final String INPUT_ADDRESS_CITY_TEXTBOX = "//input[@id='Address_City']";
	public static final String INPUT_ADDRESS_1_TEXTBOX = "//input[@id='Address_Address1']";
	public static final String INPUT_ADDRESS_2_TEXTBOX = "//input[@id='Address_Address2']";
	public static final String INPUT_ADDRESS_Zip_TEXTBOX = "//input[@id='Address_ZipPostalCode']";
	public static final String INPUT_ADDRESS_PHONE_NUMBER_TEXTBOX = "//input[@id='Address_PhoneNumber']";
	public static final String INPUT_ADDRESS_FAX_NUMBER_TEXTBOX = "//input[@id='Address_FaxNumber']";
	public static final String ADDRESS_SAVE_BUTTON = "//button[text()='Save']";
	
	public static final String IS_ADDRESS_NAME_INFOR_DISPLAYED = "//strong[text()='%s']";
	
	public static final String CHANGE_PASSWORD = "//li[@class='change-password inactive']/a[text()='Change password']";
	
	public static final String INPUT_OLD_PASSWORD_TEXTBOX = "//input[@id='OldPassword']";
	public static final String INPUT_NEW_PASSWORD_TEXTBOX = "//input[@id='NewPassword']";
	public static final String INPUT_NEW_CONFIRM_PASSWORD_TEXTBOX = "//input[@id='ConfirmNewPassword']";
	public static final String CHANGE_PASSWORD_BUTTON = "//button[text()='Change password']";
	
	public static final String NOPCOMMERCE_LINK = "//img[@alt='nopCommerce demo store']";
	
	public static final String MY_PRODUCT_REVIEWS_LINK = "//a[text()='My product reviews']";
	public static final String IS_REVIEW_TITLE_DISPLAYED = "//strong[text()='%s']";
	public static final String IS_REVIEW_TEXT_DISPLAYED = "//div[text()='%s']";

	
}
