package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;

import dataproviders.ConfigUtility;
import factory.BrowserFactory;
import io.cucumber.java.en.*;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;


public class Steps extends BaseClass  {
	LoginPage lp=new LoginPage(BrowserFactory.getDriver());
	AddCustomerPage addCust=new AddCustomerPage(BrowserFactory.getDriver());
	SearchCustomerPage searchCust=new SearchCustomerPage(BrowserFactory.getDriver());


	@Given("User open application")
	public void user_open_application() {
		BrowserFactory.getDriver().get(ConfigUtility.getValue("url"));
		BrowserFactory.getDriver().manage().window().maximize();
	}
	

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@And("Click on Login")
	public void click_on_Login() {
		lp.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
		if(BrowserFactory.getDriver().getPageSource().contains("Login was unsuccessful.")) {
			//BrowserFactory.getDriver().close();
			Assert.assertTrue(false);
			
		}else {
			Assert.assertEquals(title,BrowserFactory.getDriver().getTitle());
		}
	}
	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws Exception {
		lp.clickLogout();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		BrowserFactory.getDriver().quit();
	}

	/*------customer feature step definitions------*/
	
	
	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() {
	    addCust=new AddCustomerPage(BrowserFactory.getDriver());
	    Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
	}

	/*@When("User click on Customer Menu")
	public void user_click_on_Customer_Menu() {
		 addCust.clickOnCustomersMenu();
	}

	@When("click on Customer Menu Item")
	public void click_on_Customer_Menu_Item() {
		addCust.clickOnCustomersMenuItem();
	}*/
	

	@When("User click on Customers Menu")
	public void user_click_on_Customers_Menu() {
		 addCust.clickOnCustomersMenu();
	}

	@When("click on Customers Menu Item")
	public void click_on_Customers_Menu_Item() {
		addCust.clickOnCustomersMenuItem();
	}

	@When("click on Add new button")
	public void click_on_Add_new_button() {
	    addCust.clickOnAddnew();
	}

	@Then("User can view Add new Customer page")
	public void user_can_view_Add_new_Customer_page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws Exception {
	   String email=randomString()+"@gmail.com";
	   addCust.setEmail(email);
	   addCust.setPassword("test123");
	   //The customer cannot be in both "Guests" and "Registered" customer role
	   addCust.setCustomerRoles("Vendors");
	   Thread.sleep(3000);
	   
	   addCust.setManagerOfVendor("Vendor 2");
	   addCust.setGender("Male");
	   addCust.setFirstName("Nutana");
	   addCust.setLastName("Manjunath");
	   addCust.setDOB("7/05/1988");
	   addCust.setCompanyName("busyDO");
	   addCust.setAdminComment("This is for testing ");
	   
	}

	@When("Click on Save button")
	public void click_on_Save_button() throws Exception {
	   addCust.clickOnSave();
	   Thread.sleep(2000);
	}

	@Then("User can view Confirmation message {string}")
	public void user_can_view_Confirmation_message(String string) {
	   Assert.assertTrue(BrowserFactory.getDriver().findElement(By.tagName("body")).getText()
			   .contains("The new customer has been added successfully"));
	}

	/*-------Search customer page-------*/
	
	@When("Enter Customer Email")
	public void enter_Customer_Email() {
	   searchCust=new SearchCustomerPage(BrowserFactory.getDriver());
	   searchCust.setEmail("victoria_victoria@nopCommerce.com");
		
	}

	@When("Click on search Button")
	public void click_on_search_Button() throws Exception {
		searchCust.clickSearch();
		Thread.sleep(3000);
	}

	@Then("User should find Email in the Search Table")
	public void user_should_find_Email_in_the_Search_Table() {
		boolean status=searchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
		
		Assert.assertEquals(true, status);
	}
	
	/*----------steps for searching a customer by using firstname and lastname-----------*/
	@When("Enter customer FirstName")
	public void enter_customer_FirstName() {
	   searchCust=new SearchCustomerPage(BrowserFactory.getDriver());
	   searchCust.setFirstName("Victoria");
	}

	@When("Enter customer LastName")
	public void enter_customer_LastName() {
	  searchCust.setLastName("Terces");
	}

	@Then("User should find Name in the Search Table")
	public void user_should_find_Name_in_the_Search_Table() {
	   boolean status=searchCust.searchCustomerByName("Victoria Terces");
	   Assert.assertEquals(true, status);
	}




}
