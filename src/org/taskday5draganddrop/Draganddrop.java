package org.taskday5draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
     
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.guru99.com/test/drag_drop.html");
    
    
	WebElement bank = driver.findElement(By.xpath("//a[text()=\" BANK \" ]"));
	WebElement copy = driver.findElement(By.xpath("//ol[@id=\"bank\"]"));

	Actions actions = new Actions(driver);
	actions.dragAndDrop(bank, copy).perform();
	
	WebElement fivek = driver.findElement(By.xpath("//li[@data-id=\"2\"]"));
	WebElement copy5k = driver.findElement(By.xpath("//ol[@id=\"amt7\"]"));
	
	Actions action = new Actions(driver);
    actions.dragAndDrop(fivek, copy5k).perform();
	
    WebElement account = driver.findElement(By.xpath("//li[@id=\"credit1\"]"));
    WebElement copy2  = driver.findElement(By.xpath("//ol[@id=\"loan\"]"));
	
    Actions action1 = new Actions(driver);
	action1.dragAndDrop(account, copy2).perform();
	 
	WebElement minus5k = driver.findElement(By.xpath("//li[@data-id=\"2\"]"));
	WebElement apply = driver.findElement(By.xpath("//ol[@id=\"amt8\"]"));
	 
	Actions actions2 = new Actions(driver);
	actions2 . dragAndDrop(minus5k, apply).perform();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
