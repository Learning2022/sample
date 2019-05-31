package google1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iebrowser {
	
	public void main (String args[]) {
		
		System.setProperty("webdriver.ie.driver" ,"C:\\Users\\srihari\\eclipse-workspace\\selenium webdriver\\Resources\\msedgedriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
	}

}
