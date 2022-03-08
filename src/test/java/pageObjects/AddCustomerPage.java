package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

	public WebDriver driver;
	public AddCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	By lnkCustomer_menu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	By lnkCustomer_menuitem=By.xpath("//p[contains(text(),' Customers')]");
	
	By btnAddnew=By.xpath("//a[@class='btn btn-primary']");
	
	By txtEmail=By.xpath("//input[@id='Email']");
	By txtpwd=By.xpath("//input[@id='Password']");
	
	By txtcutomerRoles=By.xpath("//div[@class='k-widget k-multiselect k-multiselect-clearable']");
	
	By lstitemAdministrators=By.xpath("//li[contains(text(),'Administrators')]");
	By lstitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
	By lstitemGuests=By.xpath("//li[contains(text(),'Guests')]");
	By lstitemVendors=By.xpath("//li[contains(text(),'Vendors')]");
	
	
	By drpmgrOfVendor=By.xpath("//*[@id='VendorId']");
	
	By rdMaleGender=By.id("Gender_Male");
	By rdFemaleGender=By.id("Gender_Female");
	
	By txtFirstname=By.xpath("//input[@id='FirstName']");
	
	By txtLastname=By.xpath("//input[@id='LastName']");
	
	By txtDob=By.xpath("//input[@id='DateOfBirth']");
	
	By txtCompanyName=By.xpath("//input[@id='Company']");
	
	By txtAdminComment=By.xpath("//textarea[@id='AdminComment']");
	
	By btnSave=By.xpath("//button[@name='save']");
	
	//Actions Methods
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void clickOnCustomersMenu() {
		driver.findElement(lnkCustomer_menu).click();
	}
	
	public void clickOnCustomersMenuItem() {
		driver.findElement(lnkCustomer_menuitem).click();
	}
	public void clickOnAddnew() {
		driver.findElement(btnAddnew).click();
	}
	public void setEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}
	public void setPassword(String password) {
		driver.findElement(txtpwd).sendKeys(password);
	}
	public void setCustomerRoles(String role) throws Exception {
		/*if(!role.equals("Vendors")) {
			driver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span")).clear();
		}*/
		driver.findElement(txtcutomerRoles).click();
		WebElement listitem;
		Thread.sleep(3000);
		
		if(role.equals("Administrators")) {
			listitem=driver.findElement(lstitemAdministrators);
		}
		else if(role.equals("Guests"))
		{
			listitem=driver.findElement(lstitemGuests);
		}
		else if(role.equals("Registered"))
		{
			listitem=driver.findElement(lstitemRegistered);
		}
		else if(role.equals("Vendors"))
		{
			listitem=driver.findElement(lstitemVendors);
		}
		else {
			listitem=driver.findElement(lstitemGuests);
		}
		//listitem.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", listitem);
	}
	public void setManagerOfVendor(String value) {
		Select drp=new Select(driver.findElement(drpmgrOfVendor));
		drp.selectByVisibleText(value);
	}
	public void setGender(String gender) {
		if(gender.equals("Male")) {
			driver.findElement(rdMaleGender).click();
		}
		else if(gender.equals("Female")) {
			driver.findElement(rdFemaleGender).click();
		}
		else {
			driver.findElement(rdMaleGender).click();
		}
	}
	public void setFirstName(String fname) {
		driver.findElement(txtFirstname).sendKeys(fname);
	}
	public void setLastName(String lname) {
		driver.findElement(txtLastname).sendKeys(lname);
	}
	public void setDOB(String dob) {
		driver.findElement(txtDob).sendKeys(dob);
	}
	public void setCompanyName(String comname) {
		driver.findElement(txtCompanyName).sendKeys(comname);
	}
	public void setAdminComment(String comment) {
		driver.findElement(txtAdminComment).sendKeys(comment);
	}
	public void clickOnSave() {
		driver.findElement(btnSave).click();
	}
}
