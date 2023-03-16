package Com.Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Pom.Login;
import Com.Test.common.BaseTest;

public class LoginTest extends BaseTest {

	Login LOGINPAGE;

	@BeforeMethod
	public void hitTheURL() throws InterruptedException {
		getWebDriver().get(getBaseUrl());
		getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getWebDriver().manage().window().maximize();
		Thread.sleep(2000);
		LOGINPAGE = new Login(getWebDriver());
	}

	@Test(priority = 1)
	public void currentURL() throws InterruptedException {
		LOGINPAGE.clickOnLogin();
		Thread.sleep(3000);
		String actualUrl = getWebDriver().getCurrentUrl();
		String exceptedURL = "https://csbc.consisty.com/login";
		Assert.assertEquals(actualUrl, exceptedURL);
	}

	@Test(priority = 2)
	public void titleTest() {
		String actTitle = getWebDriver().getTitle();
		String expectedTitle = "CSBC";
		Assert.assertEquals(actTitle, expectedTitle);
	}

	@Test(priority = 3)
	public void VerifyLogInPage() throws InterruptedException {
		LOGINPAGE.VerifyLogInPage();
	}

}
