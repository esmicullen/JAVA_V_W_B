package test.overload;

import java.util.Scanner;

public class RunMethodOverload {

	public static void main(String[] args) {
		MethodOverloadTest ov1 = new MethodOverloadTest();
		Scanner sc = new Scanner(System.in);
		
		int n1 , n2;
		System.out.print("정수 n1 입력 : ");
		n1 = sc.nextInt();
		System.out.print("정수 n2 입력 : ");
		n2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n" , n1 , n2 , ov1.calc(n1,n2) );
		
		double n3 , n4;
		System.out.print("실수 n3 입력 : ");
		n3 = sc.nextDouble();
		System.out.print("실수 n4 입력 : ");
		n4 = sc.nextDouble();
		
		
		System.out.printf("%.1f * %.1f = %.3f\n" , n3 , n4 , ov1.calc(n3,n4) );
		
		sc.close();
	}

}
