// SubClassEx는 SuperClassEx를 상속받는 클래스이다.
//A가 B를 상속받는다 라는 의므는 A extends B 라고 한다.

public class SubClassEx extends SuperClassEx {
//SuvClassEx의 부모 Class는 SuperClassEx이다.
	String className;
	String smartPhone = "갤럭시";
	
//	public SubClassEx() {
//		System.out.println("SubClassEx 생성");
//	}
	
	public SubClassEx() {
		super("감자전도 좋아");
		System.out.println("SubcClassEx 생성");
	}
	
	public void printMySmartPhone(){
	
		System.out.println(smartPhone);
	
	}
	
	public void pirntMyClassName() {
		System.out.println("내꺼: "+this.className);
		System.out.println("아빠꺼 : "+super.className);
		Application01.className2="기타표";
	}
	
	
	
}
