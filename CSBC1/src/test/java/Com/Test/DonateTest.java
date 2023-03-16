package Com.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Pom.Donate;
import Com.Test.common.FooterTest;
import Com.Utility.Excelsheel_sheet;

public class DonateTest extends FooterTest {

	Donate Donatepage;

	@BeforeMethod
	@Override
	public void hitTheURL() throws InterruptedException {
		super.hitTheURL();
		Donatepage = new Donate(getWebDriver());
		Donatepage.clickOnDonateTab();
	}

	@Test(priority = 1)
	public void currentURL() {
		String actualUrl = getWebDriver().getCurrentUrl();
		String exceptedURL = "https://csbc.consisty.com/donate";
		Assert.assertEquals(actualUrl, exceptedURL);
	}

	private void fillBasicDetails() throws Exception {
		Donatepage.clickOnDonateTab();
		String Fstname = Excelsheel_sheet.getDataProviderExcelsheet(1, 1);
		Donatepage.clickOnFirstName(Fstname);

		String Lstname = Excelsheel_sheet.getDataProviderExcelsheet(1, 2);
		Donatepage.clickOnLastName(Lstname);

		String Email = Excelsheel_sheet.getDataProviderExcelsheet(1, 3);
		Donatepage.clickOnEmail(Email);

		String Mobile_Number = Excelsheel_sheet.getDataProviderExcelsheet(1, 4);
		Donatepage.clickOnMobile_Number(Mobile_Number);
	}

	private void uploadTransactionDetails() throws Exception {
		Donatepage.clickOnUPI_Txn_ID("56982");
		Donatepage.clickOnFile_upload();
		Donatepage.clickOnUploadBtn();
	}

	@Test(priority = 1)
	public void ClickDonateRandomAmount() throws Exception {
		fillBasicDetails();
		String Amount = Excelsheel_sheet.getDataProviderExcelsheet(1, 5);
		Donatepage.clickOnAmount(Amount);
		Donatepage.clickOnDonate();
		Donatepage.clickOnButton();
		uploadTransactionDetails();
		getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public void ClickDonate2kAmount() throws Exception {
		fillBasicDetails();
		Donatepage.clickOnRs2k();
		Donatepage.clickOnButton();
		uploadTransactionDetails();
		getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 3)
	public void ClickDonate5kAmount() throws Exception {
		fillBasicDetails();
		Donatepage.clickOnRs5k();
		Donatepage.clickOnButton();
		uploadTransactionDetails();
		getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 4)
	public void ClickDonate10kAmount() throws Exception {
		fillBasicDetails();
		Donatepage.clickOn10k();
		Donatepage.clickOnButton();
		uploadTransactionDetails();
		getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 5)
	public void ClickDonate20kAmount() throws Exception {
		fillBasicDetails();
		Donatepage.clickOn20k();
		Donatepage.clickOnButton();
		uploadTransactionDetails();
		getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void ss(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Excelsheel_sheet.getScreenshot(getWebDriver());
		}
	}
}
