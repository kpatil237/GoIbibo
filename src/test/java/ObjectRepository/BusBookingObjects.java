package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusBookingObjects {
	public WebDriver driver;

	public BusBookingObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='autosuggestBusSRPSrcHome']")

	WebElement from;
	@FindBy(xpath = "//input[@id='autosuggestBusSRPDestHome']")

	WebElement to;
	@FindBy(xpath = "//button[text()='Search Bus']")

	WebElement search;

	@FindBy(xpath = "//body/div[@id='root']/section[@class='SearchResultPagestyles__SeachResultPageWrapper-sc-1i5arlm-0 jMtFId']/section[@id='srpCardLayout']/section[@class='StoriesTestPagestyles__SearchBlockOuterWrapper-sc-11w9nsp-6 eLJizy']/div[@class='SrpMainBlockstyles__SrpcardLayoutDiv-sc-1jttj24-0 jwnhYD']/div[@class='SrpMainBlockstyles__SrpcardInnerLayoutDiv-sc-1jttj24-1 bolzYx']/div[@id='srpCardLayoutinner']/div[@class='SrpCardMainBlockstyles__SrpcardOuterWrapDiv-sc-xam1wr-0 jNLXAN']/div[2]/div[2]/div[2]/p[1]")

	WebElement bus;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getBus() {
		return bus;
	}
	

}
