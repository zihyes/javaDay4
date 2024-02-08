package for_;

/*
F11 : 디버깅 시작 모드
F6 : 한줄씩 실행(메소드 건너뜀)
F7 : 한줄씩 실행(메소드로 이동)
F8 : 다음 브레이크 포인터로 이동
ctrl + F2 : 디버깅 종료
*/

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		//sum = sum + i; i++
		for(int i = 1; i <= 10000; i++) {// 무조건 세미콜론(:) 2개가 있어야 에러 발생하지 않음,식들은 없어도 되고 세미콜론이 중요
			System.out.println( i );
			sum = sum + i;
		}
		System.out.println("sum : " + sum);

	}

}
