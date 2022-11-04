package org.taskday9;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Webtable3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	WebElement row = driver.findElement(By.xpath("//div[@class=\"w3-white w3-padding notranslate w3-padding-16\"]"));
	List<WebElement> rows = row.findElements(By.tagName("tr"));
	
	for (int i = 0; i <= rows. size(); i++) {
	
	if (4/i==0) {
		
	
		WebElement column = rows.get(i);
		String columns = column.getText();
		System.out.println(columns);
	}	
		
	}
	
	
	
}
}
