package google1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\srihari\\eclipse-workspace\\Automation\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("anitha.srpl@gmail.com");
	    //driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.name("pass")).sendKeys("hello");
		//driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
	   // System.out.println(driver.findElement(By.xpath("//*[@id=\'globalContainer\']/div[3]")).getText());
		
driver.findElement(By.cssSelector("input[type='email']")).sendKeys("my own css");
driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("hello");
driver.findElement(By.cssSelector("input[type='submit']")).click();
System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());//pop up text displayed in console
	}

}