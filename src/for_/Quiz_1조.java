package for_;

import java.util.Scanner;

public class Quiz_1조 {

	public static void main(String[] args) {
		
		
//		Q1) 사용자로부터 정수를 입력받고, 1부터 입력받은 수 까지의 합을 출력하는 프로그램을 만드시오.
		
//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.print("정수 입력: ");
//		num = input.nextInt();
//		
//		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		Q2) 숫자 맞추기 게임
//			`출력 "숫자 맞추기 게임을 시작합니다."`		
//			`int computerNum 변수에 1~100 사이의 임의의 정수 저장`	
//			`힌트 출력 "짝수입니다 / 홀수입니다"`
//			`출력 "1~100 사이의 값을 입력하세요: "`
//			`int userNum 변수에 사용자 입력값 저장`
//			`비교 if userNum computerNum`
//			`userNum이 ComputerNum보다 크면`
//			`출력 "더 작은 수입니다."`
//			`userNum이 ComputerNum보다 작으면`
//			`출력 "더 큰 수입니다."`
//			`userNum이 ComputerNum과 같으면`
//			`출력 "맞췄습니다." 게임종료`
		
//		System.out.println("숫자 맞추기 게임을 시작합니다.");
//		
//		int computerNum = (int)(Math.random() * 100 + 1);
//		
//		if(computerNum % 2 == 0) {
//			System.out.println("힌트 : 짝수입니다.");
//		}else {
//			System.out.println("힌트 : 홀수입니다.");
//		}
//		
//		Scanner input = new Scanner(System.in);
//		
//		int userNum = 0;
//		int count = 0;
//		
//		while(true) {
//		System.out.print("1 ~ 100 사이의 값을 입력하세요: ");
//		userNum = input.nextInt();
//		count++;
//		
//		//비교
//		if(userNum > computerNum) {
//			System.out.println("더 작은 수 입니다.");
//		}else if(userNum < computerNum) {
//			System.out.println("더 큰 수 입니다.");
//		}else {
//			System.out.println(count + "번 만에 맞췄습니다.");
//			break;
//		}
//		}
		
		
//		?Q3) 난수 생성기
//			사용자가 원하는 범위를 받아서 그 범위 내에서 사용자가 원하는 만큼의 난수를 발생시키고 
//			사용 종료를 원하면 종료되도록 만드시오.
//			(난수 생성은 Math.random()함수를 사용하면 된다)
//			필요하다면 continue;도 사용
//			
//			ex)
//			1.난수 생성기 사용
//			2.사용 종료
//			원하시는 기능의 숫자를 입력해주세요:1
//			시행 횟수를 입력해주세요.20
//			범위의 최소를 입력해주세요.0
//			범위의 최대를 입력해주세요.10
//			5
//			4
//			8
//			2
//			7
//			0
//			2
//			4
//			7
//			9
//			9
//			0
//			5
//			5
//			4
//			5
//			3
//			3
//			5
//			5
//			계속진행 하시겠습니까?
//			1.예 2.아니요
//			
//			여기서 1을 고르면 처음부터 2를 고르면 종료
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.난수 생성기 사용\n2.사용종료\n원하시는 기능을 입력해주세요: ");
			int choice = input.nextInt();
			if(choice == 2) {
				break;
			}else if(choice == 1) {
				System.out.println("시행 횟수를 입력해주세요: ");
				int cnt = input.nextInt();
				
				System.out.println("범위의 최소를 입력해 주세요: ");
				int min = input.nextInt();
				
				System.out.println("범위의 최대를 입력해 주세요: ");
				int max = input.nextInt();
				
				for(int i = 1; i <= cnt; i++) {
					int num = (int)((Math.random() * (max-min)) + min);
					System.out.println(i + " ,range("+ min + " ~ " + max + "):" + num);
				}
			}
		}
		
		
		
	}

}
