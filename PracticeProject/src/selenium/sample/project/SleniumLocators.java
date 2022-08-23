package selenium.sample.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SleniumLocators {

	public static void main(String[] args){
		WebDriver driver;
		
		//Chrome Driver Creation
		System.setProperty("webdriver.chrome.driver", "D:\\PersonalStudy\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//span[@id='gh-ug-flex']/a")).click();
		driver.findElement(By.linkText("register")).click();
		//Locators related sessions
		driver.findElement(By.xpath("//label[@for='businessaccount-radio']")).click();
		
		/*//Select value from combo box
		Select select =new Select(driver.findElement(By.xpath("//label[@for='businessaccount-radio']")));
		select.deselectByVisibleText("Test");
		select.selectByVisibleText("Test");*/
	}

}
