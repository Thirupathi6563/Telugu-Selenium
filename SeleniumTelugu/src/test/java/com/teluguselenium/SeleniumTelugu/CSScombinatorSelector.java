package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSScombinatorSelector {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
		//Descendant selector
		System.out.println(driver.findElements(By.cssSelector(".container option")).size());
		
		//Child selector
		driver.findElement(By.cssSelector(".container>select")).click();
		//driver.findElement(By.cssSelector(".container>select>option[value='select']")).click();
		Thread.sleep(5000);
		//Adjacent sibling selector
		driver.findElement(By.cssSelector("input[placeholder='Enter your security answer']+input[placeholder='Verify your personal details']")).sendKeys("Test");

		//General sibling selector
		
		System.out.println(driver.findElements(By.cssSelector("input[placeholder='Enter your security answer']~input")).size());
	}

}
