package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2EndBooking {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/home/htadmin/Documents/SeleniumBDD/goibibo_project/src/test/resources/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/");

		driver.findElement(By.xpath("//div[@class='sc-ikJyIC FVoNM']//li[1]")).click();

		driver.findElement(By.xpath(
				"//div[@class='seo-srp-layoutstyles__RightWrap-sc-11ypfer-3 eKSGbU']//div//div[2]//div[1]//div[2]//div[2]//div[2]//div[1]//button[1]"))
				.click();

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]"))
				.click();
		driver.findElement(By.xpath(
				"//button[@class='dweb-commonstyles__ButtonBase-sc-13fxsy5-4 dweb-commonstyles__InsuranceButton-sc-13fxsy5-5 dweb-commonstyles__InsuranceUnselectButton-sc-13fxsy5-7 lkvczT eJvGX hbLfKZ']"))
				.click();
		WebElement title = driver
				.findElement(By.xpath("//select[@class='common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 iRNcHD']"));

		Select select = new Select(title);

		select.selectByVisibleText("Mr");
		driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']")).sendKeys("Kiran");
		driver.findElement(By.xpath("//input[@placeholder='First & Middle Name'] ")).sendKeys("Patil");

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("wnoqn@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys("8605065964");

		driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='TICKET DETAILS']")).isDisplayed();

		
		driver.quit();
	}

}
