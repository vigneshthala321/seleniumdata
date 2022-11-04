package org.swiggy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");

		WebElement loginclick = driver.findElement(By.xpath("//a[@class=\"x4bK8\"]"));
		loginclick.click();

		WebElement txtusername = driver.findElement(By.id("mobile"));
		txtusername.sendKeys("9788398400");

		WebElement btnlogin = driver.findElement(By.xpath("//a[@class=\"a-ayg\"]"));
		btnlogin.click();

	}
}
