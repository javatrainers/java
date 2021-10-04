package com.pack2;

import com.pack1.ParentPack1;

public class ChildPack2  extends ParentPack1{
	public ChildPack2 () {
		super();
	}
	public void ocp2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		method1();
	}
}
