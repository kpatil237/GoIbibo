package StepDefinitions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LiveTrainStatus {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"/home/htadmin/Documents/SeleniumBDD/goibibo_project/src/test/resources/Drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();

	driver.get("https://www.goibibo.com/");
	driver.findElement(By.xpath("//span[@class='header-sprite nav-icon-trains gr-append-right5']")).click();
	
	WebElement liveBtn = driver.findElement(By.xpath("//span[@class='trainsServicesSprite trainRunningStatus']"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	Thread.sleep(2000);
	
	js.executeScript("arguments[0].scrollIntoView(true);", liveBtn);
	
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", liveBtn);
	
	
	Set<String> allwindow = driver.getWindowHandles();

	Iterator<String> s1 = allwindow.iterator();

	while (s1.hasNext()) {
		String chilwindow = s1.next();
		driver.switchTo().window(chilwindow);
	
	}
	
	
	WebElement trainNo = driver.findElement(By.xpath("//input[@role='combobox']"));
	
	trainNo.sendKeys("12952");
	
	Actions action = new Actions(driver);
   
	
	WebElement rajdhani = driver.findElement(By.xpath("//span[text()='TEJAS RAJDHANI (12952)']"));
	Thread.sleep(2000);
	action.moveToElement(rajdhani).perform();
    Thread.sleep(2000);
    action.click(rajdhani).perform();
	//builder.click(rajdhani).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Check live train status']")).click();
	
	WebElement start = driver.findElement(By.xpath("//span[normalize-space()='STARTING STATION']"));
	
	Assert.assertTrue("STARTING STATION Displayed", start.isDisplayed());
	/* Assert.assertEquals(true, start.isDisplayed()); */
	
	
	WebElement end = driver.findElement(By.xpath("//span[normalize-space()='ENDING STATION']"));
	
	
	js.executeScript("arguments[0].scrollIntoView(true);", end);
	
	Assert.assertEquals(true, end.isDisplayed());
	
	
}
}