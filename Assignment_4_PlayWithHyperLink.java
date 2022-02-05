package week2.day2.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_PlayWithHyperLink {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//hyperlinks
				driver.get("http://leafground.com/pages/Link.html");
				driver.manage().window().maximize();
				WebElement getvalve1 = driver.findElement(By.xpath("(//a[@link='blue'])[2]"));
				System.out.println("link is going to take you to = "+getvalve1.getAttribute("href"));
				String attribute = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a")).getAttribute("href");
				String error="http://leafground.com/pages/error.html";
				if (error.equals(attribute)) {
					System.out.println("LINK is broken-throws error message");
					
				} else {			
					System.out.println("LINK is NOT broken");

				}
				
			driver.findElement(By.xpath("(//a[@link='blue'])[3]"));
				driver.navigate().to("http://leafground.com/home.html");
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				driver.navigate().back();
				


	}

}
