package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.com.Base;

public class Contact_Us {
	@FindBy(xpath = "//a[text()='CONTACT US']")
	private WebElement CONTACT_US;

	@FindBy(xpath = "//a[text()='View larger map ']")
	private WebElement Maps;

	@FindBy(id = ":rb:")
	private WebElement Person_Name;

	@FindBy(id = ":rc:")
	private WebElement Feedback;

	@FindBy(id = ":rd:")
	private WebElement Clear;

	@FindBy(id = ":re:")
	private WebElement Submit;

	private final WebDriver driver;

	public Contact_Us(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnCONTACT_USTab() {
		CONTACT_US.click();
	}

	public void clickOnMapsTab() {
	}

	public void clickOnPerson_Name(String Pname) {
		Person_Name.sendKeys(Pname);
	}

	public void clickOnFeedback(String Feedback1) {
		Feedback.sendKeys(Feedback1);
	}

	public void clickOnClearTab() {
		Base.clickElement(driver, Clear);
	}

	public void clickOnSubmitTab() {
		Base.clickElement(driver, Submit);
	}

}
