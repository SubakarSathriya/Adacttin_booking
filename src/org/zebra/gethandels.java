package org.zebra;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gethandels {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subak\\eclipse-workspace\\SELENIUM\\Driver1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.reliancedigital.in/?gclid=CjwKCAjwwo-WBhAMEiwAV4dybSidwHves_2BU11jfmpBFHJFs1Amdz-IWxMBxhFkS6znFHLZQoZTlBoCv2kQAvD_BwE");
		driver.manage().window().maximize();
	  driver.switchTo().alert().dismiss();
}
}