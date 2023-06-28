package com.interviewChallenges;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
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

public class Cosmocode 
{

	@Test
	public void cosmo() throws EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://cosmocode.io/automation-practice-webtable");

		List<WebElement> list = driver.findElements(By.xpath("//td[contains(text(),'English')]/preceding-sibling::td[contains(text(),'Dollar')]/preceding-sibling::td/strong"));

		FileInputStream fis=new FileInputStream("./src/test/resources/Output.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("cosmoCountry18");
		int i = 0;
		for ( WebElement country: list)
		{
			while ( i <30 )
			{
				String cu = country.getText(); //india
					sh.createRow(i).createCell(1).setCellValue(cu);
					break;
			}
			i++;

		}
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Output.xlsx");
		wb.write(fos);
		driver.close();
	}
}