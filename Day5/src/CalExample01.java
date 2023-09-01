
public class CalExample01 {

	public static void main(String args[]) {
		
		//비트연산은 2진수 연산이다
		// true 1, false 0
		//&,|,^,~ (and, or ,xor ,not)
		
		int x = 10;
		int y = 7;
		System.out.println("10 = "+Integer.toBinaryString(x));
		System.out.println("7 = "+Integer.toBinaryString(y));
		
		//1. x&y
		System.out.println("x&y = "+ ( x & y ));
		
		//2. x|y
		System.out.println("x|y = "+( x | y));
		
		//3. x^y
		System.out.println("x ^ y = "+( x ^ y));
		
		//4. x~y
		System.out.println("~(x&y) = "+~( x & y ));
		
		System.out.println("\t");	

//		int x1 = 2 * 2 * 2 * 2 * 2;		//(2의 5승?)
		int x1 = -1;
		System.out.println("-1 : "+Integer.toBinaryString(x1));
		
		System.out.println("\t");	
	
		
		//<< Left Shift
		int r1 = x1 << 2;
		System.out.println("r1 : "+Integer.toBinaryString(r1));
		
		//>> right Shift
		byte r2 = -128;
		System.out.println("r2 : "+Integer.toBinaryString(r2));
		System.out.println("r2 : "+Integer.toBinaryString(r2 >>2));
		
		//byte에서 2진수로 가장 작은 값
		// 1000 0000 = -128
		//Byte에서 가장 큰 값
		// 0111 1111
		
		System.out.println("\t");	
	
		
		r2 = 127;
		System.out.println("r2 : "+Integer.toBinaryString(r2)+" \t= 0111 1111");
		System.out.println("r2 : "+Integer.toBinaryString(r2 >>2)+" \t= 0001 1111");
		
		System.out.println("\t");	
		
		r2 = -10;
		System.out.println(r2+" : "+Integer.toBinaryString(r2));
		System.out.println((r2>>>2)+" : "+Integer.toBinaryString(r2 >>>2)); // 00111111111111111111111111111101
		
//		x = 2;
//		x = x*2*2;
//		
//		y = 2;
//		y = y << 2;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		System.out.println("\t");	
		
		int z1  = 10;
		
		System.out.println("z1 : "+Integer.toBinaryString(z1));
		System.out.println("5 : "+Integer.toBinaryString(5));
		
		z1 &= 5; // z1 = z1&5
		System.out.println("z1 & 5 : "+Integer.toBinaryString(z1));
		System.out.println("z1 & 5 : "+z1);
		
		boolean b1 = true;
		b1 &= (z1>1 || z1 << 2 > 10);
		System.out.println(b1);
		
		//3항 연산자
		
		int grade = 6; 
		int age = 0;
	
		age = grade == 5? 12 : -1; // 변수 = 조건문? 값 1 : 값 2
		System.out.println("학년 : "+grade+" 나이 : "+age);
		
		age = age++ * 10;
		System.out.println(age);
		
		age = ++age * 10;
		System.out.println(age);
		
	}
	
}
