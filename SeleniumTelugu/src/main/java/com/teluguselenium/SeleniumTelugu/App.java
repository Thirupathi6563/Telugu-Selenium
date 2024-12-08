package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App 
{
    public static void main( String[] args )
    {
    	//System.setProperty("webdriver.firefox.driver", "C:\\thirupathi\\Selenium drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
    	//System.setProperty("webdriver.chrome.silentOutput", "true");
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\thirupathi\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	
    	
    	driver.get("https:google.com");
    }
}
