package Project1.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC7VerifyTestCasePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@href='/test_cases']")).click();
		System.out.println(	driver.findElement(By.xpath("//*[text()='Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:']")).getTagName());
		driver.navigate().back();

	
	
	}

}
