package com.avp;

public class main {
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println("added 2nd line in add");
	}
	public static void main(String[] args) {
		
		main m =new main();
		m.add(10, 20);
	}

}
