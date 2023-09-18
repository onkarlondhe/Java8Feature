package com.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello my name is Onkar";
		Optional<String> op = Optional.ofNullable(str);
		if(op.isPresent()) {
			System.out.println(str.substring(17));
		}else {
			System.out.println("String is empty");
		}
	}

}
