package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class buyTheValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://buythevalue.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'URBAN FIT X SMART WATCH')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id='com-hextom-smartpushmarketing-popup-close-popup-push']")).click();

		// Enter the PIN CODE
		driver.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("620001");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on check
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Click on Add to cart
		driver.findElement(By.xpath("(//button[@id='product-add-to-cart'][1])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on view cart
		driver.findElement(By.xpath("(//a[@href='/cart'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id='com-hextom-smartpushmarketing-popup-close-popup-push']")).click();
		// Click on check out
		driver.findElement(By.xpath("//input[@class='harman_btn5 btn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// switch the control to the alert
		Alert simple = driver.switchTo().alert();
        // getText from the alert box
		String text = simple.getText();
		System.out.println(text);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to accept the alert
		simple.accept();

	}

}

	
