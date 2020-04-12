package cts.orangehrm.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
/**
 * @author supriya pathuri
 * class for logging into website with valid credentials
 *
 */
public class LoginPageWithPageFactory {
	WebDriver driver;
	/**
	 * locating username
	 */
	@FindBy(how=How.ID,using="txtUsername")
	@CacheLookup
	WebElement username;
	/**
	 * locating password
	 */
	@FindBy(how=How.ID,using="txtPassword")
	@CacheLookup
	WebElement password;
	/**
	 * locating login button
	 */
	@FindBy(how=How.ID,using="btnLogin")
	@CacheLookup
	WebElement Login_button;
	/**
	 * method for Initializing the Objects
	 * @param driver
	 */
	public LoginPageWithPageFactory(WebDriver driver)  {
		this.driver=driver;
	}
	/**
	 * method for Specifiying email and psswd
	 * @param userid
	 * @param pass
	 */
	public void typeUserNameAndPassword(String userid,String pass) {
		username.sendKeys(userid);
		password.sendKeys(pass);
	}
	/**
	 * method for Clicking on Login button
	 */
	public void clickOnLoginButton() {
		Login_button.click();

	}

}
