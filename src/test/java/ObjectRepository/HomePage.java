package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='header-sprite logo']")

	WebElement homepageLogo;
	@FindBy(xpath = "//div[@class='login__tab_wrapper']")

	WebElement login;

	@FindBy(xpath = "//span[@class='header-sprite nav-icon-bus gr-append-right5']")
	WebElement busLogo;
	
	@FindBy(xpath = "//span[@class='nav-link-svg']//*[name()='svg']")
	WebElement forexTab;
	

	public WebElement getHomepage() {
		return homepageLogo;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getBusLogo() {
		return busLogo;
	}

	public WebElement getForexTab() {
		return forexTab;
	}
	
	

}
