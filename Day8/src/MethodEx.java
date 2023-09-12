	//메쏘드는 크게 두가지 타입이 있다.
	// 1. 인자
	//	- 인자가 없는 메쏘드
	//	- 인자가 있는 메쏘드
	// 2. 값 돌려주기(return)
	//	- 값을 돋려주는 메쏘드
	//	- 값을 돌려주지 않는 메쏘드
	// 2의 2승으로 메쏘드는 총 4가지가 있다.

public class MethodEx {

	//1. 리턴값이 없고, 인자도 없는 메쏘드 호출
	static void printName() {
		System.out.println("나의 이름은?");
			}
	
	//2. 리턴값이 없고, 인자는 있는 메쏘드 호출
	static void printUrName(String urName, int urAge) {
		System.out.println("너의 이름은? "+urName+"("+urAge+")");	
	}	
	
	//3. 리턴은 있고, 인자는 없는 메쏘드 <- 값을 돌려주는데, 돌려주는 값의 데이터타입을 정해줘야 함,
	// 아래의 경우는 String타입의 값을 돌려준다.
	static String returnName(){
		return "이종석";
		}
	
	//4. 리턴값도 있고, 인자도 있는 메쏘드 호출
	//메쏘드 명은 add, 인자는 x,y(int), 그리고 결과는 x+y의 결과값을 돌려주세요.
	//인수의 데이터타입이 int, 리턴받는 메쏘드의 데이터타입이 int.
	static int add(int x, int y) {
		return x+y;
			}
	
	
	public static void main(String[] args) {
		// 메쏘드 이름 	: main
		// 인자 (매개변수)	: String[] args 배열
		// 돌려주는 값(return)의 데이터 타입은 void(아무것도 돌려주지 않는다.)
		// int a = 0;
		// a = a + 1;
		
		//1. 리턴타입이 없고, 인자도 없는 메쏘드
		printName();
		printName();
		printName();
	
		//2. 리턴타입이 없고, 인자는 있는 메쏘드
		printUrName("이종석",20);	//메쏘드에 인자가 2개라, 인자를 넣어줌
		printUrName("박은진",21);
		
		//3. 리턴은 있고, 인자는 없는 메쏘드
		String name = returnName();		// 값을 return받을 특정 공간이 필요함
		System.out.println(name);
		String name2 = returnName();
		System.out.println(name2);

		//4. 리턴값도 있고, 인자도 있는 메쏘드 호출
		int result = add(1,100);
		System.out.println(result);
		System.out.println(add(111,-10));
	
	}
	
}
