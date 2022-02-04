package com.simplelearn.Ivcanother;

import com.simplelearn.Ivc.AccessSpecifier;

public class ProtectedAccess extends AccessSpecifier{
	
	public static void main(String[] args) {
		
	ProtectedAccess	 p=new ProtectedAccess();
	p.display();
	
	//p.test();
	// child can access protected property but not private
	}
}
