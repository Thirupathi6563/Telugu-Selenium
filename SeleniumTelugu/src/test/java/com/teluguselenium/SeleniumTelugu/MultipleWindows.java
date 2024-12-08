package com.teluguselenium.SeleniumTelugu;

import java.util.ArrayList;
import java.util.Set;

import org.hamcrest.core.Is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		String ParentWindow=driver.getWindowHandle();
		System.out.println("Parentwindow id is..." +ParentWindow);
		
		//String webele
		/*
		for(int i=1;i<5;i++)
		{
		
		driver.findElement(By.xpath("//*[@target='_blank']["+ i +"]")).click();
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println("allwindows id is.." +allwindows);
		for(String childWindow:allwindows)
		{
			if(!ParentWindow.equals(childWindow))
			{
			String GetTitle=driver.switchTo().window(childWindow).getTitle();
			System.out.println(GetTitle);
			}
		}
		driver.switchTo().window(ParentWindow);
		}
		*/
		
		//if you want particular window then use this one 
		
		
		for(int i=1;i<5;i++)
		{
		
		driver.findElement(By.xpath("//*[@target='_blank']["+ i +"]")).click();
		Set<String> allwindows=driver.getWindowHandles();
		ArrayList<String> allTabs=new ArrayList<>(allwindows);
		System.out.println("allwindows id is.." +allTabs);
		String Title="";
		for(String childWindow:allTabs)
		{
			if(!ParentWindow.equals(childWindow))
			{
			Title=driver.switchTo().window(allTabs.get(1)).getTitle();
			System.out.println(Title);
			
			}
		}
		if(Title.equals("Google"))
		{
			break;
		}
		driver.switchTo().window(ParentWindow);
		
		}

		
		
		

	}

}
