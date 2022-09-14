package com.herokupp.theinternet;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ElementScreenshot {
	
	@Test

	public  void takeScreenshot() throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement element = driver.findElement(By.cssSelector("div#navSwmHoliday  img"));
		File scrFile = element.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File("./image.png"));
		driver.quit();

	}

}
