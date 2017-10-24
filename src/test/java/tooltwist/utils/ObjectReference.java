package tooltwist.utils;

public class ObjectReference {

	//Google
	public static String GOOGLE_LOGO = "//*[@id='hplogo']";
	public static String GOOGLE_PH = "//*[@id='hplogo']/div";
	public static String SLAS = "//*[@id='sb_ifc0']";
	public static String EMAIL_FIELD = "//*[@id='identifierId']";
	public static String EMAIL_NEXT = "//*[@id='identifierNext']/content/span";
	public static String EMAIL_PASSWORD = "//*[@id='password']/div[1]/div/div[1]/input";
	public static String EMAIL_SIGNIN = "//*[@id='passwordNext']/content/span";
	public static String SIGNIN_ISSUCC = "//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span";
	
	//dev_studylane_build_verification
	public static String dev_SL_BV = "/html/body/div[3]/div[8]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/span/p/span";
	//dev_studylane_signUpFields
	public static String dev_SL_SIGNUP_FNAME = "/html/body/div[3]/div[4]/div/div/div/div/form/div/div[5]/div/div[1]/input";
	public static String dev_SL_SIGNUP_LNAME = "/html/body/div[3]/div[4]/div/div/div/div/form/div/div[6]/div/div[1]/input";
	public static String dev_SL_SIGNUP_EMAILAD = "/html/body/div[3]/div[4]/div/div/div/div/form/div/div[7]/div/div[1]/input";
	public static String dev_SL_SIGNUP_REENTEREMAILAD = "/html/body/div[3]/div[4]/div/div/div/div/form/div/div[8]/div/div[1]/input";
	public static String dev_SL_SIGNUP_PASSWORD = "/html/body/div[3]/div[4]/div/div/div/div/form/div/div[9]/div/div[1]/input";
	public static String dev_SL_SIGNUP_REENTERPASSWORD = "/html/body/div[3]/div[4]/div/div/div/div/form/div/div[10]/div/div[1]/input";
	public static String dev_SL_SIGNUP_COUNTRYDROPDOWN = "/html/body/div[3]/div[4]/div/div/div/div/form/div/div[11]/div/div[1]/select";
	//dev_studylane_healthcheck
	public static String dev_SL_HEALTHCHECK = "/html/body/pre";
	//dev_studylane_signup
	public static String dev_SL_SIGNUP_SIGNUPBTN = "/html/body/div[3]/div[4]/div/div/div/div/form/div/div[13]/button";
	//dev_studylane_login
	public static String dev_SL_LOGIN_EMAIL = "//*[@id='loginPage-form']/div[1]/div/div/div[1]/input";
	public static String dev_SL_LOGIN_PASSWORD = "//*[@id='loginPage-form']/div[2]/div/div/div[1]/input";
	public static String dev_SL_LOGIN_BUTTON = "//*[@id='loginPage-form']/div[3]/button";
	//dev_studylane_myProfile - accordion headers
	public static String dev_SL_PROFILE_PERSONAL = "/html/body/div[3]/div[3]/div/div[2]/div[4]/div/manage-student-form/div[2]/div[2]/form/fieldset/div[1]";
	public static String dev_SL_PROFILE_PASSPORT = "/html/body/div[3]/div[3]/div/div[2]/div[4]/div/manage-student-form/div[2]/div[2]/form/fieldset/div[2]";
	public static String dev_SL_PROFILE_CONTACT = "/html/body/div[3]/div[3]/div/div[2]/div[4]/div/manage-student-form/div[2]/div[2]/form/fieldset/div[3]";
	public static String dev_SL_PROFILE_ACADEMIC = "/html/body/div[3]/div[3]/div/div[2]/div[4]/div/manage-student-form/div[2]/div[2]/form/fieldset/div[4]";
	public static String dev_SL_PROFILE_PROFESSIONAL = "/html/body/div[3]/div[3]/div/div[2]/div[4]/div/manage-student-form/div[2]/div[2]/form/fieldset/div[5]";
	public static String dev_SL_PROFILE_DOCUMENT = "/html/body/div[3]/div[3]/div/div[2]/div[4]/div/manage-student-form/div[2]/div[2]/form/div[1]";
	//dev_studylane_myProfile - actual fields
	public static String dev_SL_PROFILE_FIRSTNAME = "//*[@id='input_3']";
	public static String dev_SL_PROFILE_LASTNAME = "//*[@id='input_4']";
	public static String dev_SL_PROFILE_DATE = "//*[@id='student-form-personal-details']/div[2]/div[1]/md-datepicker/div/input";
	public static String dev_SL_PROFILE_GENDER = "//*[@id='radio_7']";
	public static String dev_SL_PROFILE_DATETIMEPICKER_day = "//*[@id='md-1-month-1997-4-8']";
	public static String dev_SL_PROFILE_PASSPORTNUM = "//*[@id='input_8']";
	public static String dev_SL_PROFILE_PLACEOFISSUE = "//*[@id='input_9']";
	public static String dev_SL_PROFILE_DATEOFISSUE = "//*[@id='student-form-passport-details']/div[3]/div[1]/md-datepicker/div[1]/input";
	public static String dev_SL_PROFILE_EXPIRYDATE = "//*[@id='student-form-passport-details']/div[3]/div[2]/md-datepicker/div/input";
	public static String dev_SL_PROFILE_NATIONALITY = "//*[@id='select_10']";
	public static String dev_SL_PROFILE_PLACEOFBIRTH = "//*[@id='input_12']";
	public static String dev_SL_PROFILE_STREETADDRESS1 = "//*[@id='input_15']";
	public static String dev_SL_PROFILE_STREETADDRESS2 = "//*[@id='input_16']";
	public static String dev_SL_PROFILE_CITY = "//*[@id='input_17']";
	public static String dev_SL_PROFILE_STATEPROVREGION = "//*[@id='input_18']";
	public static String dev_SL_PROFILE_POSTALZIPCODE = "//*[@id='input_19']";
	public static String dev_SL_PROFILE_COUNTRY = "//*[@id='select_value_label_1']";
	public static String dev_SL_PROFILE_PHONENUMBER = "//*[@id='input_22']";
	public static String dev_SL_PROFILE_TRAVELALONE = "//*[@id='radio_25']"; 
	public static String dev_SL_PROFILE_MOSTRECENTPROGRAM = "//*[@id='radio_26']";//*[@id="radio_27"]
	public static String dev_SL_PROFILE_MOSTRECENTLEVELEDUC = "//*[@id='radio_38']";
	public static String dev_SL_PROFILE_YEARCOMPLETED = "//*[@id='select_value_label_2']";
	public static String dev_SL_PROFILE_WORKEDAFTERSTUDIES = "//*[@id='radio_44']";
	public static String dev_SL_PROFILE_DOCUMENTTYPE = "//*[@id='select_99']";
	public static String dev_SL_PROFILE_ATTACHFILE = "//*[@id='document-upload-button']";
	public static String dev_SL_PROFILE_UPDATE = "//*[@id='submit-button']";
	public static String dev_SL_PROFILE_SUCCESS_UPDATE = "/html/body/div[11]/md-dialog";
	//*[@id="select_99"]
	//dev_studylane_myAgent
	public static String dev_SL_AGENT = "/html/body/div[3]/div[3]/div/div[1]/div/div[2]/a[3]";
	public static String dev_SL_AGENT_DETAILS = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div/div/div";
	//dev_studylane_myApplications
	public static String dev_SL_APPLICATIONS = "/html/body/div[3]/div[3]/div/div[1]/div/div[2]/a[2]";
	public static String dev_SL_VIEWAPPLICATIONS = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div";
	public static String dev_SL_APPLICATION_STATHISTORY = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div/student-application/form/div/div[2]/div[2]/div/a";
	public static String dev_SL_APPLICATION_STATHISTORY2 = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div/student-application/form/div/div[3]/div[2]/div/a";
	public static String dev_SL_APPLICATION_STATHISTORY3 = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div/student-application/form/div/div[4]/div[2]/div/a";
	public static String dev_SL_APPLICATION_STATUSHISTORYVIEW = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div/student-application/form/div/div[5]";
}
