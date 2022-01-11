package Teat_arr1;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
	//성적을 저장할 수 있는 1차원 배열 및 객체 선언
		int[] scores = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i<scores.length; i++) {
			System.out.print((i+1)+"과목 성적 입력 : ");
			scores[i] = sc.nextInt();
			sum+=scores[i];
		}
		System.out.println("총 합계 : " + sum );
		double avg = (double)sum/scores.length;
		System.out.print("평균 : %.2f" + avg);
		//System.out.println("평균 : " + avg);
		sc.close();
	}

}
