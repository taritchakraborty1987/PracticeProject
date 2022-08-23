package selenium.sample.project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver;
		
		//Chrome Driver Creation
		System.setProperty("webdriver.chrome.driver", "D:\\PersonalStudy\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
		Thread.sleep(5000);
		
		//How to deal with Alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		

	}

}
