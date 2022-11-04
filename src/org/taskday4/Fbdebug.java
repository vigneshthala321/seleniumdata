package org.taskday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbdebug {
public static void main(String[] args)  {
	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
     WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	 WebElement create = driver.findElement(By.xpath("//a[text()=\"Create New Account\"]"));
	 create.click();
	
	 WebElement firstname = driver.findElement(By.xpath("//input[@aria-label=\"First name\"]"));
	 firstname.sendKeys("vignesh");
	 

	 WebElement lastname = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
	 lastname.sendKeys("thulsaidass");
	 	 
	 
}
}
