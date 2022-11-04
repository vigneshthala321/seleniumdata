package org.redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args  ) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");

     WebDriver redbus = new ChromeDriver();
     redbus.get("https://www.redbus.in/");

     WebElement txtfrom = redbus.findElement(By.id("src"));
     txtfrom.sendKeys("chennai");

	 WebElement txtto = redbus.findElement(By.id("dest"));
	 txtto.sendKeys("madurai");
	 
	WebElement drive = redbus.findElement(By.xpath("//label[@class=\"db text-trans-uc\"]"));
	drive.click();
	
	WebElement drive1 = redbus.findElement(By.xpath("//td[@class=\"wd day\"]"));
	drive1.click();
	
	WebElement search = redbus.findElement(By.xpath("//button[@class=\"fl button\"]"));
	
	search.click();
	
	//WebElement element = redbus.findElement(By.xpath("//a[@href=\"/info/useragreement\"]"));
	//String txt = element.getText();
	//System.out.println(txt);
	
	WebElement copy = redbus.findElement(By.xpath("//input[@id=\"dest\"]"));
	String copytxt = copy.getAttribute("value");
	System.out.println(copytxt);
}
}
