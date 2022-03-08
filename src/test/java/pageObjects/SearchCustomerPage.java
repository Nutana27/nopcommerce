package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class SearchCustomerPage {
	public WebDriver driver;
	WaitHelper waithelper;
	
	public SearchCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		waithelper=new WaitHelper(driver);
	}
	
	@FindBy(xpath="//input[@id='SearchEmail']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='SearchFirstName']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='SearchLastName']")
	WebElement txtLastName;
	
	/*@FindBy(xpath="//select[@id='SearchMonthOfBirth']")
	WebElement drpdobMonth;
	
	@FindBy(xpath="//select[@id='SearchDayOfBirth']")
	WebElement drpdobDay;
	
	@FindBy(xpath="//input[@id='SearchCompany']")
	WebElement txtCompany;
	
	@FindBy(xpath="SearchIpAddress")
	WebElement txtIpAddr;
	
	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement txtCustomerRoles;
	
	@FindBy(xpath="//li[contains(text(),'Registered')]")
	WebElement lstitemRegistered;
	
	@FindBy(xpath="//li[contains(text(),'Administrators')]")
	WebElement lstitemAdministrators;
	
	@FindBy(xpath="//li[contains(text(),'Guests')]")
	WebElement lstitemGuests;
	
	@FindBy(xpath="//li[contains(text(),'Vendors')]")
	WebElement lstitemVendors;
	*/
	
	@FindBy(xpath="//button[@id='search-customers']")
	WebElement btnSearch;
	
	@FindBy(xpath="//table[@role='grid']")
	WebElement tblSearchResults;
	
	@FindBy(xpath="//div[@class=\"dataTables_scroll\"]")
	WebElement table;
	
	@FindBy(xpath="//div[@class=\"dataTables_scrollBody\"]//tbody/tr")
	List<WebElement> tableRows;
	
	@FindBy(xpath="//div[@class=\"dataTables_scrollBody\"]//tbody/tr/td")
	List<WebElement> tableColumns;
	
	public void setEmail(String email) {
		waithelper.WaitForElement(txtEmail, 30);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setFirstName(String fname) {
		waithelper.WaitForElement(txtFirstName, 30);
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);
	}
	public void setLastName(String lname) {
		waithelper.WaitForElement(txtLastName, 30);
		txtLastName.clear();
		txtLastName.sendKeys(lname);
	}
	
	public void clickSearch() {
		btnSearch.click();
		waithelper.WaitForElement(btnSearch, 30);
	}
	
	public int getNoOfRows() {
		return(tableRows.size());
	}
	
	public int getNoOfColumns() {
		return(tableColumns.size());
	}
	
	public boolean searchCustomerByEmail(String email) {
		boolean flag=false;
		for(int i=1;i<=getNoOfRows();i++) {
			String emailid=table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(emailid);
			
			if(emailid.equals(email)) {
				flag=true;
			}
		}
		return flag;
	}
	public boolean searchCustomerByName(String Name) {
		boolean flag=false;
		
		for(int i=1;i<=getNoOfRows();i++) {
			String name=table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[3]")).getText();
			String names[]=name.split(" ");
			if(names[0].equals("Victoria") && names[1].equals("Terces"))
			{
				flag=true;
			}
		}
		return flag;
	}
}
