package Com.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Pom.Event;
import Com.Test.common.FooterTest;

public class EventTest extends FooterTest {
	Event Eventpage;

	@BeforeMethod
	@Override
	public void hitTheURL() throws InterruptedException {
		super.hitTheURL();
		Eventpage = new Event(getWebDriver());
		Eventpage.clickOnEVENT();
	}

	@Test
	public void currentURL() {
		String actualUrl = getWebDriver().getCurrentUrl();
		String exceptedURL = "https://csbc.consisty.com/event";
		Assert.assertEquals(actualUrl, exceptedURL);
	}

	@Test(priority = 1)

	public void Event() throws InterruptedException {
		Eventpage.clickOnEVENT();
		Thread.sleep(5000);
		Eventpage.clickOnFromdate();
		Eventpage.clickOnselectdate();
		Eventpage.clickOnTodate();
		Eventpage.clickOnSelectdate2();
		Eventpage.clickOnSelectText();
		Eventpage.searchbutton();

		// Pending Below, as search is not returning any thing.
		Eventpage.clickOnShowdetails();
		Eventpage.clickOnBooknow1();
		Eventpage.clickOnBooknow2();
		Eventpage.clickOnBooknow3();
		Assert.assertTrue(Eventpage.getImage().isDisplayed());
	}
}
