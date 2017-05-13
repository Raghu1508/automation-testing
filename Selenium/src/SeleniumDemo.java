import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Selenium Drivers/Chrome Driver/chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
