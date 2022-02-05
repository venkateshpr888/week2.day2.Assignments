package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_LearnListBoxes {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement state1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select select1 = new Select(state1);
		select1.selectByIndex(1);
		WebElement state2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select select2 = new Select(state2);
		select2.selectByVisibleText("Selenium");
		WebElement state3 = driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select select3 = new Select(state3);
		select3.selectByValue("1");
	     WebElement num = driver.findElement(By.xpath("//select[@class='dropdown']"));
	     Select select4 = new Select(num);
			System.out.println("NUMBER OF DROPDOWN OPTION Is = "+select2.getOptions().size());
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//option[text()='Selenium'])[6]")).click();
		
		
	}

}
