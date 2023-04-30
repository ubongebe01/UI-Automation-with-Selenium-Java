package BankingLiveProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LoginTestCase {

	public static void main(String[] args) throws InterruptedException {
		// Verify the Login Scenario section (Username & Password as Provided)
		// Expected Result (Login Successful)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("uid")).sendKeys("mngr453836");
		driver.findElement(By.name("password")).sendKeys("pYqEvEn");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
		String exp_title = "Guru99 Bank Manager HomePage";
		String act_title = driver.getTitle();
		if (exp_title.equals(act_title))
		{
			System.out.println ("Test Passed");
		}
		else
			System.out.println ("Test Failed");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
