package org.taskday7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsendkeys {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	WebElement change = driver.findElement(By.xpath("//a[@href=\"#Textbox\"]"));
	change.click();
	
    WebElement btn = driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]"));
    btn.click();

    
	
	
}
}
