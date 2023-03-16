package Com.Pom;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() throws IOException {

		try (InputStream input = ConfigDataProvider.class.getClassLoader()
				.getResourceAsStream("configure.properties")) {
			pro = new Properties();
			pro.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public String getbrowser() {
		return pro.getProperty("BrowserName");
	}

	public String getBaseUrl() {
		return pro.getProperty("Base_Url");

	}

	public static void main(String[] args) throws IOException {
		ConfigDataProvider cdp = new ConfigDataProvider();
		System.out.println(cdp.getbrowser());
		System.out.println(cdp.getBaseUrl());
	}
}
