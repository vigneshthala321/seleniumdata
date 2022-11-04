package org.taskday5draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new  ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	WebElement close = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
	close.click();
	driver.manage().window().maximize();  
	
	WebElement electronics = driver.findElement(By.xpath("//img[@alt=\"Electronics\"]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(electronics). perform();	
	
	
	
	
	
	
	
	
}
}
