package com.methodreference;

public class Division {

//	USING CONSTRUCTOR 

	public Division(int a, int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Helloo h = Division::new;
		 h.hello(10,5);
		
	}

}
