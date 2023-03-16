package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Event {
	@FindBy(xpath = "//a[text()='EVENT']")
	private WebElement EVENT;

	@FindBy(id = ":r0:")
	private WebElement fromdate;

	@FindBy(xpath = "//input[@id=':r0:']/following-sibling::div/button[contains(@class, 'css-slyssw')]")
	private WebElement selectdate;

	@FindBy(id = ":r1:")
	private WebElement todate;

	@FindBy(xpath = "//input[@id=':r1:']/following-sibling::div/button[contains(@class, 'css-slyssw')]")
	private WebElement selectdate2;

	@FindBy(xpath = "//input[@id=':r2:']")
	private WebElement SearchTextbox;

	@FindBy(id = ":r3:")
	private WebElement Searchbutton;

	@FindBy(xpath = "//div[@class='MuiCardMedia-root css-tmr11v']")
	private WebElement Image;

	@FindBy(xpath = "//Button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall css-qwokl5']")
	private WebElement showdetails;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth css-rsbt7j]']")
	private WebElement booknow1;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth css-rsbt7j']")
	private WebElement booknow2;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth css-rsbt7j']")
	private WebElement booknow3;

	// Test to validate Valid XPath -> document.evaluate("//input[@id=':r1:']/following-sibling::div/button[contains(@class, 'css-slyssw')]", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null)
	
	public Event(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnEVENT() {
		EVENT.click();
	}

	public void clickOnFromdate() {
		fromdate.click();
	}

	public void clickOnselectdate() {
		selectdate.click();
	}

	public void clickOnTodate() {
		todate.click();
	}

	public void clickOnSelectdate2() {
		selectdate2.click();
	}

	public void clickOnSelectText() {
		SearchTextbox.sendKeys("Event");
	}

	public void searchbutton() {
		Searchbutton.click();
	}

	public void clickOnShowdetails() {
		showdetails.click();
	}

	public void clickOnBooknow1() {
		booknow1.click();
	}

	public void clickOnBooknow2() {
		booknow2.click();
	}

	public void clickOnBooknow3() {
		booknow3.click();
	}

	public WebElement getImage() {
		return Image;
	}

}
