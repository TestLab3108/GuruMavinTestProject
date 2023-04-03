package gurumavinlogin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scrrenshot {

	public static void main(String[] args) throws Throwable {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("www.google.com");
	}
	
	     public static void takeScreenshot(String fileName) {	
		//take a screenshot and store into its file format
	
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Now copy the file to desired location using copyfile method:
		Files.copy(file,new File(":\\Users\\HP\\eclipse-workspace\\GuruMavin TestProject"+fileName));
		
	  
	     }

	}


