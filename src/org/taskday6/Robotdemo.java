package org.taskday6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotdemo {
public static void main(String[] args) throws AWTException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
 	
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.keyPress(KeyEvent.VK_F);
	robot.keyRelease(KeyEvent.VK_F);
	
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    
    robot.keyPress(KeyEvent.VK_1);
    robot.keyRelease(KeyEvent.VK_1);
    
	robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	
    robot.keyPress(KeyEvent.VK_M);
    robot.keyRelease(KeyEvent.VK_M);
    
 
    
   
}

}




