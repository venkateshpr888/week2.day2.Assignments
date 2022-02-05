package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_InteractWithImages {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		String img = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");
	    System.out.println(img); 
		
		String checkimg="http://leafground.com/images/abcd.jpg";
	     if (checkimg.equals(img)) {
	    	 System.out.println("image is broken");
			
		} else {
	    	 System.out.println("image is NOT broken");
		}
	
	     driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
	     
	}

}
