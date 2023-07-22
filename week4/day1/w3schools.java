package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schools {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("iframeResult");
		//driver.switchTo().defaultContent();
		
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        driver.switchTo().alert().accept();
        
        String text=driver.findElement(By.id("demo")).getText();
        System.out.println(text);
        
        //to take the snapshot of the web page
        
        File snapShot= driver.getScreenshotAs(OutputType.FILE);
        File location=new File("./snap/shot.png");//img or jpeg or png
        FileUtils.copyFile(snapShot,location);
        
	}

}
