import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook 
{
	WebDriver driver;
	@Test
	public void startUP()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void close()
	{
		driver.quit();
	}
}
