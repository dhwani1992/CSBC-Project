package Com.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Pom.About_Us;
import Com.Test.common.FooterTest;

public class About_UsTest extends FooterTest {
	About_Us About_Uspage;

	@BeforeMethod
	@Override
	public void hitTheURL() throws InterruptedException {
		super.hitTheURL();
		About_Uspage = new About_Us(getWebDriver());
		About_Uspage.clickOnABOUT_US();
		Thread.sleep(2000);
	}

	@Test
	public void currentURL() throws InterruptedException {
		About_Uspage.clickOnABOUT_US();
		Thread.sleep(5000);
		String actualUrl = getWebDriver().getCurrentUrl();
		String exceptedURL = "https://csbc.consisty.com/about_us";
		Assert.assertEquals(actualUrl, exceptedURL);

	}

	@Test(priority = 1)
	public void testFounderImageDisplay() throws InterruptedException {
		About_Uspage.clickOnABOUT_US();
		Assert.assertTrue(About_Uspage.getFounderImage().isDisplayed());
	}

}
