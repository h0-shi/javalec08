import java.util.Scanner;

public class BreakContinueEx {

	public static void main(String[] args) {
		
		byte b = (byte)128;
		System.out.println(b);
		System.out.println(~b);
		
		byte c = 1;
		System.out.println((byte)(c<<7));
		System.out.println(~(c<<7));
			
		byte d = -1;	//1111 1111
		System.out.println((byte)(d >>> 1)); 				//0111	1111
		
		
		for(int i = 0; i<10; i++) {
			
			if(i==5) {
				break;								// break구문으로 블록을 탈출 할 수 있다. (1)
			}
		System.out.println(i);
	}												//여기로 탈출함. (2)
		
		System.out.println("=========");		//  ===========================
		
		for(int i = 0; i<10; i++) {					// 건너 뛰고 이 부분으로 돌아옴 (3)
			
			if(i==5) {
				continue;							// continue 구믄으로 하위 실행을 건너 뛰고 다시 조건으로 간다. (1)
			}
		System.out.println(i);						// i == 5 일 때, 이 부분 건너 뜀 (2)
	}												
		
		System.out.println("=========");		//	===========================
		
//		int command = 0;
//		
//		for(;;) {		//무한루프
//			System.out.print("숫자를 입력하세요(프로그램 종료는 -) :");
//			Scanner in = new Scanner(System.in);
//			command = in.nextInt();
//
//			if(command < 0 )	{
//				break;	//반복문을 끝내겠다.1
//			}		
//			
//			System.out.println("입력값은 "+command+"입니다.");
//			
//		} // for 루프물 끝
//		System.out.println("프로그램 종료");		// 커서는 여기로옴
//		
		
		}
	}	

