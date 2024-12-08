package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//After 4.6.0 version then we don't need to set up the system.setProperty file. The selenium manager automatically download the browsers.
//If you provide the system.setProperty then you need to download the browsers other wise no need.
//If you want to know the selenium manager then click on ctrl+shift+t then window pop up will be show then just type seleniumManager and click
//If you want to know the driver details then just go to this path "C:\Users\Thiru\.cache\selenium"
//It will not download the browser every time.When ever the driver is updated that time only the latest driver will download.
		
		//WebDriver driver =new ChromeDriver();
		//WebDriver driver =new FirefoxDriver();
		//WebDriver driver =new EdgeDriver();
		WebDriver driver =new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("youtube");
		driver.findElement(By.name("q")).submit();

	}

}
