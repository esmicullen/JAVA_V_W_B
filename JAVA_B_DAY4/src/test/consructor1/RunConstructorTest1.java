package test.consructor1;

public class RunConstructorTest1 {

	public static void main(String[] args) {
		ConstructorTest1 c1 = new ConstructorTest1(10);
		ConstructorTest1 c2 = new ConstructorTest1(77);
		
		System.out.printf("ct1이 팜조하는 객체의 필드 n = %d\n", c1.getN());
		System.out.printf("ct1이 팜조하는 객체의 필드 n = %d\n", c2.getN());
		
	}

}
