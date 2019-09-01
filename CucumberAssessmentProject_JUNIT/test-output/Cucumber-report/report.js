$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UserRegistration.feature");
formatter.feature({
  "line": 2,
  "name": "User registeration with valid and invalid email address",
  "description": "In order to validate the registration\r\nwe will test with randomly generated valid and invalid email address",
  "id": "user-registeration-with-valid-and-invalid-email-address",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@User-Register"
    }
  ]
});
formatter.before({
  "duration": 4571160256,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on the home page of fashion website \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Sign in",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 42
    }
  ],
  "location": "UserRegistrationSteps.i_am_on_the_home_page_of_fashion_website(String)"
});
formatter.result({
  "duration": 8815364562,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistrationSteps.i_click_on_Sign_in()"
});
formatter.result({
  "duration": 2418009939,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Error message while registring with invalid email",
  "description": "",
  "id": "user-registeration-with-valid-and-invalid-email-address;error-message-while-registring-with-invalid-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@User-Register-InvalidEmail"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I enter \"invalid\" email address",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see error message \"Invalid email address.\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "UserRegistrationSteps.i_click_on_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 20526,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on the home page of fashion website \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Sign in",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 42
    }
  ],
  "location": "UserRegistrationSteps.i_am_on_the_home_page_of_fashion_website(String)"
});
formatter.result({
  "duration": 1712845197,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistrationSteps.i_click_on_Sign_in()"
});
formatter.result({
  "duration": 1890399638,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Registration successful with valid email",
  "description": "",
  "id": "user-registeration-with-valid-and-invalid-email-address;registration-successful-with-valid-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@User-Register-ValidEmail"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I enter a \"valid\" email in the Email address field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I fill the user registration form with random generated values on Create An Account page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should be successfully registered and land on \"My Account\" page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "UserRegistrationSteps.i_click_on_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserRegistrationSteps.i_fill_the_user_registration_form_with_random_generated_values_on_Create_An_Account_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserRegistrationSteps.i_click_on_Register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});