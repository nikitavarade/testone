package Temp1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriAutomation{
	public static WebDriver driver;
	public static void main(String args[]) {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("nikitavarade@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shimer@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='view-profile-wrapper'] /a")).click();
		driver.findElement(By.xpath("//input[@type='button' and @value ='Update resume']")).click();
		driver.findElement(By.id("attachCV")).sendKeys("E:\\chichi\\HCL\\REsume\\Nikita_Varade.pdf");
		
		
		
		
	}

}
