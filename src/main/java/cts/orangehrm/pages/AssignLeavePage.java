package cts.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author supriya pathuri
 *class for assigning leave to an employee
 */
public class AssignLeavePage {
	WebDriver driver;
	@FindBy(how=How.XPATH,using="//td[1]//div[1]//a[1]//img[1]")
	@CacheLookup
	WebElement dbassign;
	/**
	 * locating username
	 */
	@FindBy(how=How.ID,using="assignleave_txtEmployee_empName")
	@CacheLookup
	WebElement username;
	/**
	 * locating leavetype
	 */

	@FindBy(how=How.ID,using="assignleave_txtLeaveType")
	@CacheLookup
	WebElement LeaveType;
	/**
	 * locating from calender
	 */
	@FindBy(how=How.XPATH,using="//li[4]//img[1]")
	@CacheLookup
	WebElement FromDatecalender;
	/**
	 * locating fromdate
	 */
	@FindBy(how=How.XPATH,using="//a[contains(text(),'23')]")
	@CacheLookup
	WebElement FromDate;
	/**
	 * locating to calender
	 */
	@FindBy(how=How.XPATH,using="//li[5]//img[1]")
	@CacheLookup
	WebElement ToDatecalender;

	/**
	 * locating todate
	 */

	@FindBy(how=How.XPATH,using="//a[contains(text(),'30')]")
	@CacheLookup
	WebElement ToDate;
	/**
	 * locating partialdays
	 */
	@FindBy(how=How.ID,using="assignleave_partialDays")
	@CacheLookup
	WebElement PartialDays;
	/**
	 * locating assign button
	 */

	@FindBy(how=How.ID,using="assignBtn")
	@CacheLookup
	WebElement Assign_button;

	/**
	 *  method for Initializing the Objects
	 * @param driver
	 */


	public AssignLeavePage(WebDriver driver)  {
		this.driver=driver;
	}
	/**
	 * method for clicking assignleave
	 */
	public void clickdbassign() {
		dbassign.click();

	}
	/**
	 * method for Specifiying userid
	 * @param userid
	 */
	public void typeUserName(String userid) {
		username.sendKeys(userid);


	}
	/**
	 * method for Specifiying leavetype
	 * @param leavetype
	 */
	public void selectleavetype(String leavetype) {

		LeaveType.sendKeys(leavetype);


	}
	/**
	 * method for Clicking from calender
	 */
	public void clickfromdatecal() {
		FromDatecalender.click();
	}
	/**
	 * method for Clicking on fromdate
	 */
	public void clickfromdate() {
		FromDate.click();
	}
	/**
	 * method for Clicking to calender
	 */
	public void clicktodatecal() {
		ToDatecalender.click();
	}
	/**
	 * method for Clicking to date
	 */
	public void clickOntodate() {
		ToDate.click();
	}
	/**
	 * method for Specifiying partialdays
	 * @param partialdays
	 */
	public void selectpartialdays(String partialdays) {

		PartialDays.sendKeys(partialdays);

	}
	/**method for Clicking on assign button
	 * 
	 */

	public void clickOnAssignButton() {
		Assign_button.click();
	}
}
