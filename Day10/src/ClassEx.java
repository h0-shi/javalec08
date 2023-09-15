
//기본적으로 자바라는 언어는 모드 클래스로 이루어져 있다.
// 최소 파일 1개당 하나(하나이상)의 클래스가 정의되어야 한다.
// 클래스 정의 문법은 아래와 같다.
//접근 제한자 class 클래스명 { 멤버 }
//멤버의 구성 요서
//1. 필드/멤버변수/속성 -> 클래스 전역변수/상수
//2. 메서드 -> 클래스의 기능/행위를 정의
//3. 생성자(매서드) -> 클래스의 객체를 생성하는 행위/기능을 정의
//!) 위으이 3개 맴버가 꼭 정의되어야 하는 것은 아니다.

class Nvidia{
	String modelName;	// 속성
	String modelNo;		// 속성
	void echoModel() {		//모델명을 말하는 놈(메소드)
		System.out.println("moddelName :"+modelName);
		System.out.println("moddelNo :"+modelNo);
	}
	
	void showMonitor() {	// 모니터에 그래픽을 표시하다(메소드)
		System.out.println("모니터야 나와라~");
		
		
	}
	
}

public class ClassEx {
	public static void main(String[] args) {
		
		//1. Nvidia 객체를 생성하자
		Nvidia video = new Nvidia();	//Nvidia(); <- 생성자 메서드
		//2. 객체의 메서드나 속성에 접근하고자 할 때 사용하는 연산자 = .
		video.modelName = "Geforce";
		video.modelNo = "3770";
		
		System.out.println(video.modelName);
		System.out.println(video.modelNo);
		
		//메서드 직접 호출
		video.echoModel();
		video.showMonitor();
		
	}

}
