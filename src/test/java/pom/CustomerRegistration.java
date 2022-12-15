package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerRegistration 
{
	@FindBy(id="reg_email") WebElement userEmail;
	@FindBy(id="reg_password") WebElement userPassword;
	@FindBy(name="register") WebElement register;
	
	public CustomerRegistration(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerRegistration()
	{
		userEmail.sendKeys("qatest84734@gmail.com");
		userPassword.sendKeys("password");
		register.click();
	}

}
