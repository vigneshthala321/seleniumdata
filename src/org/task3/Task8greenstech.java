package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8greenstech {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement modelresume = driver.findElement(By.xpath("//div[@id=\"heading201\"]"));
	modelresume.click();
	
	WebElement clickk = driver.findElement(By.xpath("//a[@href=\"http://traininginchennai.in/Fresher_Selenium_Resume.pdf\"]"));
	clickk.click();
	
	
	
	
	
	
}
}
