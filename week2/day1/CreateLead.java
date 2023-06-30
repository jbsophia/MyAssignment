package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// maximize the window
		driver.manage().window().maximize();
        //find the element enter the password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //find the element of password and enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// find element click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// get the title of current open page
		// String title=driver.getTitle();//Ctrl +2+l
		System.out.println(driver.getTitle());
		// find the element crm/sfa and click the element
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		// Click lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		// Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		// Enter the Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
		//Enter First name(Local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sophia");
		//Enter Department name(Local)
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		//Enter description field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		//email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jb.sophia@gmail.com");
		//Click create lead
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());

	}

}
