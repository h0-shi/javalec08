
public class ExceptionEx01 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		int result = 0;
		
		try {
			result = x / y; // 예외가 발생 할 수 있는 구문
		} catch(NullPointerException ex) {		//ArithmeticException
			//ArithmeticException 이 발생하면, ex 변수로 자동 할당
			System.out.println("예외가 발생하였숩니다.");
			System.out.println(ex.getMessage());
		} catch(Exception ex) {
			System.out.println("알 수 없는 예외 발생");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("자원반납");
			result = -1;
		}
				
		System.out.println("result: "+ result);

	}

}
