package SeleniumDemo.Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.AddSeleniumUserAgent;

public class Demo {

	public static void main(String[] args) {
				
		WebDriver driver  = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("21ashu2001@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("2001ashu13");
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		System.out.println(driver.findElement(By.linkText("Account")).isDisplayed());
		driver.findElement(By.xpath("//*[@name='search']")).click();
		driver.findElement(By.xpath("//*[@name='search']")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iPhone")).click();
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();
		driver.findElement(By.name("quantity[144804]")).clear();
		driver.findElement(By.name("quantity[144804]")).sendKeys("1");		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		
	
		
		
		
		
		
		
		
	
		
	}

}
