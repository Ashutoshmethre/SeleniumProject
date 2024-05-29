package Project1.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewRegistraionTestcase1{

	public static void main(String[] args) {
		
		// Register User
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("Ashutosh");
		driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("21ashu2001@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
		driver.findElement(By.id("id_gender1")).click();
		System.out.println(driver.findElement(By.id("id_gender1")).isEnabled());
		driver.findElement(By.id("password")).sendKeys("2001ashu13");
		WebElement dropeDownDays = driver.findElement(By.id("days"));
		Select select = new Select(dropeDownDays);
		select.selectByIndex(27);
		WebElement dropeDownMonths = driver.findElement(By.id("months"));
		Select selectMonths = new Select(dropeDownMonths);
		selectMonths.selectByVisibleText("July");
		WebElement dropeDownYears = driver.findElement(By.xpath("//*[@id='years']"));
		Select selectYears = new Select(dropeDownYears);
		selectYears.selectByValue("2002");
		 driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys("Ashutosh");
		driver.findElement(By.id("last_name")).sendKeys("Ashutosh");
		driver.findElement(By.id("company")).sendKeys("AshutoshCompany");
		driver.findElement(By.id("address1")).sendKeys("Kumar Swamy layout");
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("city")).sendKeys("HGM");	
		driver.findElement(By.id("zipcode")).sendKeys("584115");	
		driver.findElement(By.id("mobile_number")).sendKeys("8317366397");	
		driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();	
		System.out.println(driver.findElement(By.xpath("//b[text()='Account Created!']")).isDisplayed());
		
	
	}

}
