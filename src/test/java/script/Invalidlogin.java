package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.Dashboard;
import page.Loginpage;

public class Invalidlogin extends BaseTest {
	
	@Test(priority=2)
	public void Invalidlogin()
	{
		///// enter invalid un
		Loginpage login = new Loginpage(driver);
		login.SetUsername("Admin");
		
		
		///enter invalid pw
		login.SetPassword("Admin123");
		
		///clicklogin
		login.ClickLogin();
		
		////verify homepage
		Dashboard dd = new Dashboard(driver);
		boolean result = dd.verifyDashboardisdisplayed(wait);
		
		
				
	}

}
