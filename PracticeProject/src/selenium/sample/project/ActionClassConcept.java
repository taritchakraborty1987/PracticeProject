package selenium.sample.project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		//Chrome Driver Creation
		System.setProperty("webdriver.chrome.driver", "D:\\PersonalStudy\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		
		//Dynamic Wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Code not working right now need to know new code applicable for Selenium 4
		
		//Mouse moving
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"))).build().perform();
		
		
		//Drag and Drop
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title='Photo Manager']//iframe[@class='demo-frame lazyloaded']")));
		
		ac.clickAndHold(driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"))).moveToElement(driver.findElement(By.xpath("//div[@id='trash']"))).release().build().perform();
		

	}

}
