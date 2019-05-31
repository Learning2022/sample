package google1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page1 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\srihari\\eclipse-workspace\\Automation\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
		//driver.close();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.get("http://www.amazon.com");
		driver.navigate().back();
		driver.close();
		

}


	}


