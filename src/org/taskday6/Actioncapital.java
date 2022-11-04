package org.taskday6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actioncapital {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Actions action = new Actions(driver);
	WebElement email = driver.findElement(By.id("email"));
	action.keyDown(Keys.SHIFT).sendKeys(email,"welcome").keyUp(Keys.SHIFT).perform();
	
	//email.sendKeys("WELCOME");
	
	
	
}
}
