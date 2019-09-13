package dummy.project;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class AppTest extends PerformAction
{
	@BeforeTest
	public void launchApplication(){
		getDriverInstance();
		browseUrl("Test_url");
		
	}
    
	 @Test
	    public void SignOn()
	    {
	    	clickElement("SIGN-ON");
	    	provideInput("login_xpath");
	    	
	     }
	 
	 @Test
	    public void register()
	    {
	    	
	    	provideInput("userName");
	    	
	       
	    }
	 
	 @AfterTest
	 public void closeBrowser(){
		 driver.quit();
	 }
}
