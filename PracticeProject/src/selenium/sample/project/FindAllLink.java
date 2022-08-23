package selenium.sample.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		//Chrome Driver Creation
		System.setProperty("webdriver.chrome.driver", "D:\\PersonalStudy\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://hcl.com/");
		Thread.sleep(3000);
		List <WebElement> allURLs = driver.findElements(By.xpath("//div[@class='social-contact']//a"));
		
		//Number of all links
		System.out.println("Number of Links are: " + allURLs.size());
		
		//Print all the URL's
		for(int i = 0; i<allURLs.size(); i++) {
			
			//To Print All URLs
			System.out.println(allURLs.get(i).getAttribute("href"));	
			
			String urlCompare=allURLs.get(i).getAttribute("href");
			int j=i+1;
			
			//To click on those URL
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='social-contact']//li["+j+"]/a")).click();
			
			/*
			if(urlCompare.equalsIgnoreCase(driver.getCurrentUrl())==true) {
				System.out.println(driver.getCurrentUrl());
				System.out.println("Pass");
			}else {
				System.out.println(driver.getCurrentUrl());
				System.out.println("Fail");
			}*/
			
			if(urlCompare.contentEquals("https://hcl.com/contact/")==true) {
				driver.navigate().back();
				Thread.sleep(5000);
			}
			
		}
		
		
	}

}
