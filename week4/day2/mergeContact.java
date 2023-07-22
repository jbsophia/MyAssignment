package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class mergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// driver.findElement(By.xpath("(//input[@id='username'])")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Contacts')])")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Merge Contacts')])")).click();
		// click on widget of from contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'][1])")).click();
		Thread.sleep(1000);

		// click on first resulting contact(link in second window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String strlnk = Keys.chord(Keys.CONTROL, Keys.RETURN);

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		// driver.findElement(By.xpath("(//a[contains(text(),'10088')])[1]")).sendKeys(strlnk);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).sendKeys(strlnk);
		driver.switchTo().window(tabs.get(0));

		// click on widget of to contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();

		// click on second resulting contact(link in third window)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String strlnk1 = Keys.chord(Keys.CONTROL, Keys.RETURN);
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		 driver.findElement(By.xpath("(//a[contains(text(),'10138')])[1]")).sendKeys(strlnk1);
		//driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).sendKeys(strlnk);
		driver.switchTo().window(tabs1.get(0));

		// click on merge button using xpath Locator
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//driver.findElement(By.xpath("//td[@id='ext-gen596']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// simple alert
		driver.findElement(By.xpath("(//body[contains(@class,'ext-safari')])")).click();

		// switch the control to the alert
		Alert simple = driver.switchTo().alert();

		// getText from the alert box
		String text = simple.getText();
		System.out.println(text);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to accept the alert
		simple.accept();

		// verify the title of the page
		// String actual=driver.findElement(By.id("result")).getText();
		// System.out.println(actual);

		Set<String> windowHandles = driver.getWindowHandles();
		for (String window : windowHandles) {
			System.out.println(window);
		}
		System.out.println(driver.getTitle());

	}


	}


