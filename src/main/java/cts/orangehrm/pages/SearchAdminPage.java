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
 *class for searching specific system user in admin page
 */
public class SearchAdminPage {
	WebDriver driver;
	/**
	 * locating admin
	 */
	@FindBy(how=How.XPATH,using="//b[contains(text(),'Admin')]")
	@CacheLookup
	WebElement adminbt;

	/**
	 * locating username
	 */
	@FindBy(how=How.ID,using="searchSystemUser_userName")
	@CacheLookup
	WebElement username;

	/**
	 * locating search button
	 */
	@FindBy(how=How.ID,using="searchBtn")
	@CacheLookup
	WebElement Search_button;
	/**
	 * method for Initializing the Objects
	 * @param driver
	 */
	public SearchAdminPage(WebDriver driver)  {
		this.driver=driver;
	}
	/**
	 * method for clicking admin
	 */
	public void clickadmin() {
		adminbt.click();

	}
	/**
	 * method for Specifiying userid
	 * @param userid
	 */


	public void typeUserName(String userid) {
		username.sendKeys(userid);

	}
	/**
	 * method for Clicking on search button
	 */
	public void clickOnSearchButton() {
		Search_button.click();
	}
}
