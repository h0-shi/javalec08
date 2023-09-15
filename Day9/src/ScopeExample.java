
public class ScopeExample {

	static String name = "박쇼";	//클래스 전역변수
	
	public static void printName() {
		System.out.println(name);
	} //printName 정의부 끝
	
	public static void main(String[] args) {
		String name = "이종석";	// 지역변수
		System.out.println(name);
		printName();
		
	}//메인의 정의부 끝
	
}//클래스 정의부 끝
