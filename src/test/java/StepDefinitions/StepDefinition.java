package StepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.BusBookingObjects;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base {
	public WebDriver driver;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver",
				"/home/htadmin/Documents/SeleniumBDD/goibibo_project/src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().window().maximize();
	}

	@Given("user is on home page")
	public void user_is_on_home_page() throws IOException {

		hp = new HomePage(driver);
		lp = new LoginPage(driver);
		bb = new BusBookingObjects(driver);
		driver.get("https://www.goibibo.com/");

		Assert.assertEquals(true, hp.getHomepage().isDisplayed());
		System.out.println("Goibibo logo is displayed - Assert Passed");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

		hp.getLogin().click();
	}

	@When("user enters mobileNumber using datatable")
	public void user_enters_mobile_number_using_datatable(DataTable dataTable) {

		List<List<String>> data = dataTable.cells();

		lp.getMobileNumber().sendKeys(data.get(1).get(0));

	}

	@And("clicks on continue button")
	public void clicks_on_continue_button() {

		lp.getContinueBtn().click();
	}

	@Then("phone number Validated message is dislpayed")
	public void phone_number_validated_message_is_dislpayed() {

		Assert.assertEquals(true, lp.getValidateMsg().isDisplayed());
		System.out.println("phone number Validated message is dislpayed - Assert Passed");
	}

	@Given("user is on home page of goibibo")
	public void user_is_on_home_page_of_goibibo() {
		hp = new HomePage(driver);
		lp = new LoginPage(driver);

		driver.get("https://www.goibibo.com/");

		Assert.assertEquals(true, hp.getHomepage().isDisplayed());
		System.out.println("Goibibo logo is displayed - Assert Passed");
	}

	@And("^clicks on loginOrSignup button$")
	public void clicks_on_loginOrSignup_button() throws Throwable {
		hp.getLogin().click();
	}

	@When("^user enters wrong (.+)$")
	public void user_enters_wrong(String mobilenumber) throws Throwable {
		lp.getMobileNumber().sendKeys(mobilenumber);
	}

	@And("^clicks on continue$")
	public void clicks_on_continue() throws Throwable {
		lp.getContinueBtn().click();
	}

	@When("^error message is dislpayed$")
	public void error_message_is_dislpayed() throws Throwable {

		Assert.assertEquals(true, lp.getErrorMsg().isDisplayed());
		System.out.println("Please enter a 10 digit mobile number message is dislpayed - Assert Passed");

	}

	@Given("user lands on goibibo website")
	public void user_lands_on_goibibo_website() {
		hp = new HomePage(driver);
		bb = new BusBookingObjects(driver);
		driver.get("https://www.goibibo.com/");
		Assert.assertEquals(true, hp.getHomepage().isDisplayed());
		System.out.println("Goibibo logo is displayed - Assert Passed");
	}

	@Given("user clicks on bus button on homepage")
	public void user_clicks_on_bus_button_on_homepage() {

		hp.getBusLogo().click();
	}

	@When("user enters Souce and Destination")
	public void user_enters_souce_and_destination() throws InterruptedException {

		bb.getFrom().sendKeys("Pu");
		Thread.sleep(2000);
		bb.getFrom().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		bb.getFrom().sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		bb.getTo().sendKeys("Mum");
		Thread.sleep(2000);
		bb.getTo().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		bb.getTo().sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

	@When("clicks on search bus")
	public void clicks_on_search_bus() {
		bb.getSearch().click();
	}

	@Then("buses from source to destination is displayed")
	public void buses_from_source_to_destination_is_displayed() {
		Assert.assertEquals(true, bb.getBus().isDisplayed());
		System.out.println("bus is Displayed - Assert Passed");
	}

	@When("user clicks on Forex tab")
	public void user_clicks_on_forex_tab() {
		hp.getForexTab().click();
	}

	@When("user is navigated to forex page")
	public void user_is_navigated_to_forex_page() {
		Set<String> allwindow = driver.getWindowHandles();

		Iterator<String> s1 = allwindow.iterator();

		while (s1.hasNext()) {
			String chilwindow = s1.next();
			driver.switchTo().window(chilwindow);
		}

	}

	@Then("user is able to verify Forex page title")
	public void user_is_able_to_verify_forex_page_title() {
		String title = driver.getTitle();
		String acutualtitle = "Buy & Sell Forex Online | Foreign Exchange | Forex India - BookMyForex";
		Assert.assertEquals(title, acutualtitle);
		Assert.assertTrue(acutualtitle, true);

		System.out.println(title);
	}

	@After(order = 0)
	public void afterScenario() throws IOException, InterruptedException {
		System.out.println("browser Closed successfully");
		driver.quit();
	}

	@After(order = 1)
	public void scenarioFailure(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(Screenshot, "image/png", "Screenshotfailure");
		}

	}

}
