package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	
	public static WebElement element;
	
	public static void checkForVisibility(By locator) {
		boolean res = false;
		try(){
			res = locateElement(locator).isDisplayed();
		}
		catch(Exception e) {
			System.out.println("Fail: element not visible" +locator);
		}
		
	}

}
