package dummy.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Question:imlement Singleton pattern
 *
 */
public class App {

	WebDriver driver;

	public WebDriver getDriverInstance() {
		if (driver == null)
			driver = invokeBrowser();
		return driver;

	}

/**
 * Use enum here
 * @return
 */
	private WebDriver invokeBrowser() {

		String browser = "";
		try {
			browser = Common.getValueFromProperty("main","Browser");
			switch (browser.toLowerCase()) {

			case "ie":
				driver = new InternetExplorerDriver();

			case "firefox":
				driver = new FirefoxDriver();

			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")
								+ "//Resources//chromedriver.exe");
				driver = new ChromeDriver();

			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		return driver;
	}

	// to be useful for multiple url

	public void browseUrl(String url) {

		try {
			driver.get(Common.getValueFromProperty("main",url));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
