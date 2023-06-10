package com.advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateFlipkart {

		@Test
		public void phonePrices() throws AWTException
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[text()='✕']")).click();
//			try {
				driver.findElement(By.name("q")).sendKeys("phone");
				
//			} catch (Exception e) {
//				
//			}
//			Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_ENTER);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			List<WebElement> allprices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			int count = allprices.size();
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for (int i = 0; i < count; i++) {
				String text = allprices.get(i).getText().replaceAll(",", "");  //1,999  1999
				
				String text1 = text.substring(1);
				list.add(Integer.parseInt(text1));
			}
			
			Collections.sort(list);
			System.out.println(list); 
			
		}
}
