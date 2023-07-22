package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printTableValue {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// read the table
		WebElement table = driver.findElement(By.xpath("//div[contains(@class,'render')]/table"));
		// print the row count
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		System.out.println("Row Count:" + rowCount.size());
		// print the Column count
		List<WebElement> columnCount = table.findElements(By.tagName("td"));
		System.out.println("Column Count:" + columnCount.size());

		for (int i = 1; i <= rowCount.size() - 2; i++) {
			String text2 = driver
					.findElement(By.xpath("//div[contains(@class,'render')]/table//tr[" + i + "]/td[1]"))
					.getText();
			if (text2.equals("Absolute Usage")) {
				for (int j = 1; j <= columnCount.size() - 5; j++) {
					String text3 = driver.findElement(By.xpath("//div[contains(@class,'render')]/table//tr[" + i + "]/td[" + j + "]")).getText();
					System.out.println(text3);
				}
			}

		}

	}

}
