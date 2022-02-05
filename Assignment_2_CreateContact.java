package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_2_CreateContact {
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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("venkatesh");
        driver.findElement(By.id("lastNameField")).sendKeys("Ravi");
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("venkatesh");
        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ravi");
        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Information Technology");
        driver.findElement(By.id("createContactForm_description")).sendKeys("--------------------------");
        driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("rvenkates.888@gmail.com");
        WebElement state = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select select = new Select(state);
		select.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.id("updateContactForm_description")).clear();
        driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("-----hi-----");
        driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
        Thread.sleep(2000);
        System.out.println("Title of this page is = "+driver.getTitle());
        driver.close();
   
        
        
		
	}

}
