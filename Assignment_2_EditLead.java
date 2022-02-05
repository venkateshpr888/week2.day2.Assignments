package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_2_EditLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10034'][1]")).click();
		String titleName="View Lead | opentaps CRM";
		System.out.println("Title of this page = "+driver.getTitle());
		if(titleName.equals(driver.getTitle()))
		{
			System.out.println(titleName+ " = is correct Title");
		}
		else {System.out.println("not correct title");
			
		}
			
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("LEAF TEST");
		driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		WebElement get = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String text1 = "LEAF TEST";
		System.out.println("changed company name = "+text1);
		if (get.getText().contains(text1)) {
			System.out.println("changes in company name is confirmed = "+text1);
			
		} else {System.out.println("changes not happened");

		}

	Thread.sleep(2000);
	driver.close();
	}

}
