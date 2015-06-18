package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		
			     System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		                WebDriver driver=new ChromeDriver(); 
				driver.get("http://pos.opinioapp.com");	
//				WebElement element= driver.findElement(By.name("q"));
//				Thread.sleep(5000);
//				 element.sendKeys("selenium");
//				 element.submit();
//				Thread.sleep(5000);
				
	
			}
		

	}


