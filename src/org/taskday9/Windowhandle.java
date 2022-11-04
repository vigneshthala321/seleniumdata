package org.taskday9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class Windowhandle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	
	WebElement phone = driver.findElement(By.id("twotabsearchtextbox"));
	phone.sendKeys("iphone 13");
	
	WebElement search = driver.findElement(By.id("nav-search-submit-button"));
	search.click();
	
	WebElement clk = driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
	clk.click();
	
	String prtwinid = driver.getWindowHandle();
	System.out.println(prtwinid);
	
	Set<String> allwinid = driver.getWindowHandles();
	System.out.println(allwinid);
	
	for (String check : allwinid) {
	System.out.println(check);
	
	if (!(check.equals(prtwinid))) {
		
		driver.switchTo().window(check );
		
}
	}
	
	WebElement clickk = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
			clickk.click();
	
}
}
