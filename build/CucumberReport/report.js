$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("studylaneSMOKETEST/applicationHistory.feature");
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
  "duration": 170856336,
  "error_message": "java.lang.ExceptionInInitializerError\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n\tat ✽.Given I am in studylane homepage(studylaneSMOKETEST/applicationHistory.feature:4)\nCaused by: java.lang.NullPointerException\n\tat java.util.Properties$LineReader.readLine(Properties.java:434)\n\tat java.util.Properties.load0(Properties.java:353)\n\tat java.util.Properties.load(Properties.java:341)\n\tat tooltwist.utils.TestDataConfigUtil.\u003cinit\u003e(TestDataConfigUtil.java:18)\n\tat tooltwist.utils.TestDataConfigUtil.\u003cinit\u003e(TestDataConfigUtil.java:7)\n\tat tooltwist.utils.TestDataConfigUtil$TestDataConfigLazyHolder.\u003cclinit\u003e(TestDataConfigUtil.java:40)\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_StudentProfileApplications.i_clicked_My_Applications_from_the_menu()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 414432,
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class tooltwist.utils.TestDataConfigUtil$TestDataConfigLazyHolder\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n\tat ✽.Given the guest is on the studylane home page(studylaneSMOKETEST/checkVersionNumber.feature:5)\n",
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
formatter.uri("studylaneSMOKETEST/searchCourse.feature");
formatter.feature({
  "line": 2,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Anyone should be able to search for courses",
  "description": "",
  "id": "search;anyone-should-be-able-to-search-for-courses",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am in studylane homepage",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#homepage"
    }
  ],
  "line": 7,
  "name": "I enter a keyword in the enter search textbox",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#keyword"
    }
  ],
  "line": 9,
  "name": "click search",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be forwarded to the search results with courses related to the fields I entered",
  "keyword": "Then "
});
formatter.match({
  "location": "SL_StudentProfile.i_am_in_studylane_homepage()"
});
formatter.result({
  "duration": 514174,
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class tooltwist.utils.TestDataConfigUtil$TestDataConfigLazyHolder\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n\tat ✽.Given I am in studylane homepage(studylaneSMOKETEST/searchCourse.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_SearchCourse.i_enter_a_keyword_in_the_enter_search_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_SearchCourse.click_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_SearchCourse.i_should_be_forwarded_to_the_search_results_with_courses_related_to_the_fields_I_entered()"
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
  "duration": 403745,
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class tooltwist.utils.TestDataConfigUtil$TestDataConfigLazyHolder\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n\tat ✽.Given I am in studylane sign up page(studylaneSMOKETEST/signUp.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_SignUp.i_filled_out_all_the_required()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_SignUp.validations_for_each_field_should_display_if_left_blank()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_SignUp.i_click_Create_Account_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_SignUp.i_should_be_redirected_to_studylane_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_SignUp.i_should_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("studylaneSMOKETEST/studentLogout.feature");
formatter.feature({
  "line": 1,
  "name": "Landing Page - Logout",
  "description": "",
  "id": "landing-page---logout",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "I should be able to logout my account",
  "description": "",
  "id": "landing-page---logout;i-should-be-able-to-logout-my-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am in studylane homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click the logout link in the header",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should be logged out of studylane",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I should not be able to access the my account page",
  "keyword": "And "
});
formatter.match({
  "location": "SL_StudentProfile.i_am_in_studylane_homepage()"
});
formatter.result({
  "duration": 357332,
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class tooltwist.utils.TestDataConfigUtil$TestDataConfigLazyHolder\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n\tat ✽.Given I am in studylane homepage(studylaneSMOKETEST/studentLogout.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_StudentLogout.i_click_the_logout_link_in_the_header()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_StudentLogout.i_should_be_logged_out_of_studylane()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_StudentLogout.i_should_not_be_able_to_access_the_my_account_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("studylaneSMOKETEST/studentProfile.feature");
formatter.feature({
  "line": 1,
  "name": "Student Profile",
  "description": "",
  "id": "student-profile",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "A student wants to view his profile",
  "description": "",
  "id": "student-profile;a-student-wants-to-view-his-profile",
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
      "value": "#homepageURL"
    }
  ],
  "line": 6,
  "name": "I clicked my profile from the menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be redirected to studylane student profile page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#studentProfileURL"
    }
  ],
  "line": 9,
  "name": "The following details should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SL_StudentProfile.i_am_in_studylane_homepage()"
});
formatter.result({
  "duration": 385533,
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class tooltwist.utils.TestDataConfigUtil$TestDataConfigLazyHolder\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n\tat ✽.Given I am in studylane homepage(studylaneSMOKETEST/studentProfile.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_StudentProfile.i_clicked_my_profile_from_the_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_StudentProfile.i_should_be_redirected_to_studylane_student_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_StudentProfile.the_following_details_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("studylaneSMOKETEST/studentProfileAgent.feature");
formatter.feature({
  "line": 1,
  "name": "Student Profile Agent",
  "description": "",
  "id": "student-profile-agent",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "A student wants to view his agent\u0027s profile",
  "description": "",
  "id": "student-profile-agent;a-student-wants-to-view-his-agent\u0027s-profile",
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
      "value": "#homepageURL"
    }
  ],
  "line": 6,
  "name": "I clicked my agent from the menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be redirected to studylane agent profile page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#agentProfileURL"
    }
  ],
  "line": 9,
  "name": "The following details should be displayedz",
  "keyword": "And "
});
formatter.match({
  "location": "SL_StudentProfile.i_am_in_studylane_homepage()"
});
formatter.result({
  "duration": 564948,
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class tooltwist.utils.TestDataConfigUtil$TestDataConfigLazyHolder\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n\tat ✽.Given I am in studylane homepage(studylaneSMOKETEST/studentProfileAgent.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_StudentProfileAgent.i_clicked_my_agent_from_the_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_StudentProfileAgent.i_should_be_redirected_to_studylane_agent_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_StudentProfileAgent.the_following_details_should_be_displayedz()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("studylaneSMOKETEST/studentProfileApplications.feature");
formatter.feature({
  "line": 1,
  "name": "Student Application",
  "description": "",
  "id": "student-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "A student wants to view his application status",
  "description": "",
  "id": "student-application;a-student-wants-to-view-his-application-status",
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
formatter.match({
  "location": "SL_StudentProfile.i_am_in_studylane_homepage()"
});
formatter.result({
  "duration": 471699,
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class tooltwist.utils.TestDataConfigUtil$TestDataConfigLazyHolder\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n\tat ✽.Given I am in studylane homepage(studylaneSMOKETEST/studentProfileApplications.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_StudentProfileApplications.i_clicked_My_Applications_from_the_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_StudentProfileApplications.i_should_be_redirected_my_My_Applications_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("studylaneSMOKETEST/studentProfileUpdateDetails.feature");
formatter.feature({
  "line": 1,
  "name": "My Profile",
  "description": "",
  "id": "my-profile",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "A student wants to update his details",
  "description": "",
  "id": "my-profile;a-student-wants-to-update-his-details",
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
      "value": "#myApplicationsPage"
    }
  ],
  "line": 6,
  "name": "I edit the details in my profile",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#profileDetails"
    }
  ],
  "line": 8,
  "name": "I click on the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The details I added should reflect in My Profile",
  "keyword": "Then "
});
formatter.match({
  "location": "SL_StudentProfile.i_am_in_studylane_homepage()"
});
formatter.result({
  "duration": 490433,
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class tooltwist.utils.TestDataConfigUtil$TestDataConfigLazyHolder\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n\tat ✽.Given I am in studylane homepage(studylaneSMOKETEST/studentProfileUpdateDetails.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_StudentProfileUpdate.i_edit_the_details_in_my_profile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_StudentProfileUpdate.i_click_on_the_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_StudentProfileUpdate.the_details_I_added_should_reflect_in_My_Profile()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("studylaneSMOKETEST/studylaneHealthCheck.feature");
formatter.feature({
  "line": 1,
  "name": "studylane Health Check",
  "description": "",
  "id": "studylane-health-check",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "All SL connection should be healthy",
  "description": "",
  "id": "studylane-health-check;all-sl-connection-should-be-healthy",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the studylane healthcheck url",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#studylanehealthCheckURL"
    }
  ],
  "line": 7,
  "name": "I check the values in the page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#healthCheckStatus - value"
    }
  ],
  "line": 9,
  "name": "The values should be one",
  "keyword": "Then "
});
formatter.match({
  "location": "SL_HealthCheck.i_am_on_the_studylane_healthcheck_url()"
});
formatter.result({
  "duration": 348175,
  "error_message": "java.lang.NoClassDefFoundError: Could not initialize class tooltwist.utils.TestDataConfigUtil$TestDataConfigLazyHolder\n\tat tooltwist.utils.TestDataConfigUtil.getTestDataConfig(TestDataConfigUtil.java:44)\n\tat tooltwist.utils.TestInit.\u003cinit\u003e(TestInit.java:30)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:632)\n\tat org.picocontainer.parameters.BasicComponentParameter$1.resolveInstance(BasicComponentParameter.java:118)\n\tat org.picocontainer.parameters.ComponentParameter$1.resolveInstance(ComponentParameter.java:136)\n\tat org.picocontainer.injectors.SingleMemberInjector.getParameter(SingleMemberInjector.java:78)\n\tat org.picocontainer.injectors.ConstructorInjector$CtorAndAdapters.getParameterArguments(ConstructorInjector.java:309)\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:335)\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:37)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.runtime.Runtime.run(Runtime.java:121)\n\tat cucumber.api.cli.Main.run(Main.java:36)\n\tat cucumber.api.cli.Main.main(Main.java:18)\n\tat ✽.Given I am on the studylane healthcheck url(studylaneSMOKETEST/studylaneHealthCheck.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "SL_HealthCheck.i_check_the_values_in_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SL_HealthCheck.the_values_should_be_one()"
});
formatter.result({
  "status": "skipped"
});
});