package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_WorkWithEditField {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//edit field
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rvenkates.888@gmail.com");
		WebElement getvalve = driver.findElement(By.xpath("//input[@name='username']"));
		System.out.println("Default text is = "+getvalve.getAttribute("value"));
		//hyperlinks
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		WebElement getvalve1 = driver.findElement(By.xpath("(//a[@link='blue'])[2]"));
		System.out.println("link is going to take you to = "+getvalve1.getAttribute("href"));
		String attribute = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a")).getAttribute("href");
		String error="http://leafground.com/pages/error.html";
		if (error.equals(attribute)) {
			System.out.println("LINK is broken-throws error message");
			
		} else {			System.out.println("LINK is broken");

		}

		
		

	
	}

}
