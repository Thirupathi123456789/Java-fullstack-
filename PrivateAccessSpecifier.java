package com.simplelearn.Ivc;

public class PrivateAccessSpecifier {

	private int a=23;
	
	public static void main(String[] args) {
		PrivateAccessSpecifier obj=new PrivateAccessSpecifier();
		System.out.print("value of a "+obj.a);
	}
}
