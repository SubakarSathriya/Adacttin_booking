package org.zebra;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class stepjhf {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subak\\eclipse-workspace\\SELENIUM\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement path = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/ul"));
		int size = path.findElements(By.tagName("a")).size();
		System.out.println(size);
		
		for(int i=0; i<size ; i++) {
			String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
			path.findElements(By.tagName("a")).get(i).sendKeys(chord);
			
		}
		Set<String> wh= driver.getWindowHandles();
		Iterator<String> iterator = wh.iterator();
		while(iterator.hasNext()) {
			String title = driver.switchTo().window(iterator.next()).getTitle();
			System.out.println(title);
			driver.close();
		}
		

}
}