package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToMaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();  // By using this one we can open minimum window only
		driver.get("https://www.google.com/");*/
		
		//If you want open full window use this one
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions c=new ChromeOptions();
		c.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.google.com/");

	}

}
