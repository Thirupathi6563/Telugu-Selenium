package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        
        driver.get("https://demoqa.com/select-menu");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//How to scroll down
		js.executeScript("window.scrollBy(0,300)","");
		
		Thread.sleep(5000);
		
		//How to scroll up
		js.executeScript("window.scrollBy(0,-300)", "");
		
		Thread.sleep(5000);
		
		// Scrolling down the page till the element is found
		/*WebElement ele=driver.findElement(By.xpath("//*[text()='Interactions']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();*/
		
		// Scrolling down the bottom of the webpage
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//Scrolling down the top of the webpage
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		
		//how to scroll down the vertical bar
		//js.executeScript("window.scrollBy(30,300)","");
		
		//how to scroll down the horizontal bar
		//js.executeScript("window.scrollBy(300,30)","");
		
		

	}

}
