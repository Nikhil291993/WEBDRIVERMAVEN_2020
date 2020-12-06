package Dec_Maven._DEC_MVN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static  WebDriver  driver;
	@BeforeTest
	public 	void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
		
	}
		@Test
		public void doLogin()
		{
			System.out.println("Excuting Login test case");
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
			//*[@id="email"]
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("nikhilnanaware93gmail");
			driver.findElement(By.name("pass")).sendKeys("Password");
			//*[@id="u_0_b"]
			driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
			System.out.println("Adding this maven project in GITHUB ");
	}
		@AfterTest
		public void quiteDriver()
		{
			if(driver!=null)
				driver.close();
		}
}
