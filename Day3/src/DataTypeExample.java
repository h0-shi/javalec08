
public class DataTypeExample {
	
	public static void main(String[] args) {
		
		//자바의 변수 데잍터타입은 크게 2가지
		//a) 기본타입  b)참조타입
		
		//작게 4가지가 있다
		//a) 정수   b)실수   c)논리 (기본타입 primitive type)
		//d) 참조
		
		//평수 이름;
		// 1바이트의 정수형, age를 선언해보자
		
		byte age; // 메모리에 1byte의 공간이 생기고 이름을 age로 한다.
		age = 10;
		//age = age+10; 이게 왜 에러일까
		//age는 1byte이다. age = age + 10에서 10은 byte일까 int일까? -> int로 인식
		//기본적으로 정수를 사용하면 int로 인식함.
		System.out.println(age);
		
//		long b = 100;
//		b = age + 100; // long(8 bytes) = age + 100(int 4bytes)
						// 에러 안남
		
		char charValue = 65;
		System.out.println("65 = " + charValue);
		
//		float a = 1.1f;
		
		double a2 = 10.0; // 소숫점(실수)는 기본형이 double이기 때문에 f와 같은 명시할 필요 없다.
		
		
		boolean isName = true; // or false
		
		char a = 'A';
		
		System.out.println("a:"+a);
		
		int b = a;
		System.out.println("b:"+b);
		
		int adress1 = 100;
		adress1 = 200;
		
		final int aderss2 = 100;
//		adress2 = 10;   -> 상수 값은 변경 불가하니 에러남
		
	}
	

}

