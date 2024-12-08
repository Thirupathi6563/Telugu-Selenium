package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_PseudiClasses {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
	//first-child 
	WebElement first_child=driver.findElement(By.cssSelector(".container>:first-child"));
	first_child.sendKeys("Alla");
	Thread.sleep(2000);
	first_child.clear();
	//last-child
	driver.findElement(By.cssSelector(".container>:first-child")).click();
	Thread.sleep(2000);
	//nth-child
	driver.findElement(By.cssSelector(".container>:nth-child(3)")).sendKeys("Male");
	
	//first-of-type  - .container>br:first-of-type
	driver.findElement(By.cssSelector(".container>input:first-of-type")).sendKeys("Thiru");
	//last-of-type   - .container>last-of-type
	driver.findElement(By.cssSelector(".container>input:last-of-type")).click();
	//nth-of-type    - .container>br:nth-of-type(2)
	driver.findElement(By.cssSelector(".container>input:nth-of-type(4)")).sendKeys("Peddaraveedu");
	}

}
