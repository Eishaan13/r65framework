package page;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage {
	
	@FindBy(name="username")
	 private WebElement unTB;
	@FindBy(name="password")
	private WebElement pwTB;
	
	@FindBy(xpath="//button[text()=' Login ']")
    private WebElement Loginbtw;	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void SetUsername(String un)
	{
		unTB.sendKeys(un);
	}
	public void SetPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void ClickLogin()
	{
		Loginbtw.click();
	}
	
	

}
