package selenium.sample.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserHtmlUnitDriver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		//Chrome Driver Creation
		System.setProperty("webdriver.chrome.driver", "D:\\PersonalStudy\\chromedriver\\chromedriver.exe");
		//driver=new ChromeDriver();
		
		driver= new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/nlogin/login");
		//Thread.sleep(2000);
		
		System.out.println("Before login title is : "+driver.getTitle());
		
		
		String userName="taritchakraborty1987@gmail.com";
		String password="9932874831";
		
		//Not working here
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit' and @data-ga-track='spa-event|login|login|Save' and contains(text(),'Login')]")).click();
		//Thread.sleep(2000);
		
		System.out.println("After login title is : "+driver.getTitle());

		
	}

}
