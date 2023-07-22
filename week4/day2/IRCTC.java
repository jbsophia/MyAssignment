package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      //getWindowHandle
        String windowHandle=driver.getWindowHandle();
        System.out.println(windowHandle);
        driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
      

        Set<String>windowHandles=driver.getWindowHandles();
       
        for(String wind:windowHandles) {
        	System.out.println(wind);
        }
        System.out.println(driver.getTitle());
        
        //List
        List<String>lstWindow=new ArrayList<String>(windowHandles);
        //switch the control	
        driver.switchTo().window(lstWindow.get(1));
        System.out.println(driver.getTitle());
        
        //how to close the current option window
        driver.close();

	}

}
