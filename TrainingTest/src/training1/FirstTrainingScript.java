package training1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTrainingScript {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver2\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.name("firstName")).sendKeys("George");
		driver.findElement(By.name("lastName")).sendKeys("Alfred");
		driver.findElement(By.name("phone")).sendKeys("09063612503");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.name("userName")).sendKeys("uudoakaebe@yahoo.com");
		driver.findElement(By.name("address1")).sendKeys("Uyo");
		driver.findElement(By.name("city")).sendKeys("Uyo");
		driver.findElement(By.name("state")).sendKeys("Akwa Ibom");
		driver.findElement(By.name("postalCode")).sendKeys("1111112");
		WebElement countrydropdown = driver.findElement(By.name("country"));
		Select countrydrop = new Select (countrydropdown);
		countrydrop.selectByVisibleText("ANGOLA");
		driver.findElement(By.name("email")).sendKeys("ubongebe1");
		driver.findElement(By.name("password")).sendKeys("ubongebe002");
		driver.findElement(By.name("confirmPassword")).sendKeys("ubongebe002");
		Thread.sleep(6000);
		driver.findElement(By.name("submit")).click();
		String ExpectedTitle = "Register: Mercury Tours";
		String ActualTitle = driver.getTitle();
		System.out.println("The Actual page Title is :" + ActualTitle);
		if (ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		Thread.sleep(6000);
		//driver.navigate().to(null)
		driver.quit();
		
	}

}
