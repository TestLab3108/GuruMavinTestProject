package ddTesing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logineducator {

	
		public static void main(String[] args) throws InterruptedException 
		{
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		
		//To at the URL of GuruMavin.
		driver.get("https://gurumavin.in/");
		
		//To click on Sign in page
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[3]/button"));
		
		//To go for the Login page of Gurumavin.
		driver.get("https://gurumavin.in/educator-account");
		
		//To have 10 sec pause at page
		 Thread.sleep(3000);
		 
		//To maximize the login page of GuruMavin
		driver.manage().window().fullscreen();
		  
		//To enter the Email 
		driver.findElement(By.id("email")).sendKeys("educator@educator.com");
		
		//To enter the Passsword
		 driver.findElement(By.id("password")).sendKeys("educatorpassword");
		 
		 
		 
		 //To click on submit Button
		 driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/main/div/form/button")).click();
		 
		 Thread.sleep(5000);
		 		 
		//To click on Educator option after login
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[3]/button[2]")).click();
		 
		 //To click on Manage Test
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[4]/div/div[2]/span")).click();
		 
		 Thread.sleep(5000);
		 
		 //To click on Back arrow
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")).click();
		 
		 Thread.sleep(20000);
		 
		 //To click on Create Test
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/button")).click();
		 
		 //To enter the title
		 driver.findElement(By.id("title")).sendKeys("Selenium Basic ");
		 
		 //To enter the description
		 driver.findElement(By.id("description")).sendKeys("Selenium is an open-source tool that automates web browsers. It provides a single interface that lets you write test scripts in programming languages like Ruby, Java, NodeJS, PHP, Perl, Python, and C#, among others.");
		 
		 //To enter the category
		 driver.findElement(By.id("category")).click();
		 
		 Thread.sleep(3000);
		 
		 //To click on Technology
		 driver.findElement(By.xpath("//*[@id=\"menu-category\"]/div[3]/ul/li[1]")).click();
		 
		 //To click on Subcateory
		 driver.findElement(By.id("sub_category")).click();
		 
		 Thread.sleep(3000);
		 
		 //To click on Automation
		 driver.findElement(By.xpath("//*[@id=\"menu-sub_category\"]/div[3]/ul/li[1]")).click();
		 
		 Thread.sleep(3000);
		 
		 //To click on Language
		 driver.findElement(By.id("language")).sendKeys("English");
		 
		 //To click on Add Test
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/form/button")).click();
		 
		 Thread.sleep(20000);
		 
		 //To click on Close Button
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button")).click();
		 
		 Thread.sleep(4000);
		 
		 //To click on signout button
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[3]/button[1]")).click();
		 
		 Thread.sleep(4000);
		 
		 //To click on signin button
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[3]/button")).click();
		 
		 //To click on Educational Institue
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[4]/div/button/div/div")).click();
		 
		 //To enter the email
		 driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		 
		 //To enter the password
		 driver.findElement(By.id("password")).sendKeys("adminpassword");
		 
		 Thread.sleep(4000);
		 
		 //To click Sign in Button
		 driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/main/div/form/button")).click();
		 
		 Thread.sleep(5000);
		 
		 //Tp click admin option
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[3]/button[2]/div")).click();
		 
		 //To click on manage Test option
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[8]/div/div[2]/span")).click();
		 
		 Thread.sleep(4000);
		 
		//To click on Back Arrow
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")).click();
		 
		 Thread.sleep(10000);
		 
		 //To select row no
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[3]/div/div[2]")).click();
		 
		 //To click on 25
		 driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click();
		 
		 Thread.sleep(5000);
		 
		 //To click on option
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[2]/table/tbody/tr[11]/td[6]/ul/div/div/span")).click();
		 
		 Thread.sleep(4000);
		 
		//To click on Publish
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[2]/table/tbody/tr[11]/td[6]/ul/div[2]/div/div/div[2]/div")).click();
		 
		 //To click on option
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[2]/table/tbody/tr[11]/td[6]/ul/div/div/span")).click();

		//To click on SignOut Option
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[3]/button[1]")).click();
		 
		 Thread.sleep(4000);
		 
		 //To click on Sign in 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[3]")).click();
		 
		 Thread.sleep(2000);
		 
		 //click as I am Students
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/button/div/div")).click();
		 
		 //Enter a Email as Student
		 driver.findElement(By.id("email")).sendKeys("student@student.com");
		 
		 //Enter the password
		 driver.findElement(By.id("password")).sendKeys("studentpassword");
		 
		 //Click on Sign In
		 driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/main/div/form/button")).click();
		 
		 Thread.sleep(4000);
		 
		 //click on Technology
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[2]/nav/button[1]")).click();
		 
		 Thread.sleep(4000);
		 
		 //click on Auomation
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[2]/nav[2]/button[1]")).click();
		 
		 Thread.sleep(4000);
		 
		 
		 //click on Practise set
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div/div/label[3]/span[1]/input")).click();
		 
		 Thread.sleep(4000);
		 
		 //click on Selenium basic
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[2]/div[3]/a/div/div/h2/strong")).click();
		 
		 Thread.sleep(4000);
		 
		 //Click on Create a new Test
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[2]/div/div[2]/button")).click();
		 
		 //Enter the title of the Test
		 driver.findElement(By.id("title")).sendKeys("Introduction of Selenium");
		 
		 Thread.sleep(1000);
		 
		 //Select the Time Question Type
		 driver.findElement(By.name("controlled-radio-buttons-group")).click();
		 
		 Thread.sleep(1000);
		 
		 //Click  on level low
		 driver.findElement(By.name("low")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
	
		 

			}

	}


