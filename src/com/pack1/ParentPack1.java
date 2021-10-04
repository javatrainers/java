package com.pack1;
public class ParentPack1 {
	public ParentPack1() {
		
	}
	
	// access privileges
	public int a; // visible to everyone
	int b;// visible in same package
	protected int c;// visible in same packge
	// & related class in other package
	private int d; // visible ONLY in same program
	private int ssn;
	public void method1() {
		System.out.println(d);
	}
}
