package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class About_Us {
	@FindBy(xpath = "//a[text()='ABOUT US']")
	private WebElement ABOUT_US; // Encuplation(public to private)

	@FindBy(xpath = "//img[@class='self-stretch relative rounded-[8px] max-w-full overflow-hidden object-cover']")
	private WebElement FounderImage;

	public About_Us(WebDriver driver) {
		PageFactory.initElements(driver, this); // Constructor
	}

	public void clickOnABOUT_US() {
		ABOUT_US.click();
	}

	public WebElement getFounderImage() {
		return FounderImage;
	}
}