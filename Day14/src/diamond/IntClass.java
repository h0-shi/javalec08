package diamond;

public class IntClass implements IntA,IntB {

	@Override
	public void printName() {		//다이아몬드 상속에서는 A를 사용할거냐, B를 사용할거냐, 둘 다 사용할거냐, 둘다 안하고 새로 정의할거냐를 정해야 한다.
		// TODO Auto-generated method stub
//		IntA.super.printName();
//		IntB.super.printName();
		System.out.println("재정의");
	}

}
