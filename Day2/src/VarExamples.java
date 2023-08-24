
public class VarExamples {

	public static void main(String[] args) {
		
		//변수는 개발자가 쉽게 데이터에 접근하고 사용, 삭제(해제)
		//할 수 있도록 값을 넣을 수 있는 공간이다.
		int age; // 변수(공간)을 메모리에 할당(만듬) -> int형 변수(4byte) age를 선언한다.
		age = 10; // age라는 공간 10이라는 값을 넣는다.
		
		System.out.println("나이는 " + age + "살 입니다.");
		System.out.println("-------");
		
		age = -10;
		System.out.println("변경된 나이는 " + age + "살 입니다.");
		
		System.out.println("-------");
		int age2 = 20;
		
		System.out.println("나이는 " + age2 + "살 입니다.");
		
	}

}
