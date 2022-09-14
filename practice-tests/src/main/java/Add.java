import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Add {
	
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String url="https://bangaloremirror.indiatimes.com/";
		driver.get(url);
		
		WebElement first= driver.findElement(By.className("mathq"));
		String value=first.getText();
		
		System.out.println(value);
		//int i =Integer.parseInt(value);
		
		
			
		
		

	}

}
