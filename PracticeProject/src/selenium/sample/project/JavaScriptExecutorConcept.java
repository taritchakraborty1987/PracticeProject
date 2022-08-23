package selenium.sample.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		//Chrome Driver Creation
		System.setProperty("webdriver.chrome.driver", "D:\\PersonalStudy\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		System.out.println("Before login title is : "+driver.getTitle());
		Thread.sleep(2000);
		
		//Login WebElements
		WebElement fieldLogin = driver.findElement(By.id("email"));
		WebElement fieldPassword = driver.findElement(By.id("pass"));
		WebElement buttonLogin = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		//Credentials
		String userName=valueFromPropertiesFile().getProperty("userName");
		String password=valueFromPropertiesFile().getProperty("password");
		
		//Actions
		fieldSendKey(fieldLogin,userName);
		fieldSendKey(fieldPassword,password);
		
		flashElement(buttonLogin,driver);
		drawBorder(buttonLogin, driver);
		takeScreenshot(driver);
		generateAlert(driver, "Here We Found Error!");
		Thread.sleep(2000);
		alertControl(driver);
		
		fieldClick(buttonLogin);
		Thread.sleep(2000);
		System.out.println("After login title is : "+driver.getTitle());
		
		//After Login WebElements
		WebElement linkProfile = driver.findElement(By.xpath("//span[text()='TestingNuts Boults']"));
		
		jsClick(driver, linkProfile);
		Thread.sleep(2000);
		jsRefresh(driver);
		System.out.println("Current page title is : "+jsToGetPageTitle(driver));
		System.out.println("Current page text is : "+jsToGetPageText(driver));
		
		Thread.sleep(2000);
		jsPageScroll(driver);
		
		Thread.sleep(2000);
		jsRefresh(driver);
		Thread.sleep(2000);
		
		//After Login WebElements
		//WebElement linkAdvertising = driver.findElement(By.xpath("//a[text()='Advertising']"));
		//jsScrollIntoView(driver, linkAdvertising);
		
	}
	
	
	//Useful methods:
	//Java related methods
	public static Properties valueFromPropertiesFile() throws IOException{ //Method to get value from properties file
		//Create Properties file Object
		Properties objProperties = new Properties();
		//How to define Path of properties file
		FileInputStream fileInput = new FileInputStream("D:\\PersonalStudy\\JavaPractice\\PracticeProject\\src\\selenium\\sample\\project\\configure.properties");
		//To load all value under properties object
		objProperties.load(fileInput);
		return objProperties;
	}
	
	public static String createCurrentDate() {
		//How to deal with date format
		Date currentDate=new Date();
		String formatedCurrentDate=currentDate.toString().replace(" ", "-").replace(":", "");
		return formatedCurrentDate;
	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException {
		//How to Take Screenshot
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("D:\\PersonalStudy\\JavaPractice\\PracticeProject\\src\\selenium\\sample\\project\\output\\JSEC"+createCurrentDate()+".png"));
	}
	
	
	//Selenium related methods
	public static void fieldSendKey(WebElement elementID, String fieldValue) {
		elementID.sendKeys(fieldValue);
	}
	
	public static void fieldClick(WebElement elementID) {
		elementID.click();
	}
	public static void alertControl(WebDriver driver) {
		//How to deal with Alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	//Java Script related methods
	public static void flashElement(WebElement element, WebDriver driver){
		String bgcolor = element.getCssValue("backgroundcolor");
		for(int i=0; i<10; i++) {
			changeColor("rgb(300,0,0)", driver, element);
			changeColor(bgcolor, driver, element);
		}
	}

	public static void changeColor(String color, WebDriver driver, WebElement element){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		try {
			Thread.sleep(300);
			}
		catch (InterruptedException e) {
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver, String message){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("alert('"+message+"')");
	}
	
	public static void jsClick(WebDriver driver, WebElement element){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void jsRefresh(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("history.go();");
	}
	
	public static String jsToGetPageTitle(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		String pageTitle=js.executeScript("return document.title;").toString();
		return pageTitle;
	}
	
	public static String jsToGetPageText(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		String pageText=js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void jsPageScroll(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void jsScrollIntoView(WebDriver driver, WebElement element){
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	

}
