package selenium.sample.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumWebdriverCreation {

	static WebDriver driver;
	
	//Method to get value from properties file
	public static Properties readProperties() throws IOException {
		//Create Properties file Object
		Properties propertiesObj = new Properties();
		
		//How to define Path of properties file
		FileInputStream fileInput = new FileInputStream("D:\\PersonalStudy\\JavaPractice\\PracticeProject\\src\\selenium\\sample\\project\\config.properties");
		
		//To load all value under properties object
		propertiesObj.load(fileInput);
		
		return propertiesObj;
	
	}
	
	public static void main(String[] args) throws IOException {
		/*Reminder Note: 
		-WebDriver is an Interface
		*/
		String browserType=readProperties().getProperty("browser");
		
		if(browserType.equalsIgnoreCase("firefox")==true){
			//FF Driver Creation
			System.setProperty("webdriver.gecko.driver", "D:\\PersonalStudy\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}if(browserType.equalsIgnoreCase("chrome")==true){
			//Chrome Driver Creation
			System.setProperty("webdriver.chrome.driver", "D:\\PersonalStudy\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}if(browserType.equalsIgnoreCase("safari")==true){
			//Safari Driver Creation
			/*Reminder Note: 
			-Need to add 
			*/
			driver=new SafariDriver();
			driver.manage().window().maximize();
		}if(browserType.equalsIgnoreCase("ie")==true){
			//IE Driver Creation
			System.setProperty("webdriver.ie.driver", "D:\\PersonalStudy\\IEdriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		
		driver.get(readProperties().getProperty("url"));
		if(driver.getTitle().compareToIgnoreCase("Google")==0) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
