package com.hrms.libs.tc;

import com.hrms.libs.General;

public class TC002 {
	public static void main(String []args) {
		General obj1 = new General();
		obj1.openapplicatiob();
		obj1.Login();
		obj1.Enterframe();
		obj1.Addemplo();
		obj1.ExitFrame();
		obj1.Logout();
		obj1.Closedapplication();
	}

}
