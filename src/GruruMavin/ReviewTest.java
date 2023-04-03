package GruruMavin;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewTest {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://gurumavin.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-Primary MuiButton-sizeMedium MuiButton-SizeMedium css-1scstjv\"]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-t1nuxs\"]")).click();
		
		driver.findElement(By.id("email")).sendKeys("student@student.com",Keys.TAB,"studentpassword",Keys.TAB,Keys.SPACE,Keys.ENTER);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[2]/nav/button[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[2]/nav[2]/button[1]")).click();
		
		Thread.sleep(3000);
		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
       
       
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[2]/div[8]/a/div/div/h2")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1hw9j7s']")).click();

		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeSmall MuiButton-containedSizeSmall css-1y02dll\"]")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("vertical-tab-5")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//label[@for=':rrn:']")).click();
	    
	    Thread.sleep(5000);
	    
	    WebElement label = driver.findElement(By.id("reviewText"));
	    
	    label.sendKeys("Excellent");
	    
	    Thread.sleep(2000);
	    
       driver.findElement(By.xpath("//*[@id=\"vertical-tabpanel-5\"]/div/p/div/div/form/button")).click();
       
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-Primary MuiButton-sizeMedium MuiButton-SizeMedium css-1scstjv\"]")).click();
	}

}
