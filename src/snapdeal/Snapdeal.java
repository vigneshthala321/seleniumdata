package snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");

    WebDriver snap = new ChromeDriver();
	snap.get("https://www.snapdeal.com/login");
	
	WebElement username = snap.findElement(By.className("col-xs-24"));
	username.sendKeys("9788398400");
	
	WebElement search = snap.findElement(By.xpath("//button[@class=\"btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30\"]"));
	search.click();
	
	
	
	
	
	
	
	
}
}
