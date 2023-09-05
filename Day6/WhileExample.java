
public class WhileExample {
	//ex) 1~ 10까지 숫자중 짝수만 출력하라.
	public static void main(String args[]) {
		
		int a = 1;
		
		while (a <= 10) {
			if(a++ % 2 == 0) {
				System.out.println(a);
			}
		}
		
//		do { 
//			if(a % 2 == 0)System.out.println(a);
//		} while(a++ <= 10);
		
		
	}
	
}
