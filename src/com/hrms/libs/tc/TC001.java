package com.hrms.libs.tc;

import com.hrms.libs.General;

public class TC001 {
	public static void main(String []args) {
		General obj= new General();
		obj.openapplicatiob();
		obj.Login();
	
		obj.Logout();
		obj.Closedapplication();
	}

}
