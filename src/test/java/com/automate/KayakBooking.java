package com.automate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KayakBooking {
	
	@Test
	public void kayak() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.kayak.co.in");
		driver.findElement(By.xpath("//div[.='Flights']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Bengaluru (BLR)']//div[@aria-label='Remove']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Flight origin input']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//span[.='New Delhi, National Capital Territory of India, India']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//span[.='Bengaluru, Karnataka, India']")).click();
		driver.findElement(By.xpath("//span[@aria-label='Start date calendar input']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Saturday 15 July, 2023']")).click();
		driver.findElement(By.xpath("//span[@aria-label='End date calendar input']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Tuesday 18 July, 2023']")).click();
		driver.findElement(By.xpath("//div[@class='zEiP-formFieldOutline']//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		Set<String> windows = driver.getWindowHandles();
		String exp = "Book now: DEL to BLR, 15/7 — 18/7";
		Iterator<String> it=windows.iterator();
		while(it.hasNext()) 
		{
			String win = it.next();
			String act = driver.switchTo().window(win).getTitle();
			Thread.sleep(5000);
			System.out.println(act);
			if(act.contains(exp))
			{
				break;
			}
		}
		Thread.sleep(5000);
	System.out.println(driver.getTitle());
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='f8F1-price-text']"));
		
		int count=price.size();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < count; i++)
		{
		String text = price.get(i).getText().replaceAll(",", "");
		String text1 = text.substring(2);
		list.add(Integer.parseInt(text1));
		}
		System.out.println(list);
		for (Integer ticket : list) {
			if(ticket<=12000)
					System.out.println(ticket);
		}
		
	}
}
