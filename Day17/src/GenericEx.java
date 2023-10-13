import java.util.*;

class A{}

class GenericClass<T>{
	private T data;
	
	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}

	public void getClassinfo() {
		System.out.println(String.format("class info : %s", data.getClass()));
	}
	
}
public class GenericEx {
	
	public static void main(String[] args) {
		GenericClass <Integer>cls = new GenericClass<Integer>();
		GenericClass <String>cls2 = new GenericClass<String>();
		
		cls.setData(1);
		cls.getClassinfo();

		cls2.setData("이종석");
		cls2.getClassinfo();
		
		
//		Number a = new Integer(1);	//공변성
//		GenericClass b = (GenericClass)new A(); // 반공변셩
//		
//		A c= new GenericClass(); //
//		
//		List<Object> d = new List<Integer>();
//		
	
		
	}
	
	static int add(List< ? extends Number> list) {
		int result = 0;
		for(Number v : list) {
			result += Integer.parseInt(v.toString());
		}
		return result;
	}

}
