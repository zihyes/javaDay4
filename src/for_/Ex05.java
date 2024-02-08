package for_;

public class Ex05 {

	public static void main(String[] args) {
	
//		for( ; ; ) {
//			System.out.println("실행"); //무한 반복 => 값이나 조건이 존재하지 않으면 다음 진행으로 넘어감
			
		int i = 0;
		while(i < 5 ) {
			System.out.println( i );
			i++;
		}
		System.out.println("---------------");
		
		for(i = 0; i < 5; i++) {
			System.out.println( i );
		}
		System.out.println("---------------");
		
		i = 0;
		for( ; i < 5 ; ) {
			System.out.println("i : " + i);
			i++;
		}
		}
}
