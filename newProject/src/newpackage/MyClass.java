package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.support.ui.WebDriverWait;

public class MyClass {
//	 WebDriverWait wait;

	 public static void main() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http:www.gmail.com");
			driver.findElement(By.id("identifierId")).sendKeys("abc@margerp.com");
			driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("DSGDJF");
			driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//div[@class='aic']")).click();
			
			driver.findElement(By.xpath("//textarea[@class='vO']")).sendKeys("shakti06sharma@gmail.com");
			driver.findElement(By.xpath("//input[@class='aoT']")).sendKeys("Created Using Selenium");
			WebElement test =  driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"));
			test.sendKeys("Hello Sir,");
			test.sendKeys(Keys.ENTER);
			test.sendKeys("This Email is generated using selenium, a tool used for automating websites.");

			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();

			

	}
}
