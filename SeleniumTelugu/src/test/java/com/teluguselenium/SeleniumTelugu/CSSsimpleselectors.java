package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSsimpleselectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
		//element
		System.out.println(driver.findElement(By.cssSelector("button")).getAttribute("id"));
		//id
		WebElement firstName=driver.findElement(By.cssSelector("#firstName"));
		firstName.sendKeys("thiru");
		Thread.sleep(5000);
		System.out.println(firstName.getText());
		//class
		WebElement gender=driver.findElement(By.cssSelector(".gender"));
		gender.sendKeys("male");
		Thread.sleep(5000);
		System.out.println(gender.getText());
		//universal
		System.out.println(driver.findElements(By.cssSelector("*")).size());
		
		

	}

}
