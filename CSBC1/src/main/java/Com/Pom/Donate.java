package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.com.Base;

public class Donate {
	@FindBy(xpath = "//a[text()='DONATE']")
	private WebElement DonateTab;

	@FindBy(id = ":r0:")
	private WebElement FirstName;

	@FindBy(id = ":r1:")
	private WebElement LastName;;

	@FindBy(id = ":r2:")
	private WebElement Email;

	@FindBy(name = "MobileNumber")
	private WebElement Mobile_number;

	@FindBy(name = "Amount")
	private WebElement Amount;

	@FindBy(xpath = "//span[text()='2,000']")
	private WebElement Rs2k;

	@FindBy(xpath = "//span[text()='5,000']")
	private WebElement Rs5k;

	@FindBy(xpath = "//span[text()='10,000']")
	private WebElement Rs10k;

	@FindBy(xpath = "//span[text()='20,000']")
	private WebElement Rs20k;

	@FindBy(id = ":r5:")
	private WebElement Clear;

	@FindBy(id = ":r6:")
	private WebElement Donate;

	@FindBy(xpath = "//button[@title='Yes, Do Transaction']")
	private WebElement Button;

	@FindBy(xpath = "//input[@name='TransactionID']")
	private WebElement UPI_Txn_ID;

	@FindBy(xpath = "//input[@name='PaymentImage']")
	private WebElement File_upload;

	@FindBy(id = ":rb:")
	private WebElement uploadBtn;

	private final WebDriver driver;

	public Donate(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnDonateTab() {
		DonateTab.click();
	}

	public void clickOnFirstName(String Fname) {
		FirstName.sendKeys(Fname);
	}

	public void clickOnLastName(String LName) {
		LastName.sendKeys(LName);
	}

	public void clickOnEmail(String Email1) {
		Email.sendKeys(Email1);
	}

	public void clickOnMobile_Number(String Mobile_Number) {
		Mobile_number.sendKeys(Mobile_Number);
	}

	public void clickOnAmount(String Amount1) {
		Amount.sendKeys(Amount1);
	}

	public void clickOnRs2k() {
		Base.clickElement(driver, Rs2k);
	}

	public void clickOnRs5k() {
		Base.clickElement(driver, Rs5k);
	}

	public void clickOn10k() {
		Base.clickElement(driver, Rs10k);
	}

	public void clickOn20k() {
		Base.clickElement(driver, Rs20k);
	}

	public void clickOnDonate() {
		Base.clickElement(driver, Donate);
	}

	public void clickOnButton() {
		Base.clickElement(driver, Button);
	}

	public void clickOnUploadBtn() {
		Base.clickElement(driver, uploadBtn);
	}

	public void clickOnUPI_Txn_ID(String UPI_Txn_ID1) {
		UPI_Txn_ID.sendKeys(UPI_Txn_ID1);
	}

	public void clickOnFile_upload() {
		File_upload.sendKeys("C:\\Users\\RnD\\Pictures\\Screenshots\\ss.png");
	}
}
