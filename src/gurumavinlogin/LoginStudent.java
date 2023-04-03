package gurumavinlogin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStudent {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://gurumavin.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-Primary MuiButton-sizeMedium MuiButton-SizeMedium css-1scstjv']")).click();
		driver.findElement(By.xpath("//div[@class='MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-t1nuxs']")).click();
		driver.findElement(By.id("email")).sendKeys("Student@student.com",Keys.TAB,"studentpassword",Keys.TAB,Keys.SPACE,Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[2]/nav[1]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[2]/nav[2]/button[1]")).click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[2]/div[6]/a/div/div/h2")).click();
		
		
	}

}
