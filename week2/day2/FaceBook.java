package week2.day2;

import java. time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Stevyn");
		driver.findElement(By.name("lastname")).sendKeys("Joseph");
		driver.findElement(By.name("reg_email__")).sendKeys("971509507647");
		driver.findElement(By.id("password_step_input")).sendKeys("facebook");
		
		//Drop down list
		WebElement source = driver.findElement(By.id("day"));
		Select drop1=new Select(source);
		drop1.selectByVisibleText("21");
		
		WebElement source1 = driver.findElement(By.id("month"));
		Select drop11=new Select(source1);
		drop11.selectByVisibleText("Mar");
		

		WebElement source2 = driver.findElement(By.id("year"));
		Select drop12=new Select(source2);
		drop12.selectByVisibleText("1985");
		
		driver.findElement(By.name("sex")).click();
		
		
		//Option
		//WebElement tool = driver.findElement(By.className("day"));
		//Select options=new Select(tool);
		//options.selectByVisibleText("Female");
		
		
		
	}

}
