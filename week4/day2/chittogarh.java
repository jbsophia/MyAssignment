package week4.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chittogarh {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'STOCK MARKET')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'NSE Bulk Deals')][1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> securityName = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered table')]//td/a"));
        List<String> securityNamelist=new ArrayList<String>();
        for(int i=0;i<securityName.size();i++) {
        	securityNamelist.add(securityName.get(i).getText());
        }
        System.out.println(securityNamelist);
        
        System.out.println();
        Set<String> set1=new LinkedHashSet<String>(securityNamelist);
        if(securityNamelist.size()==set1.size()) {
        	System.out.println("No Duplicates in the List");
        }
        else {
        	System.out.println("The list  contains Duplicate");
        }

	}

}