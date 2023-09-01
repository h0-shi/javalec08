
public class ControlExample {

	public static void main(String args[]) {
		
		int a = 1;
		if(a<0) {
			System.out.println("a는 음수입니다.");
		} else {
			System.out.println("a는 양수입니다.");
		}
//	System.out.println("프로그램 종료");	
	
	int grade = 10; // 학년
	// 1-3 저학년, 4학년은 중간, 5-6학년은 고학년
//	if(grade <= 3 ) {
//		System.out.println("저학년");	}
//	if(grade == 4) {
//		System.out.println("중간");	}
//	if(grade >= 5) {
//		System.out.println("고학년");	}
//	그 외에는 다시 넣어주세요.
	
	if(grade >= 1 && grade <=3) {
		System.out.println("저학년");
	} else if(grade>=5 && grade <=6) {
		System.out.println("고학년");
	} else if(grade == 4){
		System.out.println("중간학년");
	} else {
		System.out.println("입력값은 1-6까지 입니다.");
	}
	
//	switch case문
	int x = 105;
	switch(x) {
	
		case 1 :
			System.out.println("x는 1입니다.");
			break;
			
		case 10 :
			System.out.println("x는 10입니다.");
			break;
			
		case 3 :
			System.out.println("x는 3입니다.");
			break;
						
		default :
			System.out.println("여기는 디폴트(else)입니다.");
	}
	
	if (x==1) {
		System.out.println("x는 1입니다.");
	} else if (x==10) {
		System.out.println("x는 10입니다.");	
	} else if (x==3) {
		System.out.println("x는 3입니다.");
	} else {
		System.out.println("여기는 디폴트(else)입니다.");
	}
	
	}
	
}
