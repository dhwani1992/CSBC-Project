package Com.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Pom.Home;
import Com.Test.common.FooterTest;

public class HomeTest extends FooterTest {
	Home homepage;

	@BeforeMethod
	@Override
	public void hitTheURL() throws InterruptedException {
		super.hitTheURL();
		homepage = new Home(getWebDriver());
		homepage.clickOnHomeTab();
		Thread.sleep(2000);
	}

	@Test
	public void currentURL() throws InterruptedException {
		homepage.clickOnHomeTab();
		Thread.sleep(2000);
		String actualUrl = getWebDriver().getCurrentUrl();
		String exceptedURL = "https://csbc.consisty.com/home";
		Assert.assertEquals(actualUrl, exceptedURL);
	}

	@Test
	public void titleTest() throws InterruptedException {
		homepage.clickOnHomeTab();
		Thread.sleep(2000);
		String actTitle = getWebDriver().getTitle();
		String expectedTitle = "CSBC";
		Assert.assertEquals(actTitle, expectedTitle);
	}

	@Test
	public void home() throws InterruptedException {
		homepage.clickOnHomeTab();
		Thread.sleep(2000);
		homepage.clickOnVideosTab();
		homepage.clickOnHomeTab();
		Thread.sleep(2000);
		homepage.clickOnVipvistorsTab();
		homepage.clickOnHomeTab();
		Thread.sleep(2000);
		homepage.clickOnEvent_gallaryTab();
	}
}