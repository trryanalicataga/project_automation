$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("regressiontest/GoogleEmailRye.feature");
formatter.feature({
  "line": 1,
  "name": "Google Email",
  "description": "",
  "id": "google-email",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "I should be able to visit Gmail",
  "description": "",
  "id": "google-email;i-should-be-able-to-visit-gmail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I accessed gmail",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I check the email field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should be able to type on it",
  "keyword": "Then "
});
formatter.match({
  "location": "TestEmailRye.i_accessed_gmail()"
});
formatter.result({
  "duration": 7423323746,
  "status": "passed"
});
formatter.match({
  "location": "TestEmailRye.i_check_the_email_field()"
});
formatter.result({
  "duration": 72324681,
  "status": "passed"
});
formatter.match({
  "location": "TestEmailRye.i_should_be_able_to_type_on_it()"
});
formatter.result({
  "duration": 59454227957,
  "error_message": "java.lang.AssertionError: //*[@id\u003d\u0027gb\u0027]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span is not available.\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat tooltwist.utils.ElementUtil.isElementAvailabe(ElementUtil.java:109)\n\tat tooltwist.pageObjects.TestEmailRyePageObject.typeInEmailField(TestEmailRyePageObject.java:59)\n\tat tooltwist.stepDefinitions.regressionTest.TestEmailRye.i_should_be_able_to_type_on_it(TestEmailRye.java:36)\n\tat ✽.Then I should be able to type on it(regressiontest/GoogleEmailRye.feature:6)\n",
  "status": "failed"
});
formatter.uri("regressiontest/TestGoogle.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Test Google",
  "description": "I want to use this template for my feature file",
  "id": "test-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 25,
  "name": "Able to access Google",
  "description": "",
  "id": "test-google;able-to-access-google",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I access Google site, \u003curl\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I should be navigated to Google site",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "test-google;able-to-access-google;",
  "rows": [
    {
      "cells": [
        "url"
      ],
      "line": 30,
      "id": "test-google;able-to-access-google;;1"
    },
    {
      "cells": [
        "{serverUrl}"
      ],
      "line": 31,
      "id": "test-google;able-to-access-google;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 31,
  "name": "Able to access Google",
  "description": "",
  "id": "test-google;able-to-access-google;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@tag"
    },
    {
      "line": 24,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I access Google site, {serverUrl}",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I should be navigated to Google site",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "{serverUrl}",
      "offset": 22
    }
  ],
  "location": "TestGoogle.i_access_Google_site_www_google_com_ph(String)"
});
formatter.result({
  "duration": 4739542994,
  "status": "passed"
});
formatter.match({
  "location": "TestGoogle.i_should_be_navigated_to_Google_site()"
});
formatter.result({
  "duration": 52353308,
  "status": "passed"
});
formatter.uri("studylaneSMOKETEST/applicationHistory.feature");
formatter.feature({
  "line": 1,
  "name": "Application History",
  "description": "",
  "id": "application-history",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "A student wants to view his application history",
  "description": "",
  "id": "application-history;a-student-wants-to-view-his-application-history",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am in studylane homepage",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#studentAccountDashboard"
    }
  ],
  "line": 6,
  "name": "I clicked My Applications from the menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be redirected my My Applications page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#myApplicationsPage"
    }
  ],
  "line": 9,
  "name": "I click status history from the application card",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be shown a bubble with the history of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "SL_StudentProfile.i_am_in_studylane_homepage()"
});
formatter.result({
  "duration": 15982430768,
  "status": "passed"
});
formatter.match({
  "location": "SL_StudentProfileApplications.i_clicked_My_Applications_from_the_menu()"
});
formatter.result({
  "duration": 453486027664,
  "error_message": "java.lang.AssertionError: /html/body/div[3]/div[3]/div/div[1]/div/div[2]/a[2] is not available.\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat tooltwist.utils.ElementUtil.isElementAvailabe(ElementUtil.java:109)\n\tat tooltwist.utils.ElementUtil.isClickedElementAvailable(ElementUtil.java:87)\n\tat tooltwist.pageObjects.SL_StudentProfileApplicationsPageObject.visitApplications(SL_StudentProfileApplicationsPageObject.java:25)\n\tat tooltwist.stepDefinitions.regressionTest.SL_StudentProfileApplications.i_clicked_My_Applications_from_the_menu(SL_StudentProfileApplications.java:27)\n\tat ✽.When I clicked My Applications from the menu(studylaneSMOKETEST/applicationHistory.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_StudentProfileApplications.i_should_be_redirected_my_My_Applications_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_ApplicationHistory.i_click_status_history_from_the_application_card()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_ApplicationHistory.i_should_be_shown_a_bubble_with_the_history_of_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("studylaneSMOKETEST/checkVersionNumber.feature");
formatter.feature({
  "line": 1,
  "name": "Studylane Homepage",
  "description": "",
  "id": "studylane-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Check version number",
  "description": "",
  "id": "studylane-homepage;check-version-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the guest is on the studylane home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I scroll to the bottom of the page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the version number will be displayed on the footer",
  "keyword": "Then "
});
formatter.match({
  "location": "SL_CheckVersionNumber.the_guest_is_on_the_studylane_home_page()"
});
formatter.result({
  "duration": 2513792809,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d61.0.3163.100)\n  (Driver info: chromedriver\u003d2.29.461585 (0be2cd95f834e9ee7c46bcc7cf405b483f5ae83b),platform\u003dMac OS X 10.12.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 329 milliseconds\nBuild info: version: \u00272.52.0\u0027, revision: \u00274c2593cfc3689a7fcd7be52549167e5ccc93ad28\u0027, time: \u00272016-02-11 11:22:43\u0027\nSystem info: host: \u0027Hudsonian.local\u0027, ip: \u002710.0.16.63\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12\u0027, java.version: \u00271.8.0_92\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461585 (0be2cd95f834e9ee7c46bcc7cf405b483f5ae83b), userDataDir\u003d/var/folders/_j/hkpwx5710pq8s4vtfxcp6f780000gp/T/.org.chromium.Chromium.lJ2mNF}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d61.0.3163.100, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 4e5d9916d6337997926fd217775e2e27\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:316)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.ThreadGuard$WebDriverInvocationHandler.invokeUnderlying(ThreadGuard.java:100)\n\tat org.openqa.selenium.support.ThreadGuard$WebDriverInvocationHandler.invoke(ThreadGuard.java:92)\n\tat com.sun.proxy.$Proxy10.get(Unknown Source)\n\tat tooltwist.pageObjects.SL_CheckVersionNumberPageObject.visitStudylane(SL_CheckVersionNumberPageObject.java:27)\n\tat tooltwist.stepDefinitions.regressionTest.SL_CheckVersionNumber.the_guest_is_on_the_studylane_home_page(SL_CheckVersionNumber.java:27)\n\tat ✽.Given the guest is on the studylane home page(studylaneSMOKETEST/checkVersionNumber.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_CheckVersionNumber.i_scroll_to_the_bottom_of_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_CheckVersionNumber.the_version_number_will_be_displayed_on_the_footer()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("studylaneSMOKETEST/signUp.feature");
formatter.feature({
  "line": 1,
  "name": "Sign Up",
  "description": "",
  "id": "sign-up",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "A visitor should be able to sign up in studylane",
  "description": "",
  "id": "sign-up;a-visitor-should-be-able-to-sign-up-in-studylane",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am in studylane sign up page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#SignupURL"
    }
  ],
  "line": 7,
  "name": "I filled out all the required",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Validations for each field should display if left blank",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#fields - validations"
    }
  ],
  "line": 10,
  "name": "I click Create Account button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should be redirected to studylane login page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#LoginURL"
    }
  ],
  "line": 13,
  "name": "I should be able to login",
  "keyword": "And "
});
formatter.match({
  "location": "SL_SignUp.i_am_in_studylane_sign_up_page()"
});
formatter.result({
  "duration": 5690151771,
  "status": "passed"
});
formatter.match({
  "location": "SL_SignUp.i_filled_out_all_the_required()"
});
