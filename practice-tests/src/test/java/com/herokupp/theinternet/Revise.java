package com.herokupp.theinternet;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Revise {

	@Test

	public void popUpTest() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximise
		driver.manage().window().maximize();

		// Open Url
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);

		// sleep
		sleep(2000);

		// click on hypertext
		WebElement context = driver.findElement(By.linkText("Context Menu"));
		context.click();

		// Import action--- to basically do any action mouse and keyboard
		Actions action = new Actions(driver);

		// right click
		WebElement rightClick = driver.findElement(By.id("hot-spot"));
		action.contextClick(rightClick).perform();

		// popup handler
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// sleep
		sleep(2000);

		// click on Powered by
		WebElement powerBy = driver.findElement(By.linkText("Elemental Selenium"));
		powerBy.click();

		// going to new window
		driver.navigate().to("http://elementalselenium.com/");

		sleep(2000);

		driver.close();

		// sleep(2000)
		driver.quit();

	}

	@Test(priority = 1,enabled=false)

	public void dropDown() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();

		// open site
		String url1 = "https://the-internet.herokuapp.com/";
		driver1.get(url1);

		// sleep
		sleep(2000);

		// Find element
		WebElement dropDown = driver1.findElement(By.linkText("Dropdown"));
		dropDown.click();

		// sleep
		sleep(2000);

		// identify dropdown
		WebElement identifyDropDown = driver1.findElement(By.id("dropdown"));
		// identifyDropDown.click();

		// select class
		Select sl = new Select(identifyDropDown);

		// sl.selectByValue("Option 1");//("Option 1");
		sl.selectByIndex(2);

		// sleep
		sleep(2000);

		// getting text and printing out
		String s = sl.getFirstSelectedOption().getText();
		System.out.println("The Value selected " + s);

		driver1.quit();

	}

	@Test(priority = 3,enabled=false)

	public void checkBox() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		// opening in incognito
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");

		WebDriver driver2 = new ChromeDriver(option);

		// maximize
		driver2.manage().window().maximize();

		// open URL

		String url2 = "https://the-internet.herokuapp.com/";
		driver2.get(url2);

		// sleep
		sleep(2000);

		// click on checkboxlink
		WebElement checkBox = driver2.findElement(By.linkText("Checkboxes"));
		checkBox.click();

		// sleep
		sleep(2000);

		// clicking on checkbox1
		WebElement checkBox1 = driver2.findElement(By.cssSelector("form#checkboxes > input:nth-of-type(1)"));
		checkBox1.click();

		sleep(2000);

		// Clicking on checkbox2
		WebElement checkBox2 = driver2.findElement(By.cssSelector("form#checkboxes > input:nth-of-type(2)"));
		checkBox2.click();

		// sleep
		sleep(2000);

		driver2.close();

	}

	@Test(enabled=false)
	public void uploadTest() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		ChromeDriver driver3 = new ChromeDriver();

		// opening url
		String url3 = "https://the-internet.herokuapp.com/";
		driver3.get(url3);

		// clicking on linktest
		WebElement fileUpload = driver3.findElement(By.linkText("File Upload"));
		fileUpload.click();

		// sleep
		sleep(2000);

		// uploading a doc
		WebElement chooseFile = driver3.findElement(By.cssSelector("input#file-upload"));
		chooseFile.sendKeys("C:/Users/Niloy Chatterjee/Videos/ATK.JPG");

		sleep(2000);

		// clicking on upload btn
		WebElement uploadBtn = driver3.findElement(By.cssSelector("input#file-submit"));
		uploadBtn.click();

		sleep(2000);

		driver3.quit();

	}
	
	@Test
	public void wikiPedia() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		ChromeDriver driver4 = new ChromeDriver();

		// opening url
		String url4 = "https://www.wikipedia.org/";
		driver4.get(url4);
		
		String title= driver4.getTitle();
		//String text= title.
		System.out.println(title);
		
		WebElement element = driver4.findElement(By.tagName("div"));
		
		List<WebElement> elements = element.findElements(By.name(title));
		System.out.println(elements);
		
		
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
