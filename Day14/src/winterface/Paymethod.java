package winterface;

//접근제한자 interface 인터페이스 명
public interface Paymethod {
	
	public abstract void pay();
//	void payback();//추상메소드 -> 중간에 추가 된 경우 하위 클래스는 오류 -> payback() 구현 제약
	
	public default void payback() {	//하위 호완성 보장
	System.out.println("환불");	
	}
//	 void pay(); 	도 가능 -> 구현부가 없으니까.
//	void pay2() {
//		//구현부
//	}

}
