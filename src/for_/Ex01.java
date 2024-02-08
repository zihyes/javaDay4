package for_;

/*
 F11 : 디버깅 시작 모드
 F6 : 한줄씩 실행(메소드 건너뜀)
 F7 : 한줄씩 실행(메소드로 이동)
 F8 : 다음 브레이크 포인터로 이동
 ctrl + F2 : 디버깅 종료
 */

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 1;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i; i++;
		sum = sum + i;
		System.out.println(sum);
	}

}
