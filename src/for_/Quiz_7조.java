package for_;

public class Quiz_7조 {

	public static void main(String[] args) {
//		Q1) 1부터 100까지의 짝수 합을 구하시오
//			1부터 100까지의 홀수 합을 구하시오
//		int evenSum = 0, oddSum = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				evenSum += i;
//			}else {
//				oddSum += i;
//			}
//		}
//		System.out.println("짝수 합: " + evenSum);
//		System.out.println("홀수 합: " + oddSum);
		
//		Q2) 구구단을 작성하세요
//		int i, j;
//		for(i = 1; i <= 9; i++) {
//			for(j = 1; j <= 9; j++) {
//				System.out.print(i + "*" + j + "=" + i * j +"\t");
//			}
//			System.out.println();
//		}
//		Q3) 별트리
//		[보기]
//		  *     중첩 for문을 사용하여 완성하시오
//	     ***
//	    *****
//	   *******
//	  ********* 
//		줄(i) 공백(j) 별
//		1     4      1 공백 먼저 => 5-i
//		2     3      3 * => 2*i-1
//		3     2      5
//		4     1      7
//		5     0      9
		int i, j, k;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}for(k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
