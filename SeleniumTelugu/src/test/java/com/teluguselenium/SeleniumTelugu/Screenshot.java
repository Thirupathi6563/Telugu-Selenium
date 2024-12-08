package com.teluguselenium.SeleniumTelugu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		/*WebDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot t=(TakesScreenshot)driver; // in Webdriver we don't have any get screenshot method that's why we are taking takes screenshot interface 
		File sourceFile=t.getScreenshotAs(OutputType.FILE);
		 File DestinationFile =new File("./Screenshots/img1.png");
		 FileUtils.copyFile(sourceFile,DestinationFile);*/
		
		
/*RemoteWebDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
// In remote webdriver or Chromebdriver is a class in this class we have get screenshot method that's why we don't need to use take screenshot interface 
		File sourceFile=driver.getScreenshotAs(OutputType.FILE);
		 File DestinationFile =new File("./Screenshots/img1.png");
		 FileUtils.copyFile(sourceFile,DestinationFile);*/
		 
		//Bytes
		/*ChromeDriver driver=new ChromeDriver(); 
        driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		byte[] Arraybyte=driver.getScreenshotAs(OutputType.BYTES);
		 File Destinationfile =new File("./Screenshots/img2.png");
		 FileOutputStream fos=new FileOutputStream(Destinationfile);
		 fos.write(Arraybyte);
		 fos.close();*/
		 
		 //base64
		ChromeDriver driver=new ChromeDriver(); 
        driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 String base64Code=driver.getScreenshotAs(OutputType.BASE64);
		 //This format will be encrypted so if we want use then you need to decode
		 byte[] bytecode=Base64.getDecoder().decode(base64Code);
		 File DestinationFile=new File("./Screenshots/img3.png");
		 FileOutputStream fos=new FileOutputStream(DestinationFile);
		 fos.write(bytecode);
		 fos.close();
		 
		 
		 

	}

}
