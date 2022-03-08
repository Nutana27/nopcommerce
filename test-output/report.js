$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeatureFile/Customer.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on Customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_click_on_Customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Add new Customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_view_Add_new_Customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enter_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Confirmation message \"The new customer has been added successfully\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_view_Confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer by EmailID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on Customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_click_on_Customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Customer Email",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.enter_Customer_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search Button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Email in the Search Table",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_should_found_Email_in_the_Search_Table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer by Name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on Customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_click_on_Customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer FirstName",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.enter_customer_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer LastName",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.enter_customer_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search Button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Name in the Search Table",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});