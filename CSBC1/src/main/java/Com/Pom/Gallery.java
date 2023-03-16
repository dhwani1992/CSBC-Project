package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gallery {
	@FindBy(xpath = "//a[text()= 'GALLERY']")
	private WebElement GALLERY;

	@FindBy(xpath = "//a[text()='Event Gallery']")
	private WebElement Event_Gallery;

	// @FindBy(xpath = "//a[text()= 'GALLERY1']")
	// private WebElement GALLERY1;

	@FindBy(xpath = "//a[text()='Video Gallery']")
	private WebElement VideoGallery;

	@FindBy(xpath = "//a[text()='VIP Gallery']")
	private WebElement VIPGallery;

	public Gallery(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnGALLERY() {
		GALLERY.click();
	}

	public void clickOnEventGallery() {
		Event_Gallery.click();
	}

	public void clickOnVideo_Gallery() {
		VideoGallery.click();
	}

	public void clickOnVIP_Gallery() {
		VIPGallery.click();
	}

}