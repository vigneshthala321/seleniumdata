package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11google {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");	
		
	WebElement name = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
	name.sendKeys("vignesh");
	
	WebElement name2 = driver.findElement(By.xpath("//input[@ id=\"lastName\"]"));
	name2.sendKeys("thulasidass");
	
	WebElement username = driver .findElement(By.xpath("//input[@type=\"email\"]"));
	username.sendKeys("vigneshvicky127527");
	
	WebElement password = driver.findElement(By.xpath("//input[@name=\"Passwd\"]"));
	password.sendKeys("vicky123");
	
	WebElement password2 = driver.findElement(By.xpath("//input[@name=\"ConfirmPasswd\"]"));
	password2.sendKeys("vicky123");
	
	WebElement login = driver.findElement(By.xpath("//div[@class=\"VfPpkd-RLmnJb\"]"));
	login.click();

}
}
