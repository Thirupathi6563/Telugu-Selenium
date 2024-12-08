package com.teluguselenium.SeleniumTelugu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenders {
	
	//int day =29;
	//FirstDate select
	/*WebElement firstDate=driver.findElement(By.id("first_date_picker"));
	firstDate.click();
	WebElement date=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]"));
	date.click();*/
	
	//Second Date - Unselect the previous dates in this month
	/*WebElement secondDate=driver.findElement(By.id("second_date_picker"));
	secondDate.click();
	WebElement date=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[not(contains(@class, 'ui-priority-secondary'))]["+day+"]"));
	date.click();*/
	

	public static void selectDate(WebDriver driver,String date) throws Exception
	{
				 Calendar calendar=Calendar.getInstance();
				
				try {
					SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
			        sdf.setLenient(false);//It won't move to another day. If the mention day is not present in a calendar then it will return error
				Date formaTParse = sdf.parse(date);
					calendar.setTime(formaTParse);
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
				throw new Exception ("Invalid date is provide , Please check the input date");
				}
					int targetMonth=calendar.get(Calendar.MONTH);
					System.out.println("targetmonth"+targetMonth);
					int targetYear=calendar.get(Calendar.YEAR);
					System.out.println("targetyear"+targetYear);
					int targetDate=calendar.get(Calendar.DAY_OF_MONTH);
				
					//WebElement secondDate=driver.findElement(By.id("second_date_picker"));
					//secondDate.click();
					
					String CurrentDate=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
					System.out.println(CurrentDate);
					SimpleDateFormat currentDateFormat=new SimpleDateFormat("MMM yyyy");
					Date CurrentTargetDate = currentDateFormat.parse(CurrentDate);
					calendar.setTime(CurrentTargetDate);
					int currentMonth=calendar.get(Calendar.MONTH);
					System.out.println("current Month"+currentMonth);
					int currentYear=calendar.get(calendar.YEAR);
					System.out.println("current Year"+currentYear);
					
					
					while(currentMonth < targetMonth || currentYear < targetYear)
					{
						WebElement nextButton=driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-next')]"));
						nextButton.click();
						 CurrentDate=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
						 currentDateFormat=new SimpleDateFormat("MMM yyyy");
						Date currentTargetDate = currentDateFormat.parse(CurrentDate);
						calendar.setTime(currentTargetDate);
						currentMonth=calendar.get(Calendar.MONTH);
						currentYear=calendar.get(calendar.YEAR);
				} 
					while(currentMonth > targetMonth || currentYear > targetYear)
					{
						WebElement nextButton=driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-prev')]"));
						nextButton.click();
						 CurrentDate=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
						 currentDateFormat=new SimpleDateFormat("MMM yyyy");
						Date currentTargetDate = currentDateFormat.parse(CurrentDate);
						calendar.setTime(currentTargetDate);
						currentMonth=calendar.get(Calendar.MONTH);
						currentYear=calendar.get(calendar.YEAR);
				} 
					
					if(currentMonth == targetMonth && currentYear == targetYear)
					{
						driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+targetDate+"]")).click();
					}
					else
					{
						throw new Exception(" Invalid date is Provide, Please check the input date");
					}
				

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		//String TargetDate="20/Feb/2015";
		driver.manage().window().maximize();
		driver.findElement(By.id("first_date_picker")).click();
		selectDate(driver,"20/Feb/2015");
		driver.navigate().refresh();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
		driver.findElement(By.id("second_date_picker")).click();
		selectDate(driver,"05/mar/2026");
		
		
		
	}

}
