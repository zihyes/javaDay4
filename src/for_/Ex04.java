package for_;

public class Ex04 {

	public static void main(String[] args) {
		int i = 1;
		for( ; i < 10; i += 2) {// i = i +2, for문 괄호안에 식 안넣어도 됨. 세미콜론만 있으면 돼서 초기화 하는 식 for문 밖에 적어도 됨
			System.out.println( i );
		}
		System.out.println("----------------- i : " + i);
		
		for(i = 1; i <= 10; i ++) {
			System.out.print("i : " + i + " => ");
			if( i %2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
			System.out.println("+++++");
		}
	}

}
