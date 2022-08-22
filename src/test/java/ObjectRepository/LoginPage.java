package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='loginCont__input']")
	WebElement mobileNumber;

	@FindBy(xpath = "//input[@class='loginCont__btn ']")
	WebElement continueBtn;

	@FindBy(xpath = "//p[text()='Phone number validated']")
	WebElement validateMsg;

	@FindBy(xpath = "//p[text()='Please enter a 10 digit mobile number']")
	WebElement errorMsg;

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getValidateMsg() {
		return validateMsg;
	}

}
