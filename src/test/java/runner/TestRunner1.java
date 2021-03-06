package runner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@RunWith(Cucumber.class)
@CucumberOptions(features="features",
tags= {"@admin"},
glue= {"stepdefinition"},
plugin= {"html:target/cucumber-html.report"})
/**
 * class created to run admin page
 * @author supriya pathuri
 */
public class TestRunner1 {
	private TestNGCucumberRunner testRunner;



	@BeforeClass
	/**
	 * method to method for Initializing the Objects
	 */
	public void setUP()
	{
		testRunner = new TestNGCucumberRunner(TestRunner1.class);			
	}

	@Test(description="search",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	@DataProvider(name="features")
	/**
	 * method to read the test data from features
	 * @return data
	 */
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}

	@AfterClass
	/**
	 * method to close the page
	 * @throws InterruptedException
	 */
	public void tearDown() throws InterruptedException
	{		
		testRunner.finish();


	}


}
