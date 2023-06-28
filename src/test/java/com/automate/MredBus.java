package com.automate;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MredBus {

	@Test
	public void busTickets() throws IOException, InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in");
		driver.findElement(By.id("src")).sendKeys("bangalore");
		driver.findElement(By.xpath("//text[.='Madiwala']")).click();
		driver.findElement(By.id("dest")).sendKeys("Chennai");
		driver.findElement(By.xpath("//text[.='Koyambedu']")).click();
		driver.findElement(By.id("onward_cal")).click();
//		driver.findElement(By.xpath("//button[.='>']")).click();
		driver.findElement(By.xpath("//*[name()='svg']")).click();
		driver.findElement(By.xpath("//span[.='25']")).click();
		driver.findElement(By.id("search_button")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//i[@class='icon-close coach-close']")).click();
		
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		driver.switchTo().defaultContent();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;

		for(;;) 	
		{
			try {
				driver.findElement(By.xpath("//div[text()='Northern Travels']")); //last bus xpath
				break;
			}
			catch (Exception e) {
				 {
					js.executeScript("window.scrollBy(0,800)");
				};
				
			} 
			
		}
		List<WebElement> travels = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		List<WebElement> busFare = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']/ancestor::div/descendant::div[@class='fare d-block']"));
		int count = travels.size();
		System.out.println(count);
		
		for (int i=0;i<count;i++) {
			System.out.println(travels.get(i).getText()+"--->"+busFare.get(i).getText());
		}

	}
}
