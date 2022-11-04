package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6redbus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	//WebElement driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	driver.get("https://m.redbus.in/signin-iframe");
	
	WebElement phoneno = driver.findElement(By.xpath("//input[@class=\"num_input\"]"));
	phoneno.sendKeys("9788398400");
	
	
	
}
}
