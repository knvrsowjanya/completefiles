package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MICROSECONDS );
				
				WebElement userName = driver.findElement(By.name("email"));
				userName.sendKeys("abc@gmail.com");
				WebElement password = driver.findElement(By.name("pass"));
				password.sendKeys("Abc@12345");
				WebElement loginBtn = driver.findElement(By.name("login"));
				loginBtn.click();
				
				

	}

}
