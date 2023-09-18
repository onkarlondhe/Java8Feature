package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"India","China","Nepal","Japan","Shri-lanka"};
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList(str));
		
		Map<String, Integer> map=al.stream().collect(Collectors.toMap(Function.identity(),String::length));
		System.out.println(map);
	}

}
