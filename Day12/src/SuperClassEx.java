
public class SuperClassEx {

	String className;
	public SuperClassEx() {
		System.out.println("SuperClassEx 생성");
		this.className = "아빠클래스입니다";
	}
	public void printClassName() {
		System.out.println(this.className);
	}
	
	public SuperClassEx(String className){
		System.out.println("s클래스 있자 있는 생성자 호출");
		this.className = className;
	}
	
}
