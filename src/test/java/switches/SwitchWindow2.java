package switches;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow2 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		while(!wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='d-img image-media']/a/img[@alt='FD'])[2]"))).isDisplayed())
		{
			driver.findElement(By.xpath("(//button[@class='slick-next slick-arrow'])[1]")).click();
		}
		driver.findElement(By.xpath("(//div[@class='d-img image-media']/a/img[@alt='FD'])[2]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> nwinds = new ArrayList<String>(windows);
		
		for(String i:nwinds)
		{
			System.out.println(i);
		}
	}

}
