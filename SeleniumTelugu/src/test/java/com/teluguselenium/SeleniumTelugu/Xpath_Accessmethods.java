package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Accessmethods {
	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

//following-sibling

WebElement emailBox=driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]"));
		
emailBox.sendKeys("thiru");

Thread.sleep(5000);
//Preceding-sibling

WebElement firstnameBox=driver.findElement(By.xpath("//label[text()='Email']/preceding-sibling::input[2]"));

firstnameBox.sendKeys("thiru123");

//Parent

WebElement Parent=driver.findElement(By.xpath("//label[text()='Email']/parent::div"));

//Child

WebElement child=driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][1]"));
child.clear();
child.sendKeys("text");

//ancestor
//div[@class='buttons']/ancestor::div

//ancestro-or-self
//div[@class='buttons']/ancestor-or-self::div

//descendant
//div[@class='container']/descendant::div

//descendant-or-self
//div[@class='container']/descendant-or-self::div

//following
//label[text()='First Name ']/following::label

//Preceding
//div[@class='container']/preceding::div

	}

}
