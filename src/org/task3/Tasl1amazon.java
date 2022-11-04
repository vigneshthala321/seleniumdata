package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasl1amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement search  = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("iphone 13 pro max");
		
		WebElement clickk = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		clickk.click();
		
		
		
		
		
		
		
}
}