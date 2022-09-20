package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
		public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\matha\\eclipse-workspace\\Project7\\drive\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			boolean d =driver.findElement(By.xpath("//img[@class='gb_Ba gbii']")).isDisplayed();
			if (d==true) {
				System.out.println("google log is valid or not");
			}else {
				System.out.println("google log is not valid");
			}
}
}
