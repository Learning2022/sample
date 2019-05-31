package google1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srihari\\eclipse-workspace\\Automation\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.emirates.com/us/english/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"panel0\"]/div/div/div/section/div[4]/div[1]/div[1]/div/div[1]")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"panel0\"]/div/div/div/section/div[4]/div[1]/div[1]/div/div[1]/div/div/div[2]/section[2]/ol/li[8]/div/div/p[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"panel0\"]/div/div/div/section/div[4]/div[1]/div[1]/div/div[2]")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"panel0\"]/div/div/div/section/div[4]/div[1]/div[1]/div/div[2]/div/div/div[2]/section/ol/li[12]/div/div/p[1]"))
				.click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"panel0\"]/div/div/div/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[2]/table/tbody/tr[3]/td[2]/a"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"panel0\"]/div/div/div/section/div[4]/div[1]/div[3]/eol-datefield/eol-calendar/div/div/div[3]/table/tbody/tr[2]/td[3]/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"panel0\"]/div/div/div/section/div[4]/div[2]/div[1]/div[1]")).click();

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//button[contains(@class,'increase')]")).click();
		}

		driver.findElement(By.xpath("//*[@id=\"panel0\"]/div/div/div/section/div[4]/div[2]/div[2]")).click();
		driver.findElement(
				By.xpath("//*[@id=\"panel0\"]/div/div/div/section/div[4]/div[2]/div[2]/div/div/div[2]/section/a[3]"))
				.click();

		driver.findElement(By.cssSelector("input[type='radio']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//WebDriverWait d = new WebDriverWait(driver,20);
		//d.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
		driver.findElement(By.id("btnLogin")).click();

	}
}
