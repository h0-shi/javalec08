
// 접근제한자 class 클래스명 {
// 클래스 정의부
	//...1.필드(속성) - 사물이 가지는 데이터(값)
	//...2.생성자()
	//...3.매서드()-행귀 기능
// }	

public class CalClassEx {
	
	//--필드(속성) = 클래스 변수
	//접근제한자 데이터타입 변수/상수명
	public int x;
	int y;
	
	//접근제한자 static or blank 리턴타입 메서드명 (매개변수){
		// ...메서드 정의부
	//}
	String name = "CalClassEx 입니다.";
	
	int add(int x, int y) {
		return x+y;
	}
	
	int minus(int x, int y) {
		return x-y;
	}
	
	float 원주율(int x) {
		return x * x * 3.14f;
	}
	
	public void printMyName() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		
	}
	
}
