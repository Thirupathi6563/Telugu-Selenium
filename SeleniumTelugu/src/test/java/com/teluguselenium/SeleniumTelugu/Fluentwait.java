package com.teluguselenium.SeleniumTelugu;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Functions;


public class Fluentwait {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();

		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			        .withTimeout(Duration.ofSeconds(10))
			        .pollingEvery(Duration.ofSeconds(5))
			        .ignoring(NoSuchElementException.class);
		WebElement w = wait.until(new Function<WebDriver, WebElement>() 
		{
			
			public WebElement apply(WebDriver driver) 
			{
				// TODO Auto-generated method stub
				if( driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
					
				{
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}
				
				 else  
					 return null; 
				 
			}

		});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());

	}



	
	

}
