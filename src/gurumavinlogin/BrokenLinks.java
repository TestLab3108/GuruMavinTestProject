package gurumavinlogin;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		//capture all the link on web page
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		
		int count=0;
		for(WebElement wb:link)
		{
			System.out.println(wb.getText());
		}
		
		
		

	}

}
