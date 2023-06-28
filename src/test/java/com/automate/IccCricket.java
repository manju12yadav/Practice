package com.automate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccCricket 
{

	@Test
	public void iccCrik() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		WebElement table = driver.findElement(By.xpath("//table[@class='table']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		FileInputStream fis=new FileInputStream("./src/test/resources/TestOutPut.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("iccCricketTable 1");
		int rowNum=-1;
		for ( WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			Row rw = sh.createRow(rowNum);
			int cellNum=0;
			for (WebElement cell : cells) {
				String value = cell.getText();
				Cell cl = rw.createCell(cellNum);
				cl.setCellValue(value);
				cellNum++;
			}
			rowNum++;
		}
		FileOutputStream fos=new FileOutputStream("./src/test/resources/TestOutPut.xlsx");
			wb.write(fos);
		wb.close();
		driver.close();

	}
}
