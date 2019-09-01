package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;

	//init WebDriver
	private static WebDriver driver;

	String browserSpecified;
	//waits
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 40;
	public final static int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver(String givenBrowser) {	

		browserSpecified = givenBrowser;

		if (browserSpecified.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		if (browserSpecified.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);

	}

	public static void launchPage(String url) {

		driver.get(url);
	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static void setUpDriver(String browser) {

		if(seleniumDriver ==null) {

			seleniumDriver = new SeleniumDriver(browser);
		}
	}

	public static void tearDown() {

		if(driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}

}
