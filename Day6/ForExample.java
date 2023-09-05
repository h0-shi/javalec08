
public class ForExample {

	public static void main(String args[]) {
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) 	System.out.println(i);			
		} 			
		
		int a;
		for(a = 1; a <= 10; a++) {
			if(a % 2 == 0) 	System.out.println(a);			 // 이미 선언된 변수 사용 가능
		}
		
		int b = 1;
		for(; b<=1;b++) {
			if(b % 2 == 0) 	System.out.println(b);			// 이미 초기화된 변수일 시 초기화 안해도 가능
		}
		for(;;) {											// 조건식이 항상 true 이므로 무한루프에 빠짐
			
		}
		
	}
}
