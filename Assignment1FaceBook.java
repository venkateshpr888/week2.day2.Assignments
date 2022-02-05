package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("venkatesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9650392127");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ravi@9650");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select day1 = new Select(day);
		day1.selectByVisibleText("9");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select month1 = new Select(month);
		month1.selectByIndex(9);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select year1 = new Select(year);
		year1.selectByValue("1993");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
	}

}
