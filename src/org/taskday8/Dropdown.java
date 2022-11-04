package org.taskday8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
private static final String Sunshine = null;

public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement login = driver.findElement(By.xpath("//input[@id=\"username\"]"));
	login.sendKeys("vignesh12");
	
	WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
	password.sendKeys("T59824");
	
    WebElement enter = driver.findElement(By.xpath("//input[@name=\"login\"]"));
	enter.click();
	
	WebElement location = driver.findElement(By.xpath("//select[@id=\"location\"]"));
	Select select = new Select(location);
	select.selectByIndex(8);
	
	WebElement hotel = driver.findElement(By.xpath("//select[@id=\"hotels\"]"));
	Select clk = new Select(hotel);
	clk.selectByIndex(2);
	
	WebElement roomtype = driver.findElement(By.id("room_type"));
	Select type = new Select(roomtype);
	type.selectByIndex(3);
	
	WebElement noofrooms = driver.findElement(By.id("room_nos"));
	Select rooms = new Select(noofrooms);
	rooms.selectByIndex(6);
	
	WebElement date = driver.findElement(By.xpath("//input[@name=\"datepick_in\"]"));
	date.click();
	Robot robot = new Robot();
	
	for (int i = 0; i < 10; i++) {
		
	
	robot.keyPress(KeyEvent.VK_BACK_SPACE);
	robot.keyRelease(KeyEvent.VK_BACK_SPACE);
    }
	
	WebElement datetxt = driver.findElement(By.xpath("//input[@name=\"datepick_in\"]"));
	datetxt.sendKeys("12/07/2022");
	
	WebElement checkin = driver.findElement(By.xpath("//input[@id=\"datepick_out\"]"));
	checkin.click();
	
	for (int i = 0; i < 10; i++) {
		
	robot.keyPress(KeyEvent.VK_BACK_SPACE);
	robot.keyRelease(KeyEvent.VK_BACK_SPACE);
    }
	
	WebElement checkindate = driver.findElement(By.xpath("//input[@id=\"datepick_out\"]"));
	checkindate.sendKeys("14/07/2022");
	
	WebElement adult = driver.findElement(By.id("adult_room"));
	Select number = new Select(adult);
	number.selectByIndex(3);
	
	WebElement children = driver.findElement(By.id("child_room"));
	Select childrennumber = new Select(children);
	childrennumber.selectByIndex(1);
	
	WebElement search = driver.findElement(By.xpath("//input[@id=\"Submit\"]"));
	search.click();
	
	WebElement clickk = driver.findElement(By.xpath("//input[@id=\"radiobutton_0\"]"));
	clickk.click();
	
	WebElement continues = driver.findElement(By.id("continue"));
	continues.click();
	
	WebElement firstname = driver.findElement(By.xpath("//input[@name=\"first_name\"]"));
	firstname.sendKeys("vignesh");
	
	WebElement lastname = driver.findElement(By.xpath("//input[@name=\"last_name\"]"));
	lastname.sendKeys("thulasidass");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@name=\"address\"]"));
	address.sendKeys("dindigul");
	
	WebElement cardno = driver.findElement(By.xpath("//input[@name=\"cc_num\"]"));
	cardno.sendKeys("1234567899876543");
	
	WebElement cardtype = driver.findElement(By.xpath("//select[@id=\"cc_type\"]"));
	Select card = new Select(cardtype);
	card.selectByIndex(2);
	
	WebElement expiry = driver.findElement(By.xpath("//select[@id=\"cc_exp_month\"]"));
	Select expmonth = new Select(expiry);
	expmonth.selectByIndex(4);
	
	WebElement expirydate = driver.findElement(By.xpath("//select[@id=\"cc_exp_year\"]"));
	Select expdate = new Select(expirydate);
	expdate.selectByIndex(12);
	
	WebElement ccv = driver.findElement(By.xpath("//input[@name=\"cc_cvv\"]"));
	ccv.sendKeys("978");
	
	WebElement booknow = driver.findElement(By.xpath("//input[@name=\"book_now\"]"));
	booknow.click();
	
	Thread.sleep(15000);
	
	WebElement order = driver.findElement(By.xpath("//input[@name=\"order_no\"]"));
	String attribute = order.getAttribute("value");
	System.out.println(attribute);
	
   }

}
