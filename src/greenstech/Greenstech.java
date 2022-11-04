package greenstech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstech {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");

		WebDriver greenstech = new ChromeDriver();
		greenstech.get("https://www.google.com/");

		WebElement search= greenstech.findElement(By.name("q"));
		search.sendKeys("greenstechnology");	

		WebElement driver =greenstech.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		driver.click();	
		System.out.println("vivek");
		System.out.println("karthi");
		System.out.println("ram");





	}
}
