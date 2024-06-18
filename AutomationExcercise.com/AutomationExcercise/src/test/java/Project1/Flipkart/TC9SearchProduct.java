package Project1.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9SearchProduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='fa fa-home']")).click();
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		driver.findElement(By.name("email")).sendKeys("21ashu2001@gmail.com");
		driver.findElement(By.name("password")).sendKeys("2001ashu13");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@href='/products']")).click();
		// to remove adds
		// driver.findElement(By.xpath("//*[@viewBox='0 0 48 48']")).click();
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'All Products')]")).getText());
		driver.findElement(By.id("search_product")).sendKeys("Dress");
		driver.findElement(By.id("submit_search")).click();
		driver.findElement(By.xpath("//*[@href='/product_details/3']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@href='/product_details/4']")).click();
		Thread.sleep(2000);

	}

}
