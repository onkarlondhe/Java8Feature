package com.function;
import java.util.function.*;
public class FunctionDemo{

	public static void main(String[] args) {
		Function<String,String> f =(str)->{return str.substring(6);};
		System.out.println(f.apply("Hello World"));
		
		Predicate<Integer> pd = (num)->{return num%2==0;};
		System.out.println(pd.test(9));
		
		Consumer<String> cs = (str)->{System.out.println(str.length()>5);};
		cs.accept("Onkar Londhe");
		
	}
}
