package com.methodreference;
@FunctionalInterface
public interface Math {

	public int add(int a,int b);
 
	public default void hii() {
		System.out.println("hii...");
	}
	
	public static void bye() {
		System.out.println("bye...");
	}
}
