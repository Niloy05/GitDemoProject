package com.herokupp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	
	@Test

	public void googleSearch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		String url="https://www.google.co.in/";
		driver.get(url);
		
		
		System.out.println("Getting URL");
		System.out.println("Getting URL");
		System.out.println("Getting URL");
		System.out.println("Getting URL");
		
		
		WebElement searchBox= driver.findElement(By.name("q"));
		searchBox.sendKeys("Fresco Play");
		searchBox.sendKeys(Keys.ENTER);
		
		WebElement linkFresco= driver.findElement(By.cssSelector("a[ping^='/url?sa=t&source=web&rct=j&url=https://play-api.fresco.me/&v'] > .DKV0Md.LC20lb.MBeuO"));
		
		linkFresco.click();
		
		

	}

}
