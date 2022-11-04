package org.taskday6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.antlr.v4.runtime.atn.LoopEndState;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement txt = driver.findElement(By.id("email"));
    Actions action = new Actions(driver);
    action.contextClick(txt).perform();
    
    Robot robot = new Robot();
     
    for (int i=1;i<6;i++) {

       robot.keyPress(KeyEvent.VK_DOWN);
       robot.keyRelease(KeyEvent.VK_DOWN);
        
    }
    
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyPress(KeyEvent.VK_ENTER);
	
		
	}
	
}

