package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// to bring the focus of driver to the frame
		driver.switchTo().frame(0);// starting index is 0
		driver.findElement(By.id("Click")).click();
		
		//to come completely out of the frame(completely to the main content-web page)
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);//nested frame element
		//method 2-->frame(String idorname
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));// Or
		
		WebElement frameElement = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(frameElement);
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().parentFrame();//Parent frame
	}

}
