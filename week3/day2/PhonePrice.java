package week3.day2;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhonePrice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//how many links
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		System.out.println(prices);
		
		//Declare a list 
				List<String> list = new ArrayList<String>();
				
				//to print all the mobilePrices
				for (WebElement each : prices) {
					String allPriceText = each.getText();//6,499
					list.add(allPriceText);
					//System.out.println(allPriceText);
				}
				
				
				System.out.println(list);
				Collections.sort(list);
				System.out.println(list);
				System.out.println("lowest price"+list.get(1));
				
	
				
		
		
		
		


	}

}
