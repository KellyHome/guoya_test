package guoya_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class selenium_testTest {
	
	    WebDriver driver;
  
  @BeforeMethod
  public void beforeselenium_testTest() {
	  
		System.setProperty("webdriver.chrome.driver", "D:/software/chromedriver/chromedriver.exe");

//		这里是set不是get
//		System.getProperty("webdriver.chrome.driver", "D:/software/chromedriver/chromedriver.exe");

		 driver= new ChromeDriver();
	
		driver.get("http://127.0.0.1:8089/guoya_test/myhtml.html");
		
		boolean isSuccess=driver.getPageSource().contains("用户名");
		
		System.out.println(isSuccess);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }

  @AfterMethod
  public void Afterselenium_testTest() {
	  
	  driver.quit();
  }

  @Test
  public void selenium_testTest() {
	  WebElement username=driver.findElement(By.id("username"));
		 username.clear();
		 username.sendKeys("Kelly_test");
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("kelly");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean result=driver.getPageSource().contains("post case");
		
		Assert.assertEquals(true, result);
		
		System.out.println(result);
  }
  
}
