package Com.Test.common;



import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Pom.Footer;

public abstract class FooterTest extends BaseTest {
	Footer Footerpage;

	@BeforeMethod
	public void hitTheURL() throws InterruptedException {
		getWebDriver().get(getBaseUrl());
		getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getWebDriver().manage().window().maximize();
		Thread.sleep(2000);
		Footerpage = new Footer(getWebDriver());
	}

	@Test(priority = 6)
	public void navigate() throws InterruptedException {
		getWebDriver().navigate().to("https://www.facebook.com/ProNamdevraoJadhav/");
		Thread.sleep(2000);
		getWebDriver().navigate().back();
	}

	@Test(priority = 7)

	public void navigate1() throws InterruptedException {

		getWebDriver().navigate().to("https://twitter.com/namdevraojadhav");

		Thread.sleep(2000);
		getWebDriver().navigate().back();
	}

	@Test(priority = 8)
	public void navigate2() throws InterruptedException {
		getWebDriver().navigate().to("https://www.instagram.com/prof_namdevrao_jadhav/");
		Thread.sleep(1000);
		getWebDriver().navigate().back();
	}

	@Test(priority = 9)
	public void navigate3() throws InterruptedException {
		getWebDriver().navigate().to("https://www.youtube.com/@NamdevraoJadhav");
		Thread.sleep(1000);
		getWebDriver().navigate().back();
	
		Footerpage.clickOnAbout_Us();
		Footerpage.clickOnEvents();
		Footerpage.clickOnTestimonials();
		Footerpage.clickOnGallery();
		Footerpage.clickOnHelp_Center();
		Footerpage.clickOnOffice_Address();
		Footerpage.clickOnBecome_a_Partner();
		Footerpage.clickOnDonation();
		Footerpage.clickOnFeedback();
		
		
	}
	


	

		
	}
