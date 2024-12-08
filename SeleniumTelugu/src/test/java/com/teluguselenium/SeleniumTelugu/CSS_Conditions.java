package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
		//And 
	System.out.println(driver.findElements(By.cssSelector("input[class='button'][type='button']")).size());
		//Or
	System.out.println(driver.findElements(By.cssSelector("input[class='button'],[type='submit']")).size());
	//not
	System.out.println(driver.findElements(By.cssSelector("input[class='button']:not([type='button'])")).size());

	
	}

}
