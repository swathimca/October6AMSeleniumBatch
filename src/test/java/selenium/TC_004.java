package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		
		//sWebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		//loc.sendKeys("sony");
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.name("field-keywords")).clear();
		
		//driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("philips");
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("philips");
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
		
		//driver.navigate().refresh();
		
		//driver.findElement(By.linkText("Customer Service")).click();
		
		//driver.findElement(By.partialLinkText("Customer Serv")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			System.out.println(links.get(i).getText());
		}
	}

}
