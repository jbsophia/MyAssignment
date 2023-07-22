package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		//set the path and launch the browser
        ChromeDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
        //simple alert
        Alert simple = driver.switchTo().alert();//ctrl+2
        simple.accept();
        
        //getText
        String text = simple.getText();
        System.out.println(text);
        simple.accept();
        //confirm alert
        
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        
        Alert confirm = driver.switchTo().alert();
        System.out.println(confirm.getText());//pop up print the msg
        confirm.dismiss();
        //verify the alert
        String text2 = driver.findElement(By.id("result")).getText();
        System.out.println(text2);
        
        //prompt Dialog
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        //switch the control to the alert
        Alert prompt=driver.switchTo().alert();
        //pass the input data to the input box
        prompt.sendKeys("testleaf");
        //get the text from the pop up
        System.out.println(prompt.getText());
        //to accept the alert
        prompt.accept();
        //verify the alert
        String text3 = driver.findElement(By.id("confirm_result")).getText();
        System.out.println(text3);
         
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	