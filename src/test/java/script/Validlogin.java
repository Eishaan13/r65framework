package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.Dashboard;
import page.Loginpage;

public class Validlogin extends BaseTest
{
	@Test(priority=1,groups= {"smoke","regression"})
	public void testvalidlogin()
	{
		/// enter valid un
		Loginpage loginpage = new Loginpage(driver);
		loginpage.SetUsername("Admin");
		
		/// enter valid pw
		loginpage.SetPassword("admin123");
		/// click login
		loginpage.ClickLogin();
		///Homepage should be displayed
		Dashboard dd = new Dashboard(driver);
		boolean result = dd.verifyDashboardisdisplayed(wait);
		
		
	}

}
