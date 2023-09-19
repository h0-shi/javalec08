package school;
	
	
public class ClassRoom {
	static int 학교누적인원 = 0;
	int 가용인원;
	int 현재인원;
	 
	public ClassRoom() {
		가용인원 = 30;
		현재인원 = 0;
	}
	
	public void 입학() {
		학교누적인원 ++;
		현재인원 ++;
		가용인원 --;
	}
	public void 퇴학() {	
		학교누적인원 --;
		가용인원 ++;
		현재인원 --;
	}
	public void printMe() {
		System.out.println("-------------------------------");
		System.out.println("가용인원 :"+가용인원);	// 각 객체에 존재하는 속성
		System.out.println("현재인원 :"+현재인원);	// 각 객체에 존재하는 속성(학급이 100개면 100개의 현재인원이 있음)
		System.out.println("학교누적인원 :"+학교누적인원);	//전체누적
		System.out.println("-------------------------------");
	}
	
	public static void printMe2() {
		System.out.println("=======static========");

		
	}
}
