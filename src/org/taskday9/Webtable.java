package org.taskday9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	WebElement fulltable = driver.findElement(By.id("customers"));
	List<WebElement> allrows = fulltable.findElements(By.tagName("tr"));
	
	for (int i = 0; i < allrows.size(); i++) {
		
		WebElement table = allrows.get(i);
		String tables = table.getText();
		System.out.println(tables);
	}
	
	
}
}
