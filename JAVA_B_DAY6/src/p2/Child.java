package p2;

import p1.parent;

public class Child extends parent {
	public void testProtected () {
		num1 = 100;
		System.out.println("Parent의 protected field num1 : " + num1);
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.testProtected();
	}
}
