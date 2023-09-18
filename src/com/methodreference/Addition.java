package com.methodreference;

public class Addition {

//	USING INSTANCE METHOD
	
	public int addition(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition c = new Addition();
		Math h = c::addition;
		System.out.println(h.add(10, 20));
	}

}
