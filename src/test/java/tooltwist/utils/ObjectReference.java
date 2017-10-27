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
	public static String dev_SL_BV = "/html/body/div[3]/div[9]/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/span/p/span";
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
	public static String dev_SL_LOGINPANEL = "/html/body/div[3]/div[1]/table/tbody/tr[5]/td/div/table/tbody/tr/td[2]/table/tbody/tr/td[5]/div/div[1]";
	public static String dev_SL_LOGOUTBUTTON = "/html/body/div[3]/div[1]/table/tbody/tr[5]/td/div/table/tbody/tr/td[2]/table/tbody/tr/td[5]/div/div[4]/div/div/div[2]";
	public static String dev_SL_LOGINFORM = "/html/body/div[3]/div[4]/div/div/div/div/div/div";
	//dev_studylane_myAgent
	public static String dev_SL_AGENT = "/html/body/div[3]/div[3]/div/div[1]/div/div[1]/a[3]";
	public static String dev_SL_AGENT_DETAILS = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div/div/div";
	//dev_studylane_myApplications
	public static String dev_SL_APPLICATIONS = "/html/body/div[3]/div[3]/div/div[1]/div/div[1]/a[2]";
	public static String dev_SL_VIEWAPPLICATIONS = "/html/body/div[3]/div[3]/div/div[1]/div/div[1]/a[2]";
	public static String dev_SL_APPLICATION_STATHISTORY = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div/student-application/form/div/div[2]/div[2]/div/a";
	public static String dev_SL_APPLICATION_STATHISTORY2 = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div/student-application/form/div/div[3]/div[2]/div/a";
	public static String dev_SL_APPLICATION_STATHISTORY3 = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div/student-application/form/div/div[4]/div[2]/div/a";
	public static String dev_SL_APPLICATION_STATUSHISTORYVIEW = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div/student-application/form/div/div[5]";
	//dev_studylane_header
	public static String dev_SL_LOGO = "/html/body/div[3]/div[1]/table/tbody/tr[5]/td/div/table/tbody/tr/td[1]/table/tbody/tr/td[3]/a/img";
	//dev_studylane_homepage
	public static String dev_SL_SEARCHFIELD = "//*[@id='i_search_course']";
	public static String dev_SL_SEARCHBUTTON = "//*[@id='search-form']/div[1]/div[1]/div[3]/a/button";
	//dev_studylane_searchresults                  
	public static String dev_SL_SHORTLISTBUTTON = "/html/body/div[3]/div[2]/div/course-search-manager/div/course-search-result/div/div[2]/ul/li[1]/div[1]/div[3]/div[2]/button";
	public static String dev_SL_SHORTLISTBUTTON1 = "/html/body/div[3]/div[2]/div/course-search-manager/div/course-search-result/div/div[2]/ul/li[2]/div[1]/div[3]/div[2]/button";
	public static String dev_SL_SHORTLIST = "//*[@id='saved-courses-container-override']/slick/div/div/div[1]/div/div";
	public static String dev_SL_SHORTLIST1 = "//*[@id='saved-courses-container-override']/slick/div/div/div[2]/div/div";
	public static String dev_SL_COMPARE = "//*[@id='saved-courses-buttons-container-override']/div/div/div[1]/button";
	public static String dev_SL_ENTEREMAILFIELD = "//*[@id='auto-focus-on-load']/div[3]/div/div";
	//dev_studylane_courseApplication
	public static String dev_SL_PROFILE_FIRSTNAMEc = "//*[@id='student-form-personal-details']/div[1]/div[1]/div/div/input[2]";
	public static String dev_SL_PROFILE_LASTNAMEc = "//*[@id='student-form-personal-details']/div[1]/div[2]/div/div/input";
	public static String dev_SL_PROFILE_DATEc = "//*[@id='student-form-personal-details']/div[2]/div";
	public static String dev_SL_PROFILE_GENDERc = "//*[@id='student-form-personal-details']/div[3]/div/div[2]/div/input[2]";
	public static String dev_SL_PROFILE_DATETIMEPICKERc = "";
	public static String dev_SL_PROFILE_PASSPORTNUMc = "//*[@id='student-form-passport-details']/div[1]/div[1]/div/div/input";
	public static String dev_SL_PROFILE_PLACEOFISSUEc = "//*[@id='student-form-passport-details']/div[2]/div[1]/div/div/input";
	public static String dev_SL_PROFILE_DATEOFISSUEc = "//*[@id='student-form-passport-details']/div[1]/div[2]";
	public static String dev_SL_PROFILE_EXPIRYDATEc = "//*[@id='student-form-passport-details']/div[2]/div[2]";
	public static String dev_SL_PROFILE_NATIONALITYc = "//*[@id='student-form-passport-details']/div[3]/div[1]/div/div/div[1]/a";
	public static String dev_SL_PROFILE_PLACEOFBIRTHc = "//*[@id='student-form-passport-details']/div[3]/div[2]/div/div/input";
	public static String dev_SL_PROFILE_STREETADDRESS1c = "//*[@id='student-form-contact-details']/div[1]/div/div/div/input";
	public static String dev_SL_PROFILE_STREETADDRESS2c = "//*[@id='student-form-contact-details']/div[2]/div/div/div/input";
	public static String dev_SL_PROFILE_CITYc = "//*[@id='student-form-contact-details']/div[3]/div[1]/div/div/input";
	public static String dev_SL_PROFILE_STATEPROVREGIONc = "//*[@id='student-form-contact-details']/div[3]/div[2]/div/div/input";
	public static String dev_SL_PROFILE_POSTALZIPCODEc = "//*[@id='student-form-contact-details']/div[4]/div[1]/div/div/input";
	public static String dev_SL_PROFILE_COUNTRYc = "";
	public static String dev_SL_PROFILE_PHONENUMBERc = "//*[@id='student-form-contact-details']/div[5]/div[1]/div/div/input";
	public static String dev_SL_PROFILE_TRAVELALONEc = "//*[@id='student-form-contact-details']/div[7]/div/div[1]/div/div/div/label[1]/input"; 
	public static String dev_SL_PROFILE_MOSTRECENTLEVELEDUCc = "//*[@id='student-form-base-academic-details']/div[3]/div[1]/div[1]/div/div[1]/div[1]/label/input";//*[@id="radio_27"]
	public static String dev_SL_PROFILE_MOSTRECENTPROGRAMc = "//*[@id='student-form-base-academic-details']/div[1]/div/div[1]/div[2]/div/input[1]";
	public static String dev_SL_PROFILE_YEARCOMPLETEDc = "//*[@id='student-form-base-academic-details']/div[4]/div/div/div/select";
	public static String dev_SL_PROFILE_WORKEDAFTERSTUDIESc = "//*[@id='student-employment-details']/div[1]/div/div[1]/div[2]/div/label[2]/input";
	public static String dev_SL_PROFILE_ICONFIRMc = "//*[@id='student-declaration-details']/div[2]/div[1]/div/div[1]/input";
	public static String dev_SL_PROFILE_FULLNAMEc = "//*[@id='student-declaration-details']/div[2]/div[2]/div/div/input";
	public static String dev_SL_PROFILE_DATEDECLARATIONc = "//*[@id='student-declaration-details']/div[2]/div[3]/div/div/input";
	public static String dev_SL_PROFILE_SUCCESS_SUBMITc = "//*[@id='submit-button']";
	public static String dev_SL_PROFILE_EMAILADDRESSc = "//*[@id='student-form-contact-details']/div[5]/div[2]/div/div/input";
	//dev_courseApplicationAccordion
	public static String dev_SL_CONTACT_DETAILS = "/html/body/div[3]/div[3]/div/div/div[2]/div/div/div[4]/form/div[3]";
	public static String dev_SL_PASSPORT_DETAILS = "/html/body/div[3]/div[3]/div/div/div[2]/div/div/div[4]/form/div[2]";
	public static String dev_SL_ACADEMIC_DETAILS = "/html/body/div[3]/div[3]/div/div/div[2]/div/div/div[4]/form/div[4]";
	public static String dev_SL_PROFESSIONAL_DETAILS = "/html/body/div[3]/div[3]/div/div/div[2]/div/div/div[4]/form/div[5]";
	public static String dev_SL_DECLARATION = "/html/body/div[3]/div[3]/div/div/div[2]/div/div/div[4]/form/div[6]";
	//dev_studylane_comparePage
	public static String dev_SL_COMPAREPAGE_APPLY = "/html/body/div[3]/div[2]/div/course-search-manager/div/course-compare/div[2]/div/div[1]/table[1]/tbody/tr[9]/td[2]";
	public static String dev_SL_SCS = "/html/body/div[3]/div[2]/div/course-search-manager/div/course-search-shortlist/div/div[2]/md-toolbar/div/div/div[2]/a[2]";
	public static String dev_SL_SCS_apply = "//*[@id='saved-courses-buttons-container-override']/div/div/div[2]/button/span[1]";
	//dev_agent_selection_process
	public static String dev_SL_AGENTSELECTION = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/div/input";
	public static String dev_SL_PROCEED = "//*[@id='agent-selection-tpl-container']/div[4]/div[2]/button";
	public static String dev_SL_SUCCESSAPPLY = "/html/body/div[3]/div[3]/table/tbody/tr/td/div/h1";

	//GLOBAL STUDY PARTNERS
	
	//header
	public static String dev_GSP_HEADER_LOGIN = "/html/body/div[3]/table/tbody/tr[8]/td/div/div[1]/table/tbody/tr[6]/td/div/table/tbody/tr[3]/td[2]/table/tbody/tr/td[5]/div/div[3]";
	
	//homepage
	public static String dev_GSP_SEARCHBOX_SEARCHFIELD = "//*[@id='i_search_course']";
	public static String dev_GSP_SEARCHBOX_SEARCHBUTTON = "//*[@id='search-form']/div[1]/div[1]/div[3]/a/button";
	
	//footer
	public static String dev_GSP_FOOTER = "/html/body/div[3]/div[10]/table/tbody/tr[2]/td/div/div[1]/div[2]/table/tbody/tr[3]/td/table/tbody/tr/td/span/p/span";

	//splash
	public static String dev_GSP_SPLASH = "//*[@id='dialogContent_61']/div/div[2]/div[3]/div[3]";
	
	//login
	public static String dev_GSP_USERNAME = "//*[@id='loginPage-form']/div[1]/div/div/div[1]/input";
	public static String dev_GSP_PASSWORD = "//*[@id='loginPage-form']/div[2]/div/div/div[1]/input";
	public static String dev_GSP_LOGINBUTTON = "//*[@id='loginPage-form']/div[3]/button";

	//list of applications
	public static String dev_GSP_STATUSSELECTOR = "//*[@id='list-external-filter-active-inactive']";
	public static String dev_GSP_CLICKER = "/html/body/div[3]/div[3]/div/div[2]/table/tbody/tr[1]/td/table/tbody/tr[1]/td/span/h1/span";
	public static String dev_GSP_CONDITIONALLYAPPROVE = "//*[@id='become-a-partner-list-tpl-container']/tr[1]/td[10]/div/table/tbody/tr/td/button[3]";
	public static String dev_GSP_CAPPROVEREASON = "/html/body/div[6]/div/div/div[2]/div/form/div/div/div/div/input";
	public static String dev_GSP_CAPPROVEBUTTON = "/html/body/div[6]/div/div/div[3]/button[2]";
	public static String dev_GSP_CAPPROVESUCCESS = "/html/body/div[6]/div/div/div[1]/div";
	public static String dev_GSP_APPROVEBUTTON = "//*[@id='become-a-partner-list-tpl-container']/tr[1]/td[10]/div/table/tbody/tr/td/button[3]";
	public static String dev_GSP_APPROVEBUTTON1 = "//*[@id='become-a-partner-list-tpl-container']/tr[1]/td[10]/div/table/tbody/tr/td/button[4]";
	public static String dev_GSP_QAVERIFIEDOKBTN = "/html/body/div[6]/div/div/div[2]/button[2]";
	
	//QA Verified Buttons
	public static String dev_GSP_UNIVERSALQAV = "//input[@type='radio'][./following-sibling::*[contains(., 'Yes')]]";
	public static String dev_GSP_QAV1 = "//*[@id='become-a-partner-company-profile']/table/tbody/tr[6]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_QAV2 = "//*[@id='become-a-partner-company-profile']/table/tbody/tr[15]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_QAV3 = "//*[@id='become-a-partner-company-profile']/table/tbody/tr[23]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_COMPANYSPECIFICSTAB = "//*[@id='become-a-partner-company-specifics-tab']/a";
	public static String dev_GSP_QAV4 = "//*[@id='become-a-partner-company-specifics']/table/tbody/tr[8]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_QAV44 = "//*[@id='become-a-partner-company-specifics']/table/tbody/tr[16]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_STUDENTDATATAB = "//*[@id='become-a-partner-student-data-tab']/a";
	public static String dev_GSP_QAV5 = "//*[@id='become-a-partner-student-data']/table/tbody/tr[4]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_QAV55 = "//*[@id='become-a-partner-student-data']/table/tbody/tr[3]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_QAV6 = "//*[@id='become-a-partner-student-data']/table/tbody/tr[12]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_QAV66 = "//*[@id='become-a-partner-student-data']/table/tbody/tr[11]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_QAV7 = "//*[@id='become-a-partner-student-data']/table/tbody/tr[21]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_QAV77 = "//*[@id='become-a-partner-student-data']/table/tbody/tr[17]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_STUDENTSERVICESTAB = "//*[@id='become-a-partner-student-services-tab']/a";
	public static String dev_GSP_QAV8 = "//*[@id='become-a-partner-student-services']/table/tbody/tr[28]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_QAV88 = "//*[@id='become-a-partner-due-diligence-and-submission']/table/tbody/tr[12]/td/div/div[2]/div/input[1]";
	public static String dev_GSP_DUEDILIGENCEANDSUBMISSIONTAB = "//*[@id='become-a-partner-due-diligence-and-submission-tab']/a";
	public static String dev_GSP_QAV9 = "//*[@id='become-a-partner-due-diligence-and-submission']/table/tbody/tr[20]/td/div/div[2]/div/input[1]";
	public static String FINALAPPROVE = "/html/body/div[3]/div[3]/div/div[2]/table/tbody/tr[4]/td/div/div[2]/div/div[6]/button[3]";
	public static String FAAPPROVEREASON = "/html/body/div[6]/div/div/div[2]/div/form/div/div/div/div/input";
	public static String FAPPROVEOKBTN = "/html/body/div[6]/div/div/div[3]/button[2]";
	public static String SUCCESSAPPROVED = "/html/body/div[6]";
	
	//CA'd agent landing page
	public static String dev_GSP_DASHBOARDBTN = "/html/body/div[3]/div[3]/div/div[1]/div/div[1]/a[1]";
	public static String dev_GSP_MYPROFILEBTN = "/html/body/div[3]/div[3]/div/div[1]/div/div[1]/a[2]";
	public static String dev_GSP_MESSAGE = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div/div/div[1]/p";
	public static String dev_GSP_PROGRESSTRACKER = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div/div/div[3]";
	public static String dev_GSP_APPLICATIONPERC = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div/div/div[3]/div";
	public static String dev_GSP_DOCUMENTTRACKER = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div/div/div[3]/div/div/a[22]/div";
	public static String dev_GSP_SENDAPPLICATION = "//*[@id='submit-button']";
	public static String dev_GSP_APPLICATIONSENT = "/html/body/div[3]/div[3]/div/div[2]/div[3]/div/div/div[3]/div";
	public static String dev_GSP_PROMPTOK = "/html/body/div[17]/div/div/div[2]/button";
	
	//dev GSP Search Results
	public static String dev_GSP_SHORTLISTBUTTON = "/html/body/div[3]/div[3]/div/course-search-manager/div/course-search-result/div/div[2]/ul/li[1]/div[1]/div[3]/div[2]/button";
	public static String dev_GSP_SHORTLISTBUTTON1 = "/html/body/div[3]/div[3]/div/course-search-manager/div/course-search-result/div/div[2]/ul/li[2]/div[1]/div[3]/div[2]/button";
	public static String dev_GSP_SHORTLIST = "//*[@id='saved-courses-container-override']/slick/div/div/div[1]/div/div";
	public static String dev_GSP_SHORTLIST1 = "//*[@id='saved-courses-container-override']/slick/div/div/div[2]/div/div/div[2]/div";
	public static String dev_GSP_COMPARE = "//*[@id='saved-courses-buttons-container-override']/div/div/div[1]/button";

	//dev GSP course apply
	public static String dev_GSP_SCS = "/html/body/div[3]/div[3]/div/course-search-manager/div/course-search-shortlist/div/div[2]/md-toolbar/div/div/div[2]/a[2]";
	public static String dev_GSP_SCS_APPLY = "//*[@id='saved-courses-buttons-container-override']/div/div/div[2]/button/span[1]";
	
	//dev_gsp_courseApplication
	public static String dev_GSP_PROFILE_FIRSTNAMEc = "//*[@id='student-form-personal-details']/div[1]/div[1]/div/div/input[2]";
	public static String dev_GSP_PROFILE_LASTNAMEc = "//*[@id='student-form-personal-details']/div[1]/div[2]/div/div/input";
	public static String dev_GSP_PROFILE_DATEc = "//*[@id='student-form-personal-details']/div[2]/div";
	public static String dev_GSP_PROFILE_GENDERc = "//*[@id='student-form-personal-details']/div[3]/div/div[2]/div/input[2]";
	public static String dev_GSP_PROFILE_DATETIMEPICKERc = "";
	public static String dev_GSP_PROFILE_PASSPORTNUMc = "//*[@id='student-form-passport-details']/div[1]/div[1]/div/div/input";
	public static String dev_GSP_PROFILE_PLACEOFISSUEc = "//*[@id='student-form-passport-details']/div[2]/div[1]/div/div/input";
	public static String dev_GSP_PROFILE_DATEOFISSUEc = "//*[@id='student-form-passport-details']/div[1]/div[2]";
	public static String dev_GSP_PROFILE_EXPIRYDATEc = "//*[@id='student-form-passport-details']/div[2]/div[2]";
	public static String dev_GSP_PROFILE_NATIONALITYc = "//*[@id='student-form-passport-details']/div[3]/div[1]/div/div/div[1]/a";
	public static String dev_GSP_PROFILE_PLACEOFBIRTHc = "//*[@id='student-form-passport-details']/div[3]/div[2]/div/div/input";
	public static String dev_GSP_PROFILE_STREETADDRESS1c = "//*[@id='student-form-contact-details']/div[1]/div/div/div/input";
	public static String dev_GSP_PROFILE_STREETADDRESS2c = "//*[@id='student-form-contact-details']/div[2]/div/div/div/input";
	public static String dev_GSP_PROFILE_CITYc = "//*[@id='student-form-contact-details']/div[3]/div[1]/div/div/input";
	public static String dev_GSP_PROFILE_STATEPROVREGIONc = "//*[@id='student-form-contact-details']/div[3]/div[2]/div/div/input";
	public static String dev_GSP_PROFILE_POSTALZIPCODEc = "//*[@id='student-form-contact-details']/div[4]/div[1]/div/div/input";
	public static String dev_GSP_PROFILE_COUNTRYc = "//*[@id='student-form-contact-details']/div[4]/div[2]/div/div/div[1]/a";
	public static String dev_GSP_PROFILE_PHONENUMBERc = "//*[@id='student-form-contact-details']/div[5]/div[1]/div/div/input";
	public static String dev_GSP_PROFILE_TRAVELALONEc = "//*[@id='student-form-contact-details']/div[7]/div/div[1]/div/div/div/label[1]/input"; 
	public static String dev_GSP_PROFILE_MOSTRECENTLEVELEDUCc = "//*[@id='student-form-base-academic-details']/div[3]/div[1]/div[1]/div/div[1]/div[1]/label/input";//*[@id="radio_27"]
	public static String dev_GSP_PROFILE_MOSTRECENTPROGRAMc = "//*[@id='student-form-base-academic-details']/div[1]/div/div[1]/div[2]/div/input[1]";
	public static String dev_GSP_PROFILE_YEARCOMPLETEDc = "//*[@id='student-form-base-academic-details']/div[4]/div/div/div/select";
	public static String dev_GSP_PROFILE_WORKEDAFTERSTUDIESc = "//*[@id='student-employment-details']/div[1]/div/div[1]/div[2]/div/label[2]/input";
	public static String dev_GSP_PROFILE_ICONFIRMc = "//*[@id='agent-declaration-details']/div[2]/div[1]/div/div[1]/input";
	public static String dev_GSP_PROFILE_FULLNAMEc = "//*[@id='agent-declaration-details']/div[2]/div[2]/div/div/input";
	public static String dev_GSP_PROFILE_DATEDECLARATIONc = "//*[@id='agent-declaration-details']/div[2]/div[3]/div/div/input";
	public static String dev_GSP_PROFILE_SUCCESS_SUBMITc = "//*[@id='submit-button']";
	public static String dev_GSP_PROFILE_EMAILADDRESSc = "//*[@id='student-form-contact-details']/div[5]/div[2]/div/div/input";
		//dev_courseApplicationAccordion
	public static String dev_GSP_CONTACT_DETAILS = "/html/body/div[3]/div[3]/div/div/table/tbody/tr/td/div/div[4]/form/div[3]/div[1]/div/div[1]/span";
	public static String dev_GSP_PASSPORT_DETAILS = "/html/body/div[3]/div[3]/div/div/table/tbody/tr/td/div/div[4]/form/div[2]/div[1]/div/div[1]/span";
	public static String dev_GSP_ACADEMIC_DETAILS = "/html/body/div[3]/div[3]/div/div/table/tbody/tr/td/div/div[4]/form/div[4]";
	public static String dev_GSP_PROFESSIONAL_DETAILS = "/html/body/div[3]/div[3]/div/div/table/tbody/tr/td/div/div[4]/form/div[5]";
	public static String dev_GSP_DECLARATION = "/html/body/div[3]/div[3]/div/div/table/tbody/tr/td/div/div[4]/form/div[6]";
}
