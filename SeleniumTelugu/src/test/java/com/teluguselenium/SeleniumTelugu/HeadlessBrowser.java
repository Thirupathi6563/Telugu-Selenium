package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ChromeOptions options=new ChromeOptions(); 
		//when ever using this method it will run the testcase with out open the chromebrowser
		 options.addArguments("headless"); 
		 WebDriver driver =new ChromeDriver(options);
		 //Firefox
		 FirefoxOptions options=new FirefoxOptions();
		 options.addArguments("headless");
		 WebDriver driver =new FirefoxDriver(options);*/
		EdgeOptions options=new EdgeOptions();
		options.addArguments("headless");
		WebDriver driver =new EdgeDriver(options);
		
		 driver.get("https://www.facebook.com/");
		 WebElement w=driver.findElement(By.name("login"));
		 String name=w.getText();
		 System.out.println(name);

	}

}
