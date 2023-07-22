package week4.day2;

import java.util.List;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rowsAndColumns {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table = driver.findElement(By.xpath("//div[contains(@class,'render')]/table"));
		// print the row count
		List <WebElement> rowCount = table.findElements(By.tagName("tr"));
		System.out.println("Row Count:" + rowCount.size());
		// print the Column count
		List<WebElement> columnCount = table.findElements(By.tagName("td"));
		System.out.println("Column Count:" + columnCount.size());
		

	}
	}
