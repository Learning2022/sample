package google1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsautosuggestivedd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srihari\\eclipse-workspace\\Automation\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://apsrtconline.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Vij");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value";
		 String text= (String) js.executeScript(script);
		 System.out.println(text);
		/* int i=0;
		 while (!text.equalsIgnoreCase("VIJAYRAI"))
		 {
			 i++;
			 driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			if(i>5)
			{
				break;
			}
		 }
		 
		 if(i>5)
		 {
			 System.out.println("Element not found");
			 
		 }
		 else
		 {
			 System.out.println("Element  found");
		 }*/
		 

	}

}
