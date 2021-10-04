package com.pack2;

import com.pack1.ParentPack1;

public class OtherPack2 {
	public void ocp1() {
		ParentPack1 pp1=new ParentPack1();
		System.out.println(pp1.a);
		System.out.println(pp1.b);
		System.out.println(pp1.c);
		System.out.println(pp1.d);
		pp1.method1();
	}
}
