package NERLExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ComExcel {
	
	@Test(dataProvider="Sample")
public void Demo(String UserName,String Password) throws InterruptedException{
	System.out.println("User Name: -"+UserName +"  Password is:- "+Password);
	System.out.println("Test Case Execution Started");
	 
	 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	 
	 Thread.sleep(2000);

	  WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://nerltest.erepository.in/");
	 
	driver.manage().window().maximize();
	
	 driver.findElement(By.xpath(".//*[@id='l-login']/form/div[2]/div/div[1]/div/input")).sendKeys(UserName);
	 
	 driver.findElement(By.xpath(".//*[@id='l-login']/form/div[2]/div/div[2]/div/input")).sendKeys(Password);
		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath(".//*[@id='l-login']/form/a")).click();
}
@DataProvider(name="Sample")
public Object[][] Dataprv() throws IOException
{
	
	//FileInputStream fis = new FileInputStream("D:/TestDataExchange.xlsx");
	
	 File src=new File("D:/TestDataExchange.xlsx");
	 FileInputStream fis=new FileInputStream(src);
	 XSSFWorkbook wb=new XSSFWorkbook(fis);
	 XSSFSheet sh1= wb.getSheetAt(0);
	
	 int RowCount=sh1.getLastRowNum();
	 
	 int LastCol=sh1.getRow(RowCount).getLastCellNum();
	 
	 Object[][] newdata = new Object[RowCount][2];
	 
	 System.out.println("Row Count Is :-"+RowCount+ " Column Count Is :- "+LastCol);
	 
	 for(int i=1;i<=RowCount;i++){
	
		 for(int j=0;j<LastCol;j++){
		
			 newdata[i-1][j]=sh1.getRow(i).getCell(j).getStringCellValue(); 
		 }
	 }
	 	 
	 return newdata;
	
}

}
