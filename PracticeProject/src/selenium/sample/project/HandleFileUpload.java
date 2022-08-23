package selenium.sample.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		//Chrome Driver Creation
		System.setProperty("webdriver.chrome.driver", "D:\\PersonalStudy\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		String userName="taritchakraborty1987@gmail.com";
		String password="9932874831";
		driver.findElement(By.id("usernameField")).sendKeys(new String[]{userName});
		driver.findElement(By.id("passwordField")).sendKeys(new String[]{password});
		driver.findElement(By.xpath("//button[@type='submit' and @data-ga-track='spa-event|login|login|Save' and contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='popout profile-section card']//div[@class='user-name roboto-bold-text']")).click();
		Thread.sleep(5000);
		
		//File Upload concept if tag type is input
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys(new String[]{"C:\\Users\\tarit\\OneDrive\\Desktop\\Resume Tarit Chakraborty - Technical Lead - QA - 2022.pdf"});
	}

}
