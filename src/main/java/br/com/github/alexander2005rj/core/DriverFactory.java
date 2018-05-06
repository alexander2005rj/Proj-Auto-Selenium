package br.com.github.alexander2005rj.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private WebDriver driver;
	
	private DriverFactory() {}
	
	public WebDriver getDriver() {
		if ( driver == null ) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public void destroyDriver() {
		if ( driver != null  ) {
			driver.quit();
			driver = null;
		}
	}
	
	
}
