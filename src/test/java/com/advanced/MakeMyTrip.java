package com.advanced;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MakeMyTrip 
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://www.makemytrip.com/");
		Actions act = new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='notification-frame-173061603']"));
		driver.switchTo().frame(frame);
		
		WebElement popup = driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']"));
		wait.until(ExpectedConditions.visibilityOf(popup));
		js.executeScript("arguments[0].click()", popup);
//		popup.click();
		WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
		from.click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("blr");
		List<WebElement> benglrList = driver.findElements(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"]"));
		String expexted = "Bengaluru, India";
		for (WebElement lst : benglrList) {
			if (lst.getText().equals(expexted)) {
				System.out.println("bengaluru is present");
				break;
			}
		}
		System.out.println();

		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		WebElement to = driver.findElement(By.xpath("//span[text()='To']"));
		to.click();
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("vtz");
		List<WebElement> vtglist = driver.findElements(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"]"));

		String expectedVtg = "Visakhapatnam, India";

		for (WebElement vtg : vtglist) {
			if (vtg.getText().equals(expectedVtg)) {
				System.out.println("vtg is present");
				break;
			}
		}
		System.out.println();

		driver.findElement(By.xpath("//p[text()='Visakhapatnam, India']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Departure']")).click();

		//Thu Jun 01 2023

		driver.findElement(By.xpath("//div[@aria-label='Thu Jun 01 2023']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Mon Jul 03 2023']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
//		act.click().perform();

		List<WebElement> flights = driver.findElements(By.xpath("//span[@class='boldFont blackText']"));

		List<WebElement> depart = driver.findElements(By.xpath("//font[.='Bengaluru']/ancestor::p/preceding-sibling::p"));

//		for (WebElement fli :flights) 
//		{
//			String flightName = fli.getText();
//			System.out.println(flightName);
//		}
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Output.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("makemytrip15");
		int s = flights.size();
			for(int i=0;i<s;i++)
			{
				for (WebElement fli :flights) 
				{
					String flightName = fli.getText();
					sh.createRow(i).createCell(0).setCellValue(flightName);
				}
				
//				for (WebElement dep : depart) 
//				{
//					String departure = dep.getText();
//					sh.createRow(i).createCell(1).setCellValue(departure);
//				}
			}
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Output.xlsx");
		wb.write(fos);
		wb.close();

	}

}


