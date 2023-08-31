
public class CalExample {

	public static void main(String args[]) {
		
		//1. 대입
		int x = 10;
		int y = 2;
		
		//2. 산술연산
		//+,-,/,*,%
		int result = 0;
		
		result = x+y; //합연산
		System.out.println("x + y = "+result);
		
		result = x-y; //차연산
		System.out.println("x - y = "+result);
		
		result = x*y; //곱연산
		System.out.println("x * y = "+result);

		result = x/y; //나누기연산
		System.out.println("x / y = "+result);
		
		result = x%y; // 나머지연산
		System.out.println("x % y = "+result);
	
		int z1 = 10;
//		System.out.println(++z1); // = 11
		System.out.println(z1++); // = 10
		System.out.println(z1);
		
		
		
	}
	
}
