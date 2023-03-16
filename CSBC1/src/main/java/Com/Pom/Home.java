package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.com.Base;

public class Home {

	@FindBy(xpath = "//a[text()='HOME']")
	private WebElement homeLink; // Encuplation(public to private)

	@FindBy(className = "swiper-wrapper")
	private WebElement imageWrapper;

	@FindBy(xpath = "//a[@href='/video_gallery']")
	private WebElement Vidios_viewmore1;

	@FindBy(xpath = "//a[@href='/vip_gallery']")
	private WebElement Vipvisitor_viewmore;

	@FindBy(xpath = "//a[@href='/event_gallery']")
	private WebElement Eventgallery_viewmore;

	private final WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Constructor
	}

	public void clickOnHomeTab() {
		homeLink.click();
	}

	public void clickOnVideosTab() {
		Base.clickElement(driver, Vidios_viewmore1);
	}

	public void clickOnVipvistorsTab() {
		Base.clickElement(driver, Vipvisitor_viewmore);
	}

	public void clickOnEvent_gallaryTab() {
		Base.clickElement(driver, Eventgallery_viewmore);

	}
}