import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import members.User;

public class RefEx {

	public static void main(String[] args) throws Exception {
		
		Class c1 = Class.forName("members.User");
		
		System.out.println("===========생성자 목록=================");
		Constructor[] con = c1.getConstructors();
		for(Constructor v : con) {
			System.out.println(v);
		}
		System.out.println("==================속성=====================");
		Field[] fields = c1.getFields();
		for(Field v : fields) {
			System.out.println(v);
		}
		System.out.println("==============메소드=============");
		
		Method[] methods = c1.getDeclaredMethods();
		for(Method v : methods) {
			System.out.println(v);
		}
	
//		//객체생성
//		User a = new User();
		System.out.println("객체생성 -> printUserInfo()");
		Constructor constructor = c1.getConstructor(String.class, String.class, String.class);
		User user = (User)constructor.newInstance("이종석","lodossw","12345");
		user.printUserInfo();
//		
		System.out.println("Method 객체로 호출(invoke) -> printUserInfo()");
		Method printUserInfo = c1.getDeclaredMethod("printUserInfo",null);
		printUserInfo.invoke(user, null);
		
		System.out.println("Method 객체로 호출(invoke) -> printUserPassword()");
		Method haak = c1.getDeclaredMethod("printUserPassword",null);
		haak.setAccessible(true); //private 무력화
		haak.invoke(user, null);
		
	
	
	}
	
}
