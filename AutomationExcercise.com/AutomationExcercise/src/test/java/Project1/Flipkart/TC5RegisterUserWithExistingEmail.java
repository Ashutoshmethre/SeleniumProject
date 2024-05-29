package Project1.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5RegisterUserWithExistingEmail {

	public static void main(String[] args) {
		
		//RegisterUserWithExistingEmail
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("Ashutosh");
		driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("21ashu2001@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
		System.out.println(driver.findElement(By.xpath("//*[text()='Email Address already exist!']")).getText());
	}

}
