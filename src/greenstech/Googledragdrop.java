package greenstech;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googledragdrop {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	WebElement search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	search.sendKeys("greens tech");
	
	Robot robot = new Robot();
	
	for (int i = 0; i < 4; i++) {
		
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	
	}
	
	

	
	
	
	
	
}
	
	
	
}
