package google1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\srihari\\eclipse-workspace\\selenium webdriver\\Resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("happy");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("abs");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		
        

}
	
}
