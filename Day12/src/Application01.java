
public class Application01 {
	
	String className;
	static String className2;
	
	public void nonStaticMethod() {
		className = "논스테텍";
		className2 = "넣자고 값을";		
	}			//new 사용하요 객체 생성 후 맴버에 접근
				//static은 new필요 없어. 어차피 데이터영역에 이미 생성되어 있으니까.
	
	//외부 객체에서 Application01에 있는 className static 속석을 접근 할 때
	//대상클래스Name.맴버변서 = 값
	//대상클래스Name.method();
	
	public static void main(String[] args) {
		
		className2 = "내 이름은 className2";
		Application01 a01 = new Application01();
		a01.className = "해물파전";
		
		Application01.className2 = "하하";	//static 속성 접근법
		
		//1.SuperClassEx
		SuperClassEx ex1 = new SuperClassEx();
		ex1.printClassName();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		//2. SubVlassEx(extends SuperClassEx)
		SubClassEx ex2 = new SubClassEx();
//		ex2.className = "김치전에 막걸리";//아버지에게 상속받은 속성\멤버변수
		ex2.printClassName();	//아버지에게 상속받은 메소드
		ex2.printMySmartPhone();//자식한테만 있는 메서드
		ex2.pirntMyClassName();//자식의 className ㅊㄹ력
		}
}
