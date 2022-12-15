package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		
		int pageMaxSize = driver.findElements(By.cssSelector("div#example_paginate>span>a")).size();
		System.out.println("Total no.of Pages : "+ pageMaxSize);
		
		for(int i=1;i<=pageMaxSize;i++)
		{
			String pageSelector = "div#example_paginate>span>a:nth-child("+i+")";
			driver.findElement(By.cssSelector(pageSelector)).click();
			
			List<WebElement> elementNames = driver.findElements(By.cssSelector("table#example>tbody>tr>td:nth-child(1)"));
			for(WebElement element :elementNames)
			{
				System.out.println(element.getText());
			}
		}
	}

}
