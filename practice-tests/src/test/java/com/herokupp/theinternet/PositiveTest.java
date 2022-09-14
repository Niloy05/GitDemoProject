package com.herokupp.theinternet;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest {
	
	public static WebDriver driver;

	@Test
	public void loginTest() throws Exception {

		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open google chrome page
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);

		// sleep for 3 secs
		sleep(3000);

		// This is for console
		System.out.println("Page is opened");

		// enter user name
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");

		// enter password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");

		// sleep2 sec
		sleep(2000);

		// click on login
		WebElement loginBtn = driver.findElement(By.className("radius"));
		loginBtn.click();

		/*
		 * // Taking screenshot TakesScreenshot sh = (TakesScreenshot) driver; //
		 * TypeCasting
		 * 
		 * File src = sh.getScreenshotAs(OutputType.FILE); // for taking screenshot
		 * 
		 * FileHandler.copy(src, new File(".//test1.png"));
		 */
		
		TakesScreenshot();
		
		// sleep2 sec
		sleep(2000);

		// verifications
		// new URL
		String exURL = "https://the-internet.herokuapp.com/secure";
		String actURL = driver.getCurrentUrl();

		Assert.assertEquals(exURL, actURL, "Url is not a match");

		// logout button
		WebElement logoutBtncheck = driver.findElement(By.cssSelector(".icon-2x.icon-signout"));

		// This is f7or console
		System.out.println("Page is Testing");

		// successful login msg
		WebElement successMsg = driver.findElement(By.xpath("//div[@id='content']//h2"));

		System.out.println("Page is Testing2");

		// click logout button
		WebElement logoutBtn = driver.findElement(By.cssSelector(".icon-2x.icon-signout"));
		logoutBtn.click();

		// This is for console
		System.out.println("Logout is a success");

		// login page verification WebElement loginPage =
		driver.findElement(By.xpath("//div[@id='content']//h2[.='Login Page']"));

		// wait
		sleep(2000);

		// This is for console
		System.out.println("Test is successful");
		
		

		// close browser
		driver.quit();
		
		WebDriver driver1 = new ChromeDriver();
		String url1="https://the-internet.herokuapp.com/upload";
		driver1.get(url1);
		
		sleep(3000);
		
		WebElement upload= driver.findElement(By.id("file-upload"));
		upload.sendKeys("F:\\AZ-900\\Due.jpg");
		
		
		
		

	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void TakesScreenshot() throws Exception{

		TakesScreenshot sh = (TakesScreenshot) driver; // TypeCasting
		File src = sh.getScreenshotAs(OutputType.FILE); // for taking screenshot
		FileHandler.copy(src, new File(".//test.png"));

	}

}
