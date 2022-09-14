package com.herokupp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_PositiveTest {
	
	@Test

	public void amazonPositiveTest() {
		
			

		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		//opening the incognito window
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriver driver = new ChromeDriver(options);

		// maximize browser
		driver.manage().window().maximize();

		// open web page
		String url = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
		driver.get(url);
		// enter user name
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("8250896707");
		
		
		//click continue
		WebElement conBtn = driver.findElement(By.className("a-button-inner"));
		conBtn.click();
		/*
		 * WebElement conBtnSize=driver.findElement(By.className("a-button-inner").
		 * //.getCssValue("Font Size"); System.out.println(conBtnSize);
		 */

		// enter password
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("05041993");

		// sleep3 secs
		sleep(2000);

		// click on login
		WebElement loginBtn = driver.findElement(By.className("a-button-input"));
		loginBtn.click();

		// sleep3 secs
		sleep(3000);
		
		//click on linked 
		WebElement linkBtn= driver.findElement(By.linkText("Your Browsing History"));
		
		String linkBtnSize= driver.findElement(By.linkText("Your Browsing History")).getCssValue("Font Size");
		System.out.println(linkBtnSize);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Your Browsing History"))).perform();
		
		System.out.println("Waiting for 3 secs");
		
		sleep(3000);
		
		linkBtn.click();
		
		sleep(3000);
		

		// close browser
		driver.quit();

	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
