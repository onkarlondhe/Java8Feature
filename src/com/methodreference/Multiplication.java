package com.methodreference;

public class Multiplication {

//	USING STATIC METHOD

	public static int mul(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math h = Multiplication::mul;
		System.out.println(h.add(10, 10));
		
	}

}
