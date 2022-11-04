package org.task3;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.automationtesting.in/Register.html");
    
    WebElement firstname = driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]"));
	firstname.sendKeys("vignesh");
	
	WebElement lastname = driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]"));
	lastname.sendKeys("thulasidass");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
	address.sendKeys("dindigul");
	
	WebElement email = driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
	email.sendKeys("vigneshthulasidass12@gmail.com");
	
	WebElement phoneno = driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]"));
	phoneno.sendKeys("9788398400");
	
	WebElement male = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
	male.click();
	
	WebElement cricket = driver.findElement(By.xpath("//input[@id=\"checkbox1\"]"));
	cricket.click();
	
	WebElement language = driver.findElement(By.xpath("//div[@id=\"msdd\"]"));
	language.click();
	
	WebElement english = driver.findElement(By.xpath("//a[text()='English']"));
	english.click();
	
	WebElement firstpassword = driver.findElement(By.xpath("//input[@id=\"firstpassword\"]"));
	firstpassword.sendKeys("vicky123");
	
	WebElement secondpassword = driver.findElement(By.xpath("//input[@id=\"secondpassword\"]"));
	secondpassword.sendKeys("vicky123");
	
	WebElement skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
	skills.click();
	
	
	
	
	
	
	
	
	
}
}
