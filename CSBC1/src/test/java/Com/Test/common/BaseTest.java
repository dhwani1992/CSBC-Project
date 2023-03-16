package Com.Test.common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Base.com.Base;
import Com.Pom.ConfigDataProvider;

public abstract class BaseTest {
	private WebDriver driver;
	private ConfigDataProvider config;

	@BeforeClass
	public void launchTheBrowser() throws InterruptedException, IOException {
		config = new ConfigDataProvider();
		if (config.getbrowser().equalsIgnoreCase("Chrome")) {
			driver = Base.OpenChromeBrowser();
		} else if (config.getbrowser().equalsIgnoreCase("Firefox")) {
			driver = Base.OpenFireFoxBrowser();
		}
		Thread.sleep(2000);
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		if (driver != null) {
			driver.quit();
		}
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	public String getBaseUrl() {
		return config.getBaseUrl();
	}

}