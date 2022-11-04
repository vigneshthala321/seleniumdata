package org.taskday9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	WebElement element = driver.findElement(By.xpath("//div[@class=\"w3-white w3-padding notranslate w3-padding-16\"]"));
	List<WebElement> row = element.findElements(By.tagName("tr"));
	
	for (int i = 0; i < row.size(); i++) {
	
		WebElement rows = row.get(i);
        List<WebElement> column = rows.findElements(By.tagName("td"));
		
   for (int j = 0; j < column.size(); j++) {
	
        WebElement columns = column.get(j);
		String txt = columns.getText();
        System.out.println(txt);
        
	}    
		
	
	
}
	
	
	
}
}
