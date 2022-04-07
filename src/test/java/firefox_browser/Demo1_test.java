package firefox_browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Demo1_test 
{
	@Test
	public void configRemoteclass() throws MalformedURLException
	{
//		URL url = new URL("http://172.31.31.73:1111/wd/hub");
//		ChromeOptions options = new ChromeOptions();
//		options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
//		options.addArguments("--headless");
//		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
//	//	DesiredCapabilities cap = new DesiredCapabilities();
////		cap.setPlatform(Platform.WINDOWS);
////		cap.setBrowserName("chrome");
//		RemoteWebDriver driver = new RemoteWebDriver(url, options);
		
	//	System.setProperty("java.net.preferIPv4Stack", "true");
		URL url = new URL("http://172.31.31.73:5555/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("https://github.com/vijaykumar2926");
		
		
		
		
		
	}
}
