package org.instgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.WithThrowawayExecutorService;

public class Instagram {
public static void main(String[] args, String s) throws InterruptedException {
	s= "vignesh";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
    
    WebDriver instagram = new ChromeDriver();
    instagram.get("https://www.instagram.com/accounts/login/");
	
    Thread.sleep(2000);
    
	WebElement txtusername =  instagram.findElement(By.name("username"));
	txtusername.sendKeys(s);
	
	WebElement txtpassword = instagram.findElement(By.name("password"));
	txtpassword.sendKeys("vicky@123");
	
	
	
	
}
}
