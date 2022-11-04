package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12snapdeal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	
	WebElement signin = driver.findElement(By.xpath("//div[@class=\"accountInner\"]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(signin).perform();
	
	WebElement register = driver.findElement(By.xpath("//span[@class=\"newUserRegister\"]"));
	register.click();
	
	Thread.sleep(3000);

	WebElement phonenumber = driver.findElement(By.xpath("//input[@class=\"col-xs-24\"]"));
	phonenumber.sendKeys("9788398400");
	
	WebElement login = driver.findElement(By.xpath("//button[@class=\"btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30\"]"));
	login.click();
	
}
}
