import java.util.Scanner;

class LoginException extends Exception {
	LoginException(String message){
		super(message);
	}
}

public class CsutomExceptionEx {
	
	public static void main(String[] args) { //throws LoginException{
		String dbId = "lodossw";
		String dbPwd = "12345";
		int try_cnt = 0;
		
		while(try_cnt < 3) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your ID :");
		String id = scanner.nextLine();			//-- 사용자 입력 대기
		System.out.println("Please input your Password :");	
		String password = scanner.nextLine();	// 사용자 입력 대기
		
		try {
		if(dbId.equals(id) && dbPwd.equals(password)) {
			System.out.println("로그인 성공");
			break;
		} else {
			throw new LoginException("아이디와 비밀번호를 확인해주세요");			
			}
		} catch(LoginException ex) {
			System.out.println(ex.getMessage());
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			}
		}
	}

}
