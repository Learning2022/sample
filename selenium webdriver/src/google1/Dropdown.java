package google1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\srihari\\eclipse-workspace\\Automation\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Select s = new Select(driver.findElement(By.id("month")));
		s.selectByIndex(4);
		s.selectByValue("6");
		Select d = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		d.selectByValue("10");
		Select y = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		y.selectByVisibleText("1997");
		
	}
}
		
		
		
		//driver.close();
	

	
		
	


