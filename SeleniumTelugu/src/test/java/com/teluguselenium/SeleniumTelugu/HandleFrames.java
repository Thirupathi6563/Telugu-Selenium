package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver","C:\\\\Users\\\\thiru\\\\Desktop\\\\download folders for selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement TextBox=driver.findElement(By.id("name"));
		TextBox.sendKeys("Text1");
		
		driver.switchTo().frame("frm1");//You can give your id or name value
		
		WebElement Dropdown=driver.findElement(By.id("course"));
				Dropdown.click();
		Select s=new Select(Dropdown);
		Thread.sleep(3000);
		s.selectByVisibleText("Java");
		driver.switchTo().defaultContent(); //If you want to be focus on parent frame
		TextBox.clear();
		WebElement TextBox1=driver.findElement(By.id("name"));
		TextBox1.sendKeys("Text2");
		WebElement Frame2=driver.findElement(By.id("frm2"));
		driver.switchTo().frame(Frame2); //Using webelement
		driver.findElement(By.id("firstName")).sendKeys("Thirupathi");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		TextBox1.clear();
		Thread.sleep(3000);
		WebElement TextBox2=driver.findElement(By.id("name"));
		TextBox2.sendKeys("Text3");
		driver.switchTo().frame(2);
		WebElement FrameTextBox=driver.findElement(By.id("name"));
		FrameTextBox.sendKeys("Frame");
		driver.switchTo().defaultContent();
		WebElement TextBox3=driver.findElement(By.id("name"));
		TextBox3.sendKeys("Text4");
		
		
		
		
		
		
		
		

	}

}
