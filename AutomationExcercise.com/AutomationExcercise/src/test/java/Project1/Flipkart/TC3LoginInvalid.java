package Project1.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC3LoginInvalid {

	public static void main(String[] args) {
		
	//	Login User with incorrect email and password
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@href='/login']")).click();
	
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("21ashu2001@gmail");
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys("2001ashu13");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).clear();
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).clear();
		
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("21ashu2001gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys("2001ashu13");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).clear();
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).clear();
		
		
		
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("21ashu@gmail");
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys("2001ashu13");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).clear();
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).clear();
		
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("ashu2001@gmail");
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys("2001ashu13");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).clear();
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).clear();
		
		
		
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("212001@gmail");
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys("2001ashu13");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).clear();
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).clear();
		
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("21ashu2001@gmail");
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys("2001ashu");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).clear();
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).clear();
		
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("21ashu2001@gmail");
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys("ashu13");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).clear();
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).clear();
		
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("21ashu2001@gmail");
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys("2001ashu");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).clear();
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).clear();
		
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("21ashu2001@gmail");
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys("2001Ashu13");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).clear();
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).clear();
		
		
		}		
		
		
		
	}


