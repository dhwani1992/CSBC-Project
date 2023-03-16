package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(linkText = "LOG IN")
	private WebElement Login;

	@FindBy(name = "UserName")
	private WebElement username;

	@FindBy(name = "Password")
	private WebElement passward;

//	@FindBy (xpath="//span[@class='MuiTouchRipple-root css-w0pj6f']")
//	private WebElement hide_show;

	@FindBy(id = ":r2:")
	private WebElement sign_in;

	@FindBy(linkText = "Forgot password?")
	private WebElement forgotPassword;

	@FindBy(name = "MobileNumber")
	private WebElement mobile_number;

	@FindBy(id = ":r1:")
	private WebElement Proceed_Button;

	@FindBy(linkText = "Return to Login")
	private WebElement Return_to_login;

	@FindBy(linkText = "Sign Up")
	private WebElement Sign_up;

	@FindBy(name = "MobileNumber")
	private WebElement mobilenumber;

	@FindBy(id = ":r1:")
	private WebElement Generate_OTP;

	@FindBy(linkText = "Already have an account? Login")
	private WebElement return_to_login;

	@FindBy(xpath = "//img[@alt='PlayStore link']")
	private WebElement Google_play_Img;

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	public void clickOnLogin() {
		Login.click();
	}

	public void VerifyLogInPage() throws InterruptedException {

		clickOnLogin();
		Thread.sleep(3000);

		username.sendKeys("1234567890");
		Thread.sleep(3000);

		passward.sendKeys("abcd@1233");
		Thread.sleep(3000);

		// hide_show.click();
		// Thread.sleep(3000);

		sign_in.click();
		Thread.sleep(3000);

		forgotPassword.click();
		Thread.sleep(3000);

		mobile_number.sendKeys("1234567890");
		Thread.sleep(3000);

		Proceed_Button.click();
		Thread.sleep(3000);

		Return_to_login.click();
		Thread.sleep(3000);

		Sign_up.click();
		Thread.sleep(3000);

		mobilenumber.sendKeys("9960037330");
		Thread.sleep(3000);

		Generate_OTP.click();
		Thread.sleep(3000);

		return_to_login.click();
		Thread.sleep(3000);

		Google_play_Img.click();
		Thread.sleep(3000);
	}
}
