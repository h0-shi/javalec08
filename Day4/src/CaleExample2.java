
public class CaleExample2 {

	public static void main(String args[]) {
		
		//1. AND 연산_ 양쪽 모두가 true면 true, 아니면 false
		System.out.println("true && ture = "+ (true&&true));
		
		
		int a = 10;
		int b = 20;
		
//		boolean result = a > 5 && b<21; // true
//		boolean result = a > 5 && b<21 && (a+10 < 0); // t , t , f -> false

//		boolean result = a > 5 || b < 21 ;
		
		
		//XOR 둘중 하나만 true 이면 true
//		boolean result = a > 5 ^ b < 21 ^ (a+10 < 0);
	
		// !) &&. &/ ||, | 차이
		int x = 100;
		int y = 110;
		boolean z = x > y && x++ == 101;	// (f,t)x가 y보다 크고, ++x가 101과 같은가
		// 첫번째 조건부터 f이기 때문에 그 이후의 것은 실행하지 않았다, 따라서 x는 100
//		boolean z = x > y & x++ == 101;가 된다면 첫번째 조건이 f라도 뒤의 값을 실행하기에 x는 101이 된다.

		
		z = x < y || ++x == 101;
		
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
//		System.out.println(result);
		
	}
	
}
