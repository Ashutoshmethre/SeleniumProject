package Project1.Flipkart;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6ContactUsForm {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@href='/contact_us']")).click();
		System.out.println(driver.findElement(By.xpath("//*[text()='Get In Touch']")).isDisplayed());
		driver.findElement(By.xpath("//*[@data-qa='name']")).sendKeys("Ashutosh");

		driver.findElement(By.xpath("//*[@data-qa='email']")).sendKeys("21ashu2001@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='subject']")).sendKeys("Automation Testing");
		driver.findElement(By.id("message")).sendKeys("Automation Testing");
		driver.findElement(By.xpath("//*[@name='upload_file']")).sendKeys("C:\\Users\\King\\Downloads/WhatsApp Image 2023-08-03 at 11.18.22 PM.jpeg");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//*[text()='Success! Your details have been submitted successfully.']")).getText());
		
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
	}

}
