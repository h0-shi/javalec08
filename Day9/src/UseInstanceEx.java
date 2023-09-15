
public class UseInstanceEx {

	public static void main(String[] args) {
		
		//원주율을 구하고 싶아
		//반지름은 나야
		CalClassEx cal = new CalClassEx();
		CalClassEx cal2 = new CalClassEx();
		
		cal.printMyName();
		float result = cal.원주율(4);
		System.out.println(result);

		cal2.printMyName();
		result = cal2.원주율(10);
		System.out.println(result);
		// 같은 행위를 하더라도 두 객체는 다른 객체다.
		System.out.println(cal == cal2);
		//like 배열
		
	}

}