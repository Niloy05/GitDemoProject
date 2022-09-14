package com.herokupp.theinternet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BangaloreMirror {
	
	@Test

	public  void bangaloreMirror() {
		// TODO Auto-generated method stub
		
		//opening google chrome
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximizing window
		driver.manage().window().maximize();
		
		//opening the URL
		String url= "https://bangaloremirror.indiatimes.com/";
		driver.get(url);
		
		//sleep
		sleep(2000);
		
		/*
		 * //popup handler Alert alert= driver.switchTo().alert(); alert.dismiss();
		 */
		//getting the value
		WebElement bMirrior= driver.findElement(By.cssSelector(".mathq"));
		System.out.println("The value is: " +bMirrior.getText());
		sleep(2000);
		
		driver.quit();
		
	
		

	}

	private void sleep(long m) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}