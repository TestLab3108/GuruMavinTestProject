package ddTesing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GMLoginPage {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Step 1:Connect a java with data file.
		FileInputStream fis=new FileInputStream("./Data.properties.properties");
		
		//Step 2:Load the Data file to Java System.
		Properties pro=new Properties();
		pro.load(fis);
		
		//Step 3:Fetch the data fron he Data file.
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASS = pro.getProperty("password");
		
				
		//driver.get("https://demo.actitime.com/login.do");
		
		driver.get(URL);	
		driver.findElement(By.id("username")).sendKeys(USERNAME);
    	driver .findElement(By.name("pwd")).sendKeys(PASS);
    	driver .findElement(By.id("loginButton")).click();

	}

}
