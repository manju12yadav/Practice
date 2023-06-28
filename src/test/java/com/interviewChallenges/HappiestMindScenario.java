package com.interviewChallenges;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HappiestMindScenario 
{

	@Test
	public void googleSearch() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("wiki");
		List<WebElement> search = driver.findElements(By.xpath("//span[contains(text(),'wiki')]"));
		Thread.sleep(3000);
		int i=1;
		for (WebElement ele : search) {
			System.out.println(i+")"+ele.getText());
//			System.out.println(ele.getText());
			i++;
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number/word");
		int n = sc.nextInt();
//		String n=sc.nextLine();
//		for (WebElement ele : search) {
//			if(n.equals(ele.getText()))
//			{
//				ele.click();
//				break;
//			}
//		}
		search.get(n-1).click();
		
	}
}
