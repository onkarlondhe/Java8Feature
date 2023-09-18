package com.cloning;

public class MyDate implements Cloneable{

	int dd;
	int mm;
	int yy;
	
	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}


	public static void main(String args[]) {
		
		MyDate m1 = new MyDate(22,8,2000);
		try {
			MyDate m2 = (MyDate) m1.clone();
			System.out.println(m2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}	
