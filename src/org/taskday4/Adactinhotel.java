package org.taskday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotel {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
   
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	
	WebElement name = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	name.sendKeys("vicky123");
	
	WebElement password = driver.findElement(By.xpath("//input[@ id=\"password\"]"));
	password.sendKeys("9788398400");
	
	//WebElement login = driver.findElement(By.xpath("//input[@ type=\"Submit\"]"));
	//login.click();
	
	WebElement best = driver.findElement(By.xpath("//td[contains(text(),'best')]"));
	String hotel = best.getText();
	System.out.println(hotel);
	
	WebElement element = driver.findElement(By.xpath("//input[@id=\"username\"]"));
	String attribute = element.getAttribute("value");
	System.out.println(attribute);
	
	WebElement developed = driver.findElement(By.xpath("//li[contains(text(),'developed')]"));
	String text = developed.getText();
	System.out.println(text);
	
	
	
	
	
	
}
}
