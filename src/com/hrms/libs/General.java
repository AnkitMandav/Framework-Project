package com.hrms.libs;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class General extends Global {
	
	public void openapplicatiob() {
		System.setProperty("webdriver.gecko.driver","E:\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.navigate().to(url);
		
	}
	
	public void Closedapplication() {
		driver.close();
		System.out.println("driver closed succefully");
	}
	
	public void Login() {
		driver.findElement(By.name(un_name)).sendKeys(un);
		driver.findElement(By.name(pw_name)).sendKeys(ps);
		driver.findElement(By.name(Loginbtn_name)).click();
		System.out.println("Login Succeffully");
	}
	public void Logout() {
		driver.findElement(By.linkText(logout_lintxt)).click();
        System.out.println("Logout Successfully");
	}
	
	public void Enterframe() {
		driver.switchTo().frame(driver.findElement(By.id(frameent_id)));
		System.out.println("Enter into frame");
	}
	public void ExitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit Frame");
	}
	public void Addemplo() {
		driver.findElement(By.xpath(addbtn_xpath)).click();
		driver.findElement(By.name(firstname_name)).sendKeys(FN);
		driver.findElement(By.name(lastname_name)).sendKeys(LN);
		driver.findElement(By.xpath(savebtn_xpath)).click();
		System.out.println("Add employee Succeffull");
	}
	public void EditFuntionality() {
		driver.findElement(By.xpath(Editbtm_xpath)).click();
		driver.findElement(By.name(EditFN_name)).clear();
		driver.findElement(By.name(EditFN_name)).sendKeys(EditFN);
		driver.findElement(By.name(EditLN_Name)).clear();
		driver.findElement(By.name(EditLN_Name)).sendKeys(EditLN);
		driver.findElement(By.xpath(EditSave_xpath)).click();
	}

}


















