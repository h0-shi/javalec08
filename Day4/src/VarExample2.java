
public class VarExample2 {

	public static void main(String[] args) {
		
		String name = "이종석"; // 참조데이터타입 (문자열 String)
		int age = 46; // 기본데이터타입 (정수 int)
		
		age = age-10; // age = 46-10 사용
		System.out.println("이름 : "+name+"\n나이 : "+age);
		final float PI = 3.14f;
		final String dontChange = "don't chcanges";
	
		System.out.println("제 이름은 이종석 \n\n\n입니다.");
		System.out.println("나이는	xx 입니다.");
		System.out.println("나이는\txx 입니다.");
		
		//제 이름은 "이종석"입니다.
		String message = "제 이름은 \"이종석\" 입니다";
		System.out.println(message);
		
		String message2 = "리터럴은 \\ 로 시작합니다. (보통은)";
		System.out.println(message2);
		
		System.out.println(dontChange);
	}

}
