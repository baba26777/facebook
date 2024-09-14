package pages;

import org.openqa.selenium.By;

import utils.ElementUtils;

public class LoginPage {
	By txt_facebook = By.xpath("//img[@alt='Facebook']");
	
	
	public static void verifyLoginPage() throws Exception{
		if(ElementUtils.CheckForVisibility(txt_facebook)) {
			System.out.println("Pass:User in login page of Facebook");
		}
		else{
			System.out.println("Fail:User not in login page of Facebook");
			
		}
		
		
		
	}

}
