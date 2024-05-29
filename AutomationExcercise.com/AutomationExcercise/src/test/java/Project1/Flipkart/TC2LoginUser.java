package Project1.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2LoginUser {

	public static void main(String[] args) {
		
		// Login User with correct email and password
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("21ashu2001@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys("2001ashu13");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		WebElement loginSucc = driver.findElement(By.xpath("//*[text()='Ashutosh']"));
		System.out.println(loginSucc.getText());
		
		

	}

}
