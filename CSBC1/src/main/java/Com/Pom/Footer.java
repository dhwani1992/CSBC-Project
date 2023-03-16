package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.com.Base;

public class Footer {
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement About_Us;

	@FindBy(xpath = "//a[text()='Events']")
	private WebElement Events;

	@FindBy(xpath = "//a[text()='Testimonials']")
	private WebElement Testimonials;

	@FindBy(xpath = "//a[text()='Gallery']")
	private WebElement Gallery;

	@FindBy(xpath = "//a[text()='Help Center']")
	private WebElement Help_Center;

	@FindBy(xpath = "//a[text()='Office Address']")
	private WebElement Office_Address;

	@FindBy(xpath = "//a[text()='Become a Partner']")
	private WebElement Become_a_Partner;

	@FindBy(xpath = "//a[text()='Donation']")
	private WebElement Donation;

	@FindBy(xpath = "//a[text()='Feedback']")
	private WebElement Feedback;
	private final WebDriver driver;

	public Footer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnAbout_Us() {
		Base.clickElement(driver, About_Us);
	}

	public void clickOnEvents() {
		Base.clickElement(driver, Events);
	}

	public void clickOnTestimonials() {
		Base.clickElement(driver, Testimonials);
	}

	public void clickOnGallery() {
		Base.clickElement(driver, Gallery);
	}

	public void clickOnHelp_Center() {
		Base.clickElement(driver, Help_Center);
	}

	public void clickOnOffice_Address() {
		Base.clickElement(driver, Office_Address);
	}

	public void clickOnBecome_a_Partner() {
		Base.clickElement(driver, Become_a_Partner);
	}

	public void clickOnDonation() {
		Base.clickElement(driver, Donation);
	}

	public void clickOnFeedback() {
		Base.clickElement(driver, Feedback);
	}
}
