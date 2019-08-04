package com.qa.stepDefinition;

import com.qa.pages.CareerPage;
import com.qa.pages.CoreHRPage;
import com.qa.pages.HomePage;
import com.qa.pages.PayrollPage;
import com.qa.pages.SearchJobPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1_stepDefinition extends TestBase {

	@Given("^User is already on ELMO Home page$")
	public void user_is_already_on_ELMO_Home_page() throws Throwable {
		launchBrowserAndEnterURL(prop.getProperty("homeurl"));

	}

	@Given("^Click on Solutions navigation menu$")
	public void click_on_Solutions_nagiation_menu() throws Throwable {
		mouseHover(HomePage.SOLUTIONS);
	}

	@When("^Click on HR Core menu$")
	public void click_on_HR_Core_menu() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		click(HomePage.HR_CORE);
	}

	@Then("^Verify HR Core page url \"([^\"]*)\"$")
	public void verify_HR_Core_page_url(String expectedURL) throws Throwable {
		verifyPageNavigation(expectedURL);
	}

	@Then("^Verify Key Benifits text in the HR Core page \"([^\"]*)\"$")
	public void verify_Key_Benifits_text_in_the_HR_Core_page(String expectedText) throws Throwable {
		verifyExpected(CoreHRPage.KEY_BENEFITS, expectedText);

	}

	@When("^Click on Payroll from the dropdown \"([^\"]*)\"$")
	public void click_on_Payroll_from_the_dropdown(String selectValue) throws Throwable {
		selectByVisibleText(CoreHRPage.PRODUCT_DROPDOWN, selectValue);
	}

	@Then("^Verify Seamless cloud-based payroll and HR solution exists in the page \"([^\"]*)\"$")
	public void verify_Seamless_cloud_based_payroll_and_HR_solution_exists_in_the_page(String expectedText)
			throws Throwable {
		verifyExpected(PayrollPage.PAYROLL_SUBTITLE, expectedText);
		closeAllWindows();

	}

	@Given("^User is already on ELMO Careers page$")
	public void user_is_already_on_ELMO_Careers_page() throws Throwable {
		launchBrowserAndEnterURL(prop.getProperty("careersURL"));
	}

	@Then("^Verify Browse Jobs button exists in the careers page$")
	public void verify_Browse_Jobs_exists_in_the_careers_page() throws Throwable {
		isDisplay(CareerPage.BROWSE_BUTTON);
	}

	@Then("^Open Search Jobs url \"([^\"]*)\"$")
	public void open_Search_Jobs_url(String url) throws Throwable {
		pageNavigation(url);

	}

	@When("^Enter Software Engineer in search jobs text field \"([^\"]*)\"$")
	public void enter_Software_Engineer_in_search_jobs_text_field(String searchJob) throws Throwable {
		switchToFrame(SearchJobPage.frame);
		enterText(SearchJobPage.SEARCH_FIELD, searchJob);
	}

	@When("^Select job type as Permanent Full Time$")
	public void select_job_type_as_Permanent_Full_Time() throws Throwable {
		click(SearchJobPage.JOB_TYPE_DROPDOWN);
		click(SearchJobPage.PERMANENT_JOB_TYPE);
	}

	@When("^Click on Search button$")
	public void Click_on_Search_button() throws Throwable {
		click(SearchJobPage.SEARCH_BUTTON);
		Thread.sleep(5000);
	}

	@Then("^Verify search returns Back End Software Engineer at Sydney Locations \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void verify_search_returns_Back_End_Software_Engineer_at_Sydney_Locations(String backEnd, String location,
			String jobType) throws Throwable {
		containsText(SearchJobPage.BACK_END, backEnd);
		containsText(SearchJobPage.BACK_END, location);
		containsText(SearchJobPage.BACK_END, jobType);

	}

	@Then("^Verify search returns Full Stack Software Engineer at Sydney Locations \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void verify_search_returns_Full_Stack_Software_Engineer_at_Sydney_Locations(String fullStack,
			String location, String jobType) throws Throwable {
		containsText(SearchJobPage.FULL_STACK, fullStack);
		containsText(SearchJobPage.FULL_STACK, location);
		containsText(SearchJobPage.FULL_STACK, jobType);
		closeAllWindows();

	}

}
