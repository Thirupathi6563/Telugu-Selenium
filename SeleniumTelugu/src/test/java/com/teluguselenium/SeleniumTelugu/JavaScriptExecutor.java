package com.teluguselenium.SeleniumTelugu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.hyrtutorials.com/");
		
		//In java script we use id,name,classname,tag name,xpath and csss selector
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement username =(WebElement)js.executeScript("return document.getElementById('email');");
		//username.sendKeys("thiru");*/
		
	//Id
		/*js.executeScript("document.getElementById('email').value='thiru';");
		js.executeScript("document.getElementById('email').click();");
    //name
		
		js.executeScript("document.getElementByName('email').value='Gopal';");
	//classname
		js.executeScript("document.getElementsByClassName('inputtext').value='Barathi';");
	//TagName
		js.executeScript("document.getElementsByTagName('input')[2].value='yesh';");
		
	//css selector
		js.executeScript("document.querySelector('#email').value='prasanna';");
		
	//Click operation
		js.executeScript("document.getElementsByName('login')[0].click()");*/
		
//Highlight - barder 
		
	//js.executeScript("document.getElementById('email').style.border='20px red solid';");
	 
	//10px - is thickness
	//red - is the colour, you can take any colour
	//solid - which format you want to highlight , you use like solid,dotted,dashed,hyphen
	
//Highlight - Background
	
//js.executeScript("document.getElementById('email').style.background='yellow';");

//Highlight - Barder and Background 
//js.executeScript("document.getElementById('email').setAttribute('style','border:5px red solid;background:yellow')");
	

//Scroll or scrollTo - it will scroll the 0 ,200 and if you execute again then it will show same

js.executeScript("window.scrollTo(0,200);");

//ScrollBy -  it will scroll the 0 to 200 and if you execute again then it will scroll 200 to 400

js.executeScript("window.scrollBy(0,200);");

//ScrollIntoView - It will scroll the based on particular mentioned value
js.executeScript("document.getElementById('ty_footer').scrollIntoView();");
	}

}
