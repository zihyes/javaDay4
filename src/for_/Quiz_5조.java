package for_;

import java.util.Scanner;

public class Quiz_5조 {

	public static void main(String[] args) {
//		?Q1) )1부터 시작해 홀수의 합을 구하시오
//			단) 합이 10000을 넘지 않는 마지막 홀수값을 구하시오
//		int sum = 0;
//		for(int i = 1; sum < 10000 ; i++) {
//			if(i % 2 == 1) {
//				sum += i;
//			}
//			i--;
//			System.out.println("마지막에 더해진 홀수: " + i);
//			System.out.println("마지막에 더해진 합: " + sum);
//		}
//		
				
//		Q2) 100부터 500사이의 암스트롱수를 구하는 프로그램을 작성해보자.
//			(암스트롱 수 : 3자리 숫자로 구성되는 수로 각 자릿수에 있는 숫자의 세제곱의 합이 자신과 같은 수이다.) 
//			
//			[실행 예시]
//			153 370 371 407
//		int i, n1, n2, n3;
//		for (i = 100; i <= 500; i++) {
//			n1 = i / 100;
//			n2 = (i % 100) / 10;
//			n3 = i % 10;
//			if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == i) {
//				System.out.print(i + " ");
//			}
//		}
		
//		Q3) 반 별 국어 중간고사 성적 입력하는 프로그램을 작성하시오
//
//			각 반의 명수를 입력하고 해당 학생의 국어 성적을 입력하면 총 점과 총 평균이 출력됩니다. 
//			입력 성적이 0점 이하 거나 100점 이상일 시 "다시 입력해주세요" 라는 문구와 재입력이 되도록 합니다.
//			
//			예시)
//			총 학생 수 : 2
//			
//			1번 학생 국어 성적 : 80
//			2번 학생 국어 성적 : 600
//			2번 학생 다시 입력해주세요 : 60
//			
//			총 점 : 80
//			총 평균 : 40.0
		Scanner input = new Scanner(System.in);
		int cnt = 0, kor = 0, tot_kor = 0, j = 1;
		double avg_kor = 0;
		
		System.out.print("총 학생 수: ");
		cnt = input.nextInt();
		
		for(int i = 1; i <= cnt; i++) {
			System.out.print(j + "번 학생 국어 성적: ");
			kor = input.nextInt();
			
			if(kor <= 100 && kor > 0) {
				tot_kor += kor;
				j++;
			}else {
				System.out.print(j + "번 학생 다시 입력해주세요: ");
				kor = input.nextInt();
			}
		}
		avg_kor = tot_kor / (double)cnt;
		System.out.println("총 점 : " + tot_kor);
		System.out.println("총 평균 : " + avg_kor);
	}

}
