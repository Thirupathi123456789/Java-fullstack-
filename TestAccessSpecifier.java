package com.simplelearn.Ivc;

public class TestAccessSpecifier {
	
	public static void main(String[] args) {
		//default accessible in same package
		DefAccessSpecifier def= new DefAccessSpecifier();
		def.display();
		
		//access private variable to another class
		
		PrivateAccessSpecifier obj=new PrivateAccessSpecifier();
		//System.out.printIn("value of a "+obj.a);
		
		AccessSpecifier obj2= new AccessSpecifier();
		obj2.display();
	}
}
