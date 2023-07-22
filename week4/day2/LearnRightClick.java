package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		//set the path and launch the browser
				ChromeDriver  driver=new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.leafground.com/menu.xhtml#");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        Actions builder=new Actions(driver);
		        builder.contextClick().perform();
		        WebElement clk=driver.findElement(By.xpath("(//div[@class='card']/h5"));
		        builder.contextClick(clk).perform();
	}

}
