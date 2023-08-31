
public class CastingExample {

	public static void main(String args[]) {
		
		//1. 묵시적(자동)형변환
		byte a1 = 10; //1byte
		int b1 = a1; // byte < int 이르모 b1(int)에 a1(byte)을 넣을 수 있음

		//2. 명시적(강제) 형변환
//		a1 = b1; // int < byte 이르모 a1(byte)에 b1(int)을 넣을 수 있음
		a1 = (byte)b1; // b1을 byte라고 명시함
//		a1 = (byte)b1 + 20; // 20은 상수이므로 int로 인식 = byte에 int 못들어감-> 에러
		a1 = (byte)(b1+20); // 이게 된다? 왜?
		
		//3. 궁금하다
		int test1 = 128;
		byte bTest2 = (byte)test1; // -128로 출력됨
		
		System.out.println("int test1 : "+test1);
		System.out.println("byte bTest2 : "+bTest2);
		
	}
	
}
