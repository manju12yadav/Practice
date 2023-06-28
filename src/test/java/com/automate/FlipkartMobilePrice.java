package com.automate;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartMobilePrice 
{

	@Test
	public void phonePrices() throws AWTException, EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphone");


		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> phones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> allprices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
		for (int i = 0,j=0; i < phones.size()&& j<allprices.size(); i++,j++) {
			String key=phones.get(i).getText();
			String value=allprices.get(j).getText();
			map.put(key, value);
		}
		FileInputStream fis=new FileInputStream("./src/test/resources/TestOutPut.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("flipkart10");
		int i=0;
		for(Entry<String, String> lhm : map.entrySet())
		{
            			System.out.println(lhm.getKey()+" ---> "+lhm.getValue());
				sh.createRow(i++).createCell(0).setCellValue(lhm.getKey());
				sh.createRow(i++).createCell(1).setCellValue(lhm.getValue());
		}
		FileOutputStream fos=new FileOutputStream("./src/test/resources/TestOutPut.xlsx");
		wb.write(fos);


		driver.close();

	}
}