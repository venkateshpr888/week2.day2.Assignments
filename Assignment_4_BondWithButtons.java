package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_BondWithButtons {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("http://leafground.com/pages/Button.html");
				driver.manage().window().maximize();
				//buttons
				System.out.println("postion of the button X and Y = "+driver.findElement(By.id("position")).getLocation());
WebElement getvalve2 = driver.findElement(By.xpath("//button[text()='What color am I?']"));
				System.out.println("button Color is = "+getvalve2.getCssValue("background-color"));
				System.out.println("height of the button = "+driver.findElement(By.id("size")).getSize().getHeight());
				System.out.println("width of the button = "+driver.findElement(By.id("size")).getSize().getWidth());
	}

}
