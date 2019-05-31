package google1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regularexp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\srihari\\eclipse-workspace\\Automation\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		driver.findElement(By.cssSelector("a[target*=top]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'identifier')]")).sendKeys("regularexpression");
        driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
	}

}
