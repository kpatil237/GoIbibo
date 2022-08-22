//package config;
// 
// import java.io.FileInputStream; import java.io.FileOutputStream; import
// java.io.IOException; import java.io.InputStream; import java.io.OutputStream;
// import java.util.Properties;
// 
// import StepDefinitions.StepDefinition;
// 
// public class PropertiesFile {
// 
//  static Properties prop = new Properties(); static String basepath =
//  System.getProperty("user.dir");
//  
//  public static void main(String[] args) throws IOException { getProperties();
// setProperties(); getProperties();
//  
// }
//  
//  public static void getProperties() { try { Properties prop = new
//  Properties(); InputStream input = new FileInputStream(basepath +
//  "/src/test/java/config/data.properties"); prop.load(input); String browser =
//  prop.getProperty("browser");
//  
//  System.out.println(browser); StepDefinition.browserName = browser;
//  
//  } catch (Exception exp) { System.out.println(exp.getMessage());
// System.out.println(exp.getCause()); exp.printStackTrace();
//  
//  }
//  
//  }
//  
//  public static void setProperties() { try { OutputStream output = new
//  FileOutputStream(basepath + "/src/test/java/config/data.properties");
//  prop.setProperty("browser", "chrome"); prop.store(output, null);
//  
//  } catch (Exception exp) { System.out.println(exp.getMessage());
//  System.out.println(exp.getCause()); exp.printStackTrace(); }
//  
//  }
//  
//  }
//
//
//
//
//
//
///*
//	 * @Before
//	 * 
//	 * public void setupTest() throws IOException {
//	 */
//	/*
//	 * PropertiesFile.getProperties();
//	 * 
//	 * if (browserName.equalsIgnoreCase("chrome")) {
//	 * System.setProperty("webdriver.chrome.driver",
//	 * "/home/htadmin/Documents/SeleniumBDD/goibibo_project/src/test/resources/Drivers/chromedriver"
//	 * ); driver = new ChromeDriver();
//	 * 
//	 * } else if (browserName.equalsIgnoreCase("firefox")) {
//	 * System.setProperty("webdriver.gecko.driver",
//	 * "/home/htadmin/Documents/SeleniumBDD/goibibo_project/src/test/resources/Drivers/geckodriver"
//	 * ); driver = new FirefoxDriver();
//	 * 
//	 * }
//	 * 
//	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//	 * driver.manage().window().maximize(); }
//	 */