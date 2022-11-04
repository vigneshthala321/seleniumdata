package org.taskday6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	
	WebElement rightclk = driver.findElement(By.xpath("//input[@id=\"username\"]"));
	Actions actions = new Actions(driver);
	actions.contextClick(rightclk).perform();
	
	
}
}
