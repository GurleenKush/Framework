package dummy.project;

import java.io.IOException;

public class PerformAction extends Locate{
	
	void provideInput(String element){
		
		try {
			String locatorType=Common.getValueFromProperty("SignOn", element);
			
			locateElement(locatorType,element).sendKeys("abc");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		
	}
	
	void clickElement(String element){
		try {
			String locatorType=Common.getValueFromProperty("SignOn", element);
			System.out.println(locatorType);
		
			locateElement(locatorType,element).click();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}
	
	

}
