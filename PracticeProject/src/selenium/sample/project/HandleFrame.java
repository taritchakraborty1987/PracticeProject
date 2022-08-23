package selenium.sample.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		WebDriver driver;
		
		//Chrome Driver Creation
		System.setProperty("webdriver.chrome.driver", "D:\\PersonalStudy\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		
		//Need to write

	}

}
