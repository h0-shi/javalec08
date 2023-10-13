import java.util.*;

class Student{
	String name;
	int grade;
	Student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	
	void introduceMySelf() {
		System.out.println(String.format("안녕, 내 이름은 %s, %d학년이야",name,grade));
	}
}

public class MapEx {

	public static void main(String[] args)	{
		
		Map map = new HashMap();
		map.put("name","박쇼"	);		//
		map.put("age", 30);			;
			
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
	
		List list = new ArrayList();
		for(int i=0; i<5; i++) {
			Map m = new HashMap();
			m.put("name","name :"+i	);
			m.put("age","age : "+i);
			m.put("home","home : "+ i);
			list.add(m);
		}
		
		System.out.println("====List<Map> 꺼내기===");
		System.out.println("Name\t\tAge\t\tHome");
		for(Object v : list) {
			Map rMap = (Map)v;
			System.out.println(String.format("%s \t %s \t %s \t",
					rMap.get("name"), 
					rMap.get("age"), 
					rMap.get("home") 
					) 
				);
		}
		
		List studentList = new ArrayList();
		for(int i = 0; i<5; i++) {
			studentList.add(new Student("이종석" +i,i));
		}
		
		for(Object v : studentList) {
			Student std = (Student)v;
			std.introduceMySelf(); 			
		}
	//List,Set,Map은 Object 타입의 데이터 저장 가능
		
//		List<Integer> param = List.of("1","2","a","3",4,5,6,"호");
		List<Integer> param = List.of(1,2,3,4,5,6,7);
		//	List param = List.of("1","2",4,5,6);
		int result = sum(param);
		System.out.println("result :" + result);
		
		Map<String,Student> map2 = new HashMap();
		map2.put("1", new Student("이종석",1));
		map2.put("2", new Student("이종석B",2));
		map2.put("3", new Student("이종석A",3));
		map2.get("1").introduceMySelf();
		
		Map map3 = new HashMap();
		map3.put("1", new Student("이종석",1));
		map3.put("2", new Student("이종석B",2));
		map3.put("3", new String("aaaa"));
		((Student)map3.get("1")).introduceMySelf();

	}
	public static int sum (List<Integer> list) {
		int result = 0;
		for(Integer v : list) {
			result += Integer.parseInt(v.toString());
		}
		return result;
	}

	
	
}
