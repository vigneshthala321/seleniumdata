package org.taskday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement search  = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	search.sendKeys("iphone 13 pro max");
	
	//WebElement clickk = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
	//clickk.click();
	
	WebElement txt = driver.findElement(By.xpath("(//div[@class='navFooterColHead'])[2]"));
	String text = txt.getText();
	System.out.println(text);
	
	WebElement login = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	String school = login.getAttribute("value");
	System.out.println(school);
	 
	
	
	
	
	
	
}
}
