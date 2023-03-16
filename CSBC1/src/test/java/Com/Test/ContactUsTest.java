package Com.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Pom.Contact_Us;
import Com.Test.common.FooterTest;

public class ContactUsTest extends FooterTest {
	Contact_Us Contact_Uspage;

	@BeforeMethod
	@Override
	public void hitTheURL() throws InterruptedException {
		super.hitTheURL();
		Contact_Uspage = new Contact_Us(getWebDriver());
		Contact_Uspage.clickOnCONTACT_USTab();
		Thread.sleep(2000);
	}

	@Test
	public void currentURL() throws InterruptedException {
		Contact_Uspage.clickOnCONTACT_USTab();
		Thread.sleep(5000);
		String actualUrl = getWebDriver().getCurrentUrl();
		String exceptedURL = "https://csbc.consisty.com/contact_us";
		Assert.assertEquals(actualUrl, exceptedURL);
	}

	@Test(priority = 1)
	public void Contact_Us() throws InterruptedException {
		Contact_Uspage.clickOnCONTACT_USTab();
		Thread.sleep(5000);
		Contact_Uspage.clickOnMapsTab();
		Contact_Uspage.clickOnPerson_Name("Test");
		Contact_Uspage.clickOnFeedback("Test");
		Contact_Uspage.clickOnClearTab();
		Contact_Uspage.clickOnPerson_Name("Dhwani");
		Contact_Uspage.clickOnFeedback("Good");
		Contact_Uspage.clickOnSubmitTab();
	}

}
