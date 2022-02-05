package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_InteractWithCheckBoxes {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//checkboxes
			driver.get("http://leafground.com/pages/checkbox.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
			boolean selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
			if (true==(selected)) {
				System.out.println("Confirm Selenium is checked");
				} else 
				{			
				System.out.println("Confirm Selenium is NOT checked");
			}
			driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();

}}
