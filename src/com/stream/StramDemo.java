package com.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StramDemo {

	public static void main(String[] args) {
 
		Product p[] = new Product[10];
		p[0] = new Product(1,"Tv",35000);
		p[1] = new Product(2,"Table",2000);
		p[2] = new Product(3,"FaceWash",350);
		p[3] = new Product(4,"Watch",5000);
		p[4] = new Product(5,"Mobile",22000);
		p[5] = new Product(6,"Perfume",350);
		p[6] = new Product(7,"Bottle",30);
		p[7] = new Product(8,"Laptop",60000);
		p[8] = new Product(9,"Fan",4000);
		p[9] = new Product(10,"Refrigerator",40000);
		
		ArrayList<Product> al = new ArrayList<>(Arrays.asList(p));
		
		float totalCost = al.stream().map(e->e.productCost).reduce(0.0f,(sum,sal)->sum+sal);
		System.out.println("Total Cost Of Product is "+totalCost);
		
		List<Product> list = al.stream().filter(pro -> pro.productName.startsWith("Tv")).collect(Collectors.toList());
		System.out.println(list);
		
		al.stream().filter(p1->p1.productCost>50000).forEach(a->System.out.println(a));
  
	}

}
