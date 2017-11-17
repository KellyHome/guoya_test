package guoya_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class selenium_test {
	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.chrome.driver", "D:/software/chromedriver/chromedriver.exe");

//		这里是set不是get
//		System.getProperty("webdriver.chrome.driver", "D:/software/chromedriver/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
	
		driver.get("http://127.0.0.1:8089/guoya_test/myhtml.html");
		
		boolean isSuccess=driver.getPageSource().contains("用户名");
		
		System.out.println(isSuccess);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement username=driver.findElement(By.id("username"));
		 username.clear();
		 username.sendKeys("Kelly_test");
		 
		 Thread.sleep(2000);
		 
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("kelly");
		
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		Thread.sleep(2000);
		
		boolean result=driver.getPageSource().contains("post case");
		
		Assert.assertEquals(true, result);
		
		System.out.println(result);
		
		driver.quit();
		
	}
	

}
