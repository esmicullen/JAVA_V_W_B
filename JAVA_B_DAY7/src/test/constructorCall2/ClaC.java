package test.constructorCall2;

public class ClaC {
	
	public ClaC() {
		super();
		System.out.println("ClaC의 생성자 호출");
	}
	
	public ClaC(int n) {
		System.out.println("ClaC(int n)의 생성자 호출 : " + n);
	}
}
