package google1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExercise {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\srihari\\eclipse-workspace\\Automation\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a")).click();
		System.out.println("Parent Title");
		System.out.println(driver.getTitle());
		Set <String> ids= driver.getWindowHandles();
        Iterator<String> it= ids.iterator();
        String Parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        System.out.println("After Switching to Child");
        System.out.println(driver.getTitle());
        driver.switchTo().window(Parentid);
        System.out.println("Switching back to Parent");
        System.out.println(driver.getTitle());
        
        
	}

}
