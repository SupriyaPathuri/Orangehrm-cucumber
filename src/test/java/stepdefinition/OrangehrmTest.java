package stepdefinition;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cts.orangehrm.pages.AssignLeavePage;
import cts.orangehrm.pages.LoginPageWithPageFactory;
import cts.orangehrm.pages.SearchAdminPage;
import cts.orangehrm.pages.SearchDirectoryPage;
import cts.orangehrm.utility.BrowserFactory;
import cts.orangehrm.utility.Configreader;
import cts.orangehrm.utility.ExcelDataConfig;
import cts.orangehrm.utility.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * class created to write test cases for login,navigating to url,doing some operations and logout.
 * @author afreen
 *
 */
public class OrangehrmTest {
	WebDriver driver;
	Configreader config = new Configreader();
	ExcelDataConfig configExcel=new ExcelDataConfig(config.getExcelpath());
	LoginPageWithPageFactory login;
	AssignLeavePage page;
	SearchAdminPage adminpage;
	SearchDirectoryPage dirpage;
	/**
	 * method to get extentreports
	 */
	public static ExtentReports report = new ExtentReports("./Reports/ExtentReport.html");
	ExtentTest test = report.startTest("orangehrmtest");
	Screenshot ob=new Screenshot();	
	Logger logger;
	@Given("^Open chrome and start application$")
	/**
	 * method to open browser
	 * @throws Throwable
	 */
	public void open_chrome_and_start_application() throws Throwable {
		logger =Logger.getLogger("stepdefinition");
		PropertyConfigurator.configure("Log4j.properties");

		BrowserFactory b = new BrowserFactory();
		logger.info("Chrome Driver Opened");
		driver = b.startBrowser("chrome", config.getApplicationURL());
		logger.info("Navigated to URL");
		login=PageFactory.initElements(driver, LoginPageWithPageFactory.class);
	}
	@When("^I enter valid \"([^\"]*)\"$")
	/**
	 * method to enter username and password for login
	 * @param usernameNumber
	 * @throws Throwable
	 */
	public void i_enter_valid_and_valid(String usernameNumber) throws Throwable {
		Object[][] data=configExcel.passData();
		String username="";
		String password="";

		if(null!= usernameNumber ) {
			int userCount = Integer.parseInt(usernameNumber.trim());

			username = (String )data[userCount-1][0];
			password = (String )data[userCount-1][1];	
			test.log(LogStatus.PASS, "Authentication sucessfully");
		}
		login.typeUserNameAndPassword(username, password);
		logger.info("Credentials entered");
	}
	@When("^user should be able to login$")
	/**
	 * method to successfull login
	 */
	public void user_should_be_able_to_login() throws Throwable {
		login.clickOnLoginButton();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		test.log(LogStatus.PASS, "Authentication sucessfully");
		System.out.println("User is able to login sucessfully"); 
	}
	@When("^admin is clicked$")
	/**
	 * method to click admin
	 * @throws Throwable
	 */
	public void admin_is_clicked() throws Throwable {
		adminpage=PageFactory.initElements(driver, SearchAdminPage.class);
		adminpage.clickadmin();
		logger.info("Admin is clicked");
	}
	@When("^I enter valid username$")
	/**
	 * method to enter username
	 * @throws Throwable
	 */
	public void i_enter_valid_username() throws Throwable {
		adminpage.typeUserName("Admin");
		ob.getScreenshot(driver);
		logger.info("username entered");
	}

