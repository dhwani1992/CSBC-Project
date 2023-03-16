package Com.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Pom.Gallery;
import Com.Test.common.FooterTest;
import Com.Utility.Excelsheel_sheet;

public class GalaryTest extends FooterTest {

	Gallery Gpage;

	@BeforeMethod
	@Override
	public void hitTheURL() throws InterruptedException {
		super.hitTheURL();
		Gpage = new Gallery(getWebDriver());
		Gpage.clickOnGALLERY();
		Thread.sleep(1000);
	}

	@Test
	public void titleTest() {
		String actTitle = getWebDriver().getTitle();
		String expectedTitle = "CSBC";
		Assert.assertEquals(actTitle, expectedTitle);
	}

	@Test(priority = 1)
	public void GALLERY_OpenEventGallary() throws InterruptedException {
		Gpage.clickOnEventGallery();
	}

	@Test(priority = 2)
	public void GALLERY_OpenVideoGallary() throws InterruptedException {
		Gpage.clickOnVideo_Gallery();
	}

	@Test(priority = 3)
	public void GALLERY_OpenVIPGallary() throws InterruptedException {
		Gpage.clickOnVIP_Gallery();
	}

	@AfterMethod
	public void ss(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Excelsheel_sheet.getScreenshot(getWebDriver());
		}

	}
}
