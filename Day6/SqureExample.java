
public class SqureExample {

	public static void main(String args[]) {
		
//		int a = 1;
//		for(int n=1; n<=9; n++) {
//			a = a * n;
//			System.out.println(a);
//			
//		}
		System.out.println("뀨단");	
			for(int y = 1; y < 10; y++) {										// x가 한번 돌 때,	
				for(int x = 1; x<10; x++) {
				System.out.print(x + "x" + y + ":" + (x*y)+ "\t");				// y는 9번 돌아간다.
					//println = print new line => 출력 후 엔터
			}
			System.out.print("\n");	// = System.out.println("");	
		}
			
			System.out.println("\n뀨단");							
				for(int x = 1; x<10; x++) {
					for(int y = 1; y < 10; y++) {								// x가 한번 돌 때,	
				System.out.print(y + "x" + x + ":" + (x*y)+ "\t");				// y는 9번 돌아간다.
					//println = print new line => 출력 후 엔터
			}
			System.out.print("\n");	// = System.out.println("");	
		}
		
	}
	
}