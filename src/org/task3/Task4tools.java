package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4tools {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver. get("https://demoqa.com/automation-practice-form");
	
	WebElement firstname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	firstname.sendKeys("vignesh");
	
	WebElement secondname = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
	secondname.sendKeys("thulasidass");
	
	WebElement email = driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
	email.sendKeys("vigneshthulasidass12@gmail.com");
	
	//WebElement gender = driver.findElement(By.xpath("//input[@id=\"gender-radio-1\"]"));
	//gender.click();
	
	WebElement phonenumber = driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]"));
	phonenumber.sendKeys("9788398400");
	
	//WebElement dob = driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]"));
	//dob.click();
	
	//WebElement dob2 = driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
	//dob2.clear();
	
	WebElement hobby = driver.findElement(By.xpath("//label[text()=\"Music\"]"));
	hobby.click();
	
}
}
