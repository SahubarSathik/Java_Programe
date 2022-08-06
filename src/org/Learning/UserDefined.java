package org.Learning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class UserDefined extends PojoClass{
	static WebDriver driver;
	public static void main(String[] args) {

		
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		PageFactory.initElements(driver, PojoClass.class);
		PojoClass c = new PojoClass();
		c.setFirstName(driver.findElement(By.id("firstName")));
		WebElement firstName2 = c.getFirstName();
		firstName2.sendKeys("priya");
		
		
		
		
		
	}
}
