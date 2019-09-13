package dummy.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Lenovo
 *
 */
public class Locate extends App {
	
	WebElement webElement;

	WebElement locateElement(String locatorType, String locator) {
		
		switch (locatorType.toLowerCase()) {
		case "id":
			webElement= driver.findElement(By.id(locator));
			break;
		case "linktext":
			webElement= driver.findElement(By.linkText(locator));
			break;
		case "partiallinktext":
			webElement=driver.findElement(By.partialLinkText(locator));
			break;
		case "name":
			webElement=driver.findElement(By.name(locator));
			break;
		case "tagname":
			webElement=driver.findElement(By.tagName(locator));
			break;
		case "xpath":
			webElement=driver.findElement(By.xpath(locator));
			break;
		case "cssselector":
			webElement=driver.findElement(By.cssSelector(locator));
			break;
		}
		return webElement;
	}

}
