package cts.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author supriya
 * @author manasa
 * @author afreen
 *class for assigning leave to an employee
 */
public class AssignLeavePage {
	WebDriver driver;
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
	 * locating fromdate
	 */
	@FindBy(how=How.XPATH,using="//a[contains(text(),'23')]")
	@CacheLookup
	WebElement FromDate;

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
	 * method for Specifiying userid,leavetype and partialdays
	 * @param userid
	 * @param leavetype
	 * @param partialdays
	 */
	public void typeUserNameselectleavetypeandpartialdays(String userid,String leavetype,String partialdays) {
		username.sendKeys(userid);
		LeaveType.sendKeys(leavetype);
		PartialDays.sendKeys(partialdays);

	}
	/**method for Clicking on assign button
	 * 
	 */

	public void clickOnAssignButton() {
		Assign_button.click();
	}
}
