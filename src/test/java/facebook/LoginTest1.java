package facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest1 {
	WebDriver dr;
	
	@Test
	public void login() {
	
	dr = new ChromeDriver();
	dr.get("https://www.facebook.com/");
	dr.manage().window().maximize();

	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	dr.findElement(By.id("email")).sendKeys("habib@gmail.com");
	dr.findElement(By.id("pass")).sendKeys("kkkkkkkkk");
	System.out.println("Success made by Habib");
	dr.close();

}
	
	@Test
	public void name () {
		System.out.println("Habib is doing great!!");
	}
	
	
	

}
