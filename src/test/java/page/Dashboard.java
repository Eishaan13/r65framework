package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Dashboard {
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	private WebElement Dashboard;
	
	public Dashboard(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyDashboardisdisplayed(WebDriverWait wait)
	{
		try
		{
		wait.until(ExpectedConditions.visibilityOf(Dashboard));
		Reporter.log("Homse page is displayed",true);
		return true;
		}
		catch (Exception e)
		{
			Reporter.log("Homse page is not displayed",true);
			return false;
		}
	}

}
