package StepDefinitions;

import org.openqa.selenium.WebDriver;
import ObjectRepository.BusBookingObjects;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class Base {

	public WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	public BusBookingObjects bb;

	/*
	 * @Before public void beforeScenario() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "/home/htadmin/Documents/SeleniumBDD/goibibo_project/src/test/resources/Drivers/chromedriver"
	 * ); driver = new ChromeDriver();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	 * driver.manage().window().maximize(); }
	 * 
	 * @After(order=0) public void afterScenario() throws IOException,
	 * InterruptedException { System.out.println("browser Closed successfully");
	 * driver.quit(); }
	 * 
	 * @After(order=1) public void scenarioFailure(Scenario scenario) {
	 * if(scenario.isFailed()) { byte[] Screenshot =
	 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	 * scenario.attach(Screenshot, "image/png","Screenshotfailure"); } }
	 */

//	public Properties prop;
//	private String url;

	/*
	 * String basepath = System.getProperty("user.dir");
	 * 
	 * 
	 * public WebDriver initializeDriver() throws IOException {
	 * 
	 * 
	 * String propertiesPath = basepath + "/src/test/java/config/data.properties";
	 * prop = new Properties();
	 * 
	 * FileInputStream fis = new FileInputStream(propertiesPath); prop.load(fis);
	 * 
	 * String browserName = prop.getProperty("browser");
	 * 
	 * url=prop.getProperty(url);
	 * 
	 * 
	 * 
	 * if (browserName.equalsIgnoreCase("chrome")) {
	 * System.setProperty("webdriver.chrome.driver",
	 * "/home/htadmin/Documents/SeleniumBDD/goibibo_project/src/test/resources/Drivers/chromedriver"
	 * ); driver = new ChromeDriver();
	 * 
	 * } else if (browserName.equalsIgnoreCase("firefox")) {
	 * System.setProperty("webdriver.gecko.driver",
	 * "/home/htadmin/Documents/SeleniumBDD/goibibo_project/src/test/resources/Drivers/geckodriver"
	 * ); driver = new FirefoxDriver();
	 * 
	 * } else { Assert.assertFalse(
	 * true,"Invalid browser, please specify correct browser name in the properties file"
	 * ); }
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	 * driver.manage().window().maximize(); return driver; }
	 * 
	 * 
	 * public String getUrl() { return url; }
	 */

}
