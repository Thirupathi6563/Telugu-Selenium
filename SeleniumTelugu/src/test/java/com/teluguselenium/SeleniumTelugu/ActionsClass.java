package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");

		Actions acn=new Actions(driver);
		//mouse over
		WebElement AutomationTools=driver.findElement(By.className("dropbtn"));
		
		acn.moveToElement(AutomationTools).perform();
		
//Click
		//acn.moveToElement(AutomationTools).perform();
		//driver.findElement(By.xpath("//*[text()='Selenium']")).click();
		
//rightClick
		acn.moveToElement(AutomationTools).perform();
		WebElement Selenium=driver.findElement(By.xpath("//*[text()='Selenium']"));
		acn.contextClick(Selenium).perform();
		*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
//Double click
		Actions acn=new Actions(driver);
		WebElement Search=driver.findElement(By.name("q"));
	Search.sendKeys("facebook");
	acn.moveToElement(Search).doubleClick().perform();

		
	}

}
