package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		// If the data in Search then need to use this one
		/*WebElement SearchButton=driver.findElement(By.className("gLFyf"));
		SearchButton.sendKeys("Facebook");
		System.out.println(SearchButton.getAttribute("value"));*/
		
		// If the data is normal then need to use this one
		System.out.println(driver.findElement(By.xpath("//*[@class='gb_H']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[text()='తెలుగు']")).getCssValue("#1a0dab"));
		
		
		

	}

}
