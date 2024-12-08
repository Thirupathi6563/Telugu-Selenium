package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSAttributeSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
		//If you want get the element with attribute name
		System.out.println(driver.findElements(By.cssSelector("input[placeholder]")).size());
		
		//If you want get the element with attribute value
		System.out.println(driver.findElements(By.cssSelector("input[placeholder='First Name']")).size());
		
		//attribute value-PartialText-whole word
		System.out.println(driver.findElements(By.cssSelector("input[placeholder~='question']")).size());
		
		//attribute value-PartialText-Text
		System.out.println(driver.findElements(By.cssSelector("input[placeholder*='que']")).size());
		
		//attribute value-StartsWith-whole word
		System.out.println(driver.findElements(By.cssSelector("p[class|='top']")).size());
				
		//attribute value-StartsWith-Text
		System.out.println(driver.findElements(By.cssSelector("input[placeholder^='Ent']")).size());
		
		//attribute value-EndsWith-Text
		System.out.println(driver.findElements(By.cssSelector("input[placeholder$='wer']")).size());

	}

}
