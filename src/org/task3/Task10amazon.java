package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_98xjxt98l7_e&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=294102729351&hvpos=&hvnetw=g&hvrand=8468807786372613677&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061894&hvtargid=kwd-316976916880&hydadcr=5841_1738695&gclid=CjwKCAjwzeqVBhAoEiwAOrEmzeOoQw8N_DB_pWcRi-iD_0MJ_Vky2B6kQwNxDr3ytAa-_vhACMMSrBoCHJQQAvD_BwE");
	
	WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	search.sendKeys("iphone 13 pro max");
	
	WebElement click = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
	click.click();
	
	
}
}
