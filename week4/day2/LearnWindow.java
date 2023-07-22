package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/window.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //getWindowHandle
        String windowHandle=driver.getWindowHandle();
        System.out.println(windowHandle);
        //duplicate more than one window
        //click to get a new window
        driver.findElement(By.id("j_idt88:new")).click();
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
        //switch back to the window
        driver.switchTo().window(lstWindow.get(0));
        System.out.println(driver.getTitle());
        
        //close all open window
        driver.quit();
        
        
        
        
	}
	

}
