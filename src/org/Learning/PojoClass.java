package org.Learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PojoClass {
   	private WebElement firstName;
	private WebElement lastName;
	private WebElement userEmail;
	private WebElement userNumber;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public WebElement getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(WebElement userEmail) {
		this.userEmail = userEmail;
	}
	public WebElement getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(WebElement userNumber) {
		this.userNumber = userNumber;
	}
	


}
