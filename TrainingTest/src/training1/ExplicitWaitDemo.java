package training1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	@SuppressWarnings("unchecked")
	public static <JavaScriptExecutor> void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"))).sendKeys("Ubong");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"))).sendKeys("Udoakaebe");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"))).sendKeys("#108 Idoro Road, Uyo, Akwa Ibom State");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"eid\"]/input"))).sendKeys("ubongebe@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"))).sendKeys("08065193093");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("radiooptions"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox1"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox2"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox3"))).click();
		WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("signup")));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"msdd\"]"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"))).click();
		//driver.findElement(By.xpath("//*[@id=\"section\"]/div/div")).sendKeys(Keys.ENTER);
		WebElement LanguageDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Skills")));
		Select LanguageDrop = new Select (LanguageDropDown);
		LanguageDrop.selectByVisibleText("Linux");
		WebElement CountryDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/span/span/span[1]/input")));
		Select CountryDrop = new Select (CountryDropDown);
		CountryDrop.deselectByIndex(1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"section\"]/div/div/div[2]"))).click();
		
		
		
		

	}
}
