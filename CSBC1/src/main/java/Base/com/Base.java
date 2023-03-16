package Base.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver OpenChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();

	}

	public static WebDriver OpenFireFoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();

	}

	public static void clickElement(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

}
