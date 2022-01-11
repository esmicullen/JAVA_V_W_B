package test.score;

import java.util.Scanner;

public class DynamicArrayScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력해주세요 : ");
		int stu_num = sc.nextInt(); //학생 수 저장 변수
		int sub_num = 0;
		
		int[][] scores = new int[stu_num][]; //점수 저장
		String[] stu_name = new String[stu_num]; //이름 저장
		double[] sum = new double [stu_num]; //합계 저장
		double[] avg = new double [stu_num]; //평균 저장
		
		
		for (int i = 0; i<scores.length; i++) {
			System.out.print("학생 이름을 입력해주세요 : ");
			stu_name[i] = sc.next();
			System.out.print("과목 수를 입력해주세요 : ");
			sub_num = sc.nextInt();
			scores[i] = new int[sub_num];
			for (int j = 0; j<scores[i].length; j++) {
				System.out.print((j+1)+"번째 과목의 점수를 입력해주세요 : ");
				scores[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
			}
			avg[i] = (double)sum[i]/scores[i].length;
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(stu_name[i] + " ");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.print(sum[i] + " " + avg[i]);
			System.out.println();
		}
		
		
		
		sc.close();

	}

}
