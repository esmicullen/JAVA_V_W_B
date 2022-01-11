package test.constructorCall2;

public class ClaA extends ClaB {
	public ClaA() {
		super();
		System.out.println("ClaA의 생성자 호출");
	}
	public ClaA(int n) {
		super(n);
		System.out.println("ClaA(int n)의 생성자 호출 : " + n);
	}
}
