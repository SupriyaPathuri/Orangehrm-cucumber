package cts.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author supriya pathuri
 *class for searching details about an employee in directoty page
 */
public class SearchDirectoryPage {
	WebDriver driver;
	/**
	 * locating Directory
	 */
	@FindBy(how=How.XPATH,using="//b[contains(text(),'Directory')]")
	@CacheLookup
	WebElement directory;
	/**
	 * locating userid
	 */
	
	@FindBy(how=How.ID,using="searchDirectory_emp_name_empName")
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
	public SearchDirectoryPage(WebDriver driver)  {
		this.driver=driver;
	}
	/**
	 * method for clicking dirctry
	 */
	public void clickdirectry() {
		directory.click();

	}
	/**
	 * method for Specifiying userid
	 * @param userid
	 */
	
	public void typeemployeename(String userid) {
		username.sendKeys(userid);

	}
	/**
	 * method for Clicking on search button
	 */
	public void clickOnSearchButton() {
		Search_button.click();
	}
}
