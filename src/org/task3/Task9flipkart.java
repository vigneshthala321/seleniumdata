package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders%3Flink%3Dhome_orders&fromMyOrdersPage=true");
	
	//WebElement mobno = driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]"));
	//mobno.sendKeys("9788398400");
	
	//WebElement password = driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]"));
	//password.sendKeys("vicky123");
	
	//WebElement login = driver.findElement(By.xpath("//button[@ class=\"_2KpZ6l _2HKlqd _3AWRsL\"]"));
	//login.click();
	
	WebElement history = driver.findElement(By.xpath("//span[contains(text(),'Access your Order History')]"));
	String text = history.getText();
	System.out.println(text);
}
}
