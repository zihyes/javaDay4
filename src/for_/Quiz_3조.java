package for_;

import java.util.Scanner;

public class Quiz_3조 {

	public static void main(String[] args) {
//		Q1) 두정수 A와 B를 입력받은 다음에 A+B를 출력하는 프로그램
//			입력
//			첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//			예시
//			2  	// 입력
//			15 16 	// 입력
//			31 	// 출력
//			21 45      //입력
//			66  	//출력
		
//		Scanner input = new Scanner(System.in);
//		int T, A = 0, B = 0;
//		System.out.print("테스트 케이스 개수 입력: ");
//		T = input.nextInt();
//		
//		for(int i = 0; i < T; i++) {
//			System.out.println("두 정수 입력(공백 구분): ");
//			A = input.nextInt();
//			B = input.nextInt();
//			System.out.println(A + B);
//		}
		
//		Q2) 현우네 반에는 N명의 학생이 있다. 처음에 N명이 줄을 서있었고 그 순서대로 1~N번까지의 번호표가 주어졌다.
//			이후에 밥을 먹고 와서 다시 줄을 서는데 번호표 순서대로 서지 않은 학생수가 몇 명인지를 출력하는 프로그램을 만드시오.
//			첫 번째 줄에 헌우네 반 학생의 수 N이 주어진다. (1 ≤ N ≤ 20,000) 두 번째 줄에 학생들의 번호가 현재 줄을 서있는 순서대로 주어진다. (1 ≤ 번호 ≤ N) 중복되는 번호는 없다.
//			
//			예시)
//			반 학생수를 입력하시오 : 5
//			학생들이 줄서있는 순서대로 번호표 번호를 쓰시오 : 5 4 3 2 1
//			순서대로 서지 않은 학생 수는 : 4
		
//		Scanner input = new Scanner(System.in);
//		int stu = 0; // 반 학생 수
//		System.out.print("반 학생 수를 입력하시오: ");
//		stu = input.nextInt();
//		
//		int num; // 처음 줄 섰을 때 받은 번호
//		int count = 0; // 순서대로 서지 않은 학생 수
//		
//		System.out.print("학생들이 줄 서 있는 순서대로 번호표 번호를 쓰시오: ");
//		for(int i = 1; i <= stu; i++) {
//			num = input.nextInt();
//			if(i != num) {
//				count ++;
//			}
//		}
//		System.out.println("순서대로 서지 않은 학생 수는 : " + count);
		
		
//		?Q3) 1번부터 5번 학생의 점수를 연속으로 받고,
//			65점 이상이면 합격, 65점 미만이면 불합격으로 처리해
//			전체학생의 합격,불합격 여부를 한번에 보여주세요.
//			
//			(단, 5번의 입력에는 모두 "점수를 입력해주세요"가 각각 떠야하고,
//			학생들의 합격여부는 5줄로 한번만 출력이 이뤄져야합니다.)
		
			Scanner input = new Scanner(System.in);
			int score, n1 = 0;
			String s1 = null, s2 = null, s3 = null, s4 = null, s5 = null;
			String n2 = null;
			for( ; n1 < 5; ) {
				System.out.print("학생들의 점수를 순서대로 입력해주세요 : ");
				score = input.nextInt();
				n1++;
				
				if(score >= 65) {
					n2 = "합격";
				}else {
					n2 = "불합격";
				}
				
				switch(n1) {
				case 1: 
					s1 = n1 + "번 학생은 " + n2 + "입니다.";
				case 2: 
					s2 = n1 + "번 학생은 " + n2 + "입니다.";
				case 3: 
					s3 = n1 + "번 학생은 " + n2 + "입니다.";
				case 4: 
					s4 = n1 + "번 학생은 " + n2 + "입니다.";
				case 5: 
					s5 = n1 + "번 학생은 " + n2 + "입니다.";
				}
			}
			System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5);
			
//			
//			for(int i = 1; i <= 5; i++) {
//				System.out.println("점수를 입력해주세요.");
//			}
//			int score, n1 = 0;
//			String s1=null, s2=null, s3=null, s4=null, s5=null, n2=null;
//			for( ; n1 < 5 ; ) {
//				System.out.println("학생들의 점수를 순서대로 입력해주세요 : ");
//				score = sc.nextInt();
//				n1 += 1;
//
//				if(score >= 65) {
//					n2 = "합격";
//				}else {
//					n2 = "불합격";
//				}
//
//				switch(n1) {
//				case 1 : s1 = n1+"번 학생은 "+n2+"입니다.";
//				case 2 : s2 = n1+"번 학생은 "+n2+"입니다.";
//				case 3 : s3 = n1+"번 학생은 "+n2+"입니다.";
//				case 4 : s4 = n1+"번 학생은 "+n2+"입니다.";
//				case 5 : s5 = n1+"번 학생은 "+n2+"입니다.";
//				}
//			}
//			
//			System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5);
//			
	}

}
