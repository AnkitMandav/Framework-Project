package com.hrms.libs;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	public String un = "admin";
	public String ps = "admin";
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String FN = "saurav";
	public String LN = "Khobr";
	public String EditFN = "Bari";
	public String EditLN = "Cobra";
	
	public String un_name= "txtUserName";
	public String pw_name= "txtPassword";
	public String Loginbtn_name ="Submit";
	public String logout_lintxt = "Logout";
	public String frameent_id = "rightMenu";
	public String addbtn_xpath = "//input[@value='Add'][@type='button'][@class='plainbtn']";
	public String firstname_name = "txtEmpFirstName";
	public String lastname_name = "txtEmpLastName";
	public String savebtn_xpath = "//input[@id='btnEdit'][@title='Save']";
	public String Editbtm_xpath = "//input[@name='EditMain'][@value='Edit']";
	public String EditFN_name = "txtEmpFirstName";
	public String EditLN_Name = "txtEmpLastName";
	public String EditSave_xpath = "//input[@id='btnEditPers'][@class='savebutton']";
	

}
