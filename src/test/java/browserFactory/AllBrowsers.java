package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsers {

	WebDriver driver;
	
	public WebDriver initBrowser(String browserName)
	{
		if(browserName == "Chrome")
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browserName == "ie")
		{
			System.setProperty("webdriver.ie.driver", "E:\\Selenium_1\\Chrome driver\\iedriver.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}
	
}
