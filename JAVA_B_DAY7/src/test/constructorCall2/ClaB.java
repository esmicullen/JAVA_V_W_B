package test.constructorCall2;

public class ClaB extends ClaC {
	public ClaB() {
		super();
		System.out.println("ClaB의 생성자 호출");
	}
	public ClaB(int n) {
		super(n);
		System.out.println("ClaB(int n)의 생성자 호출 : " + n);
	}
}
