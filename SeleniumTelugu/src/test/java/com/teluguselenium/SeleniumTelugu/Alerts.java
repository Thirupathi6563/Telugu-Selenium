package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//AlertBox
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[text()='Popup box output']")).getText());
		//System.out.println(" BeforeclickAlertBox:" +BeforeclickOnAlertBox);
		driver.findElement(By.id("alertBox")).click();
		String getTextforAlertbox=driver.switchTo().alert().getText();
		System.out.println("getTextforAlertbox:"+ getTextforAlertbox);
		driver.switchTo().alert().accept();
		String afterclickOnAlertBox=driver.findElement(By.id("output")).getText();
		System.out.println(" afterclickOnAlertBox:" +afterclickOnAlertBox);
		Thread.sleep(3000);
		
		//Conformbox for accept
		driver.findElement(By.id("confirmBox")).click();
		String getTextforConformbox=driver.switchTo().alert().getText();
		System.out.println("getTextforConformPopup:"+ getTextforConformbox);
		driver.switchTo().alert().accept();
		String afterclickOnConformBox=driver.findElement(By.id("output")).getText();
		System.out.println(" afterclickOnConformBox:" +afterclickOnConformBox);
		Thread.sleep(3000);
		//Conformbox for Cancel
		driver.findElement(By.id("confirmBox")).click();
				driver.switchTo().alert().dismiss();
				String afterclickOnDismissBox=driver.findElement(By.id("output")).getText();
				System.out.println(" afterclickOnDismissBox:" +afterclickOnDismissBox);
				
		//Prompt Box
				Thread.sleep(3000);
				driver.findElement(By.id("promptBox")).click();
				driver.switchTo().alert().sendKeys("thirupathi");
				String getTextforPromptBox=driver.switchTo().alert().getText();
				System.out.println("getTextforPromptPopup:"+ getTextforPromptBox);
				driver.switchTo().alert().accept();
				String afterclickOnPromptBox=driver.findElement(By.id("output")).getText();
				System.out.println(" afterclickOnpromptBox:" +afterclickOnPromptBox);
				
		
		
		

	}

}
