package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("vignesh");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("12345678");
		
		WebElement login = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		login.click();
		
		
		
}
}