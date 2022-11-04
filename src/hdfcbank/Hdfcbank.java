package hdfcbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcbank {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");

WebDriver bank = new ChromeDriver();
bank.get("https://netbanking.hdfcbank.com/netbanking/");
	
WebElement username= bank.findElement(By.name("fldLoginUserId"));
username.sendKeys("VICKY9788");
	
	
	
	
	
	
	
	
}
}
