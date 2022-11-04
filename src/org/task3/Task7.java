package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains/calendar");
	
	WebElement from = driver.findElement(By.xpath("//input[@idfield=\"from_station\"]"));
	from.sendKeys("chennai");
	
	WebElement to = driver.findElement(By.xpath("//input[@idfield=\"to_station\"]"));
	to.sendKeys("dindigul");
	
	WebElement clas = driver.findElement(By.xpath(" //select[@id=\"train_class\"]]"));
	clas.click();
	
	WebElement get = driver.findElement(By.xpath("//input[@id=\"get_avail\"]"));
	get.click();
	
	
	
	
}
}