	@When("^clicking the Search button$")
	/**
	 * method to click search button
	 * @throws Throwable
	 */
	public void clicking_the_Search_button() throws Throwable {
		adminpage.clickOnSearchButton();
		logger.info("Search button clicked");
	}
	@When("^directory is clicked$")
	/**
	 * method to click directory 
	 * @throws Throwable
	 */
	public void directory_is_clicked() throws Throwable {
		dirpage=PageFactory.initElements(driver, SearchDirectoryPage.class);
		dirpage.clickdirectry();
		ob.getScreenshot(driver);
		logger.info("Directory is clicked");
	}
	@When("^I enter valid name$")
	/**
	 * method to enter employee name
	 * @throws Throwable
	 */
	public void i_enter_valid_name() throws Throwable {
		dirpage.typeemployeename("Steven Edwards");
		logger.info("Employee name entered");
	}
	@When("^click the Search button$")
	/**
	 * method to click search button
	 * @throws Throwable
	 */
	public void click_the_Search_button() throws Throwable {
		dirpage.clickOnSearchButton();
		logger.info("Search button clicked");
	}
	@When("^In dashboard assign leave is clicked$")
	/**
	 * method to click assign leave in dashboard
	 * @throws Throwable
	 */
	public void in_dashboard_assign_leave_is_clicked() throws Throwable {
		page=PageFactory.initElements(driver, AssignLeavePage.class);
		page.clickdbassign();
		logger.info("Assign leave is clicked ");
	}

	@When("^I enter valid Employee Name$")
	/**
	 * method to enter employee name to assign leave
	 * @throws Throwable
	 */
	public void i_enter_valid_Employee_Name() throws Throwable {
		page.typeUserName("Steven Edwards");
		ob.getScreenshot(driver);
		logger.info("Employee name entered");
	}

	@When("^select leave type$")
	/**
	 * method to select leave type
	 * @throws Throwable
	 */
	public void select_leave_type() throws Throwable {
		page.selectleavetype("Vacation US");
		logger.info("leave type selected");
	}
	/**
	 * method to click from calender
	 * @throws Throwable
	 */
	@When("^I click from calender$")
	public void i_click_from_calender() throws Throwable {
		page.clickfromdatecal();
		logger.info("From calender clicked");
	}
	@When("^I enter from date$")
	/**
	 * method to enter from date
	 * @throws Throwable
	 */
	public void i_enter_from_date() throws Throwable {

		page.clickfromdate();
		logger.info("From date entered");
	}
	/**
	 * method to click to calender
	 * @throws Throwable
	 */
	@When("^I click to calender$")
	public void i_click_to_calender() throws Throwable {
		page.clicktodatecal();
		logger.info("To calender clicked");

	}

	@When("^I enter to date$")
	/**
	 * method to enter todate 
	 * @throws Throwable
	 */
	public void i_enter_to_date() throws Throwable {

		page.clickOntodate();
		logger.info("To date entered");
	}

	@When("^I select Partial days$")
	/**
	 * method to select partial days
	 * @throws Throwable
	 */
	public void i_select_Partial_days() throws Throwable {
		page.selectpartialdays("All Days");
		logger.info("Partial days selected");
	}

	@When("^clicking the Assign button$")
	/**
	 * method to click assign button
	 * @throws Throwable
	 */
	public void clicking_the_Assign_button() throws Throwable {
		page.clickOnAssignButton();
		logger.info("Assign button clicked");

	}

	@Then("^leave is assigned to employee$")
	/**
	 * method to assign leave
	 * @throws Throwable
	 */
	public void leave_is_assigned_to_employee() throws Throwable {
		System.out.println("leave assigned sucessfully"); 
		logger.info("Leave assigned ");
		TimeUnit.SECONDS.sleep(5);
		driver.quit();
	}

	@Then("^user details displayed$")
	/**
	 * method to display details
	 * @throws Throwable
	 */
	public void user_details_displayed() throws Throwable {
		System.out.println("User details displayed sucessfully"); 
		logger.info("User details displayed");
		TimeUnit.SECONDS.sleep(5);
		driver.quit();

	}

	@Then("^application should be closed$")
	/**
	 * method to close applicaton
	 * @throws Throwable
	 */
	public void application_should_be_closed() throws Throwable {
		logger.info("Application is closed");
		TimeUnit.SECONDS.sleep(5);
		driver.quit();
		report.endTest(test);
		report.flush();

	}

}
