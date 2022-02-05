package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_EditField {
	public static void main(String[] args) {
		//edit field
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("http://leafground.com/pages/Edit.html");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rvenkates.888@gmail.com");
				driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Hi Testleaf",Keys.TAB);

				WebElement getvalve = driver.findElement(By.xpath("//input[@name='username']"));
				System.out.println("Default text is = "+getvalve.getAttribute("value"));
				driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
				boolean enabled = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
				if (false==enabled) {
					System.out.println("Edit field is Disabled");
					
				} else {
					System.out.println("Edit field is NOT Disabled");

				}

				
	}

}
