import java.util.*;

public class CollectionEx {

	public static void main(String[] args) {
		
		//1. List
		List list = new ArrayList();
		list.add(0);
		list.add(1);
		list.add(2); // ....
		list.add(0);
		System.out.println(list);
		
		list = Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		
		list = List.of(1,2,3,4,5,6);
		System.out.println(list);
		
		int[] t = {1,2,3,4,5};
		System.out.println(Arrays.asList(t));
		
		//전체출력
		System.out.println("전통 for문");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("향상된 for문");
		for( Object v : list) {
			System.out.println(v);
		}
		System.out.println("람다식");
		list.forEach( x-> System.out.println(x));
		list.forEach(System.out::println);
		
		//--List 줄이기 늘리기(배열을 방수가 정해지면 끝)
		System.out.println("List 길이로 놀기");
		List testList = new ArrayList();// List.of(1,2,3,1,1); //상수(불변객체)
		testList.add(0);
		testList.add(1);
		testList.add(2);
		testList.add(0);		
		System.out.println(testList);
		
		//길이 늘리기
		testList.add(10); //-> 1,2,3,1,1,10
		System.out.println(testList);
		testList.add(0,10); // 1,2,?,3,1,1,10
		System.out.println(testList);
		
		//길이 줄이기
		testList.remove(0); // 2,10,3,1,1,10
		System.out.println(testList);
		
		//2.Set
		System.out.println("Set 갖고 놀기");
		Set set = new HashSet();
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(0);
		System.out.println(set);
		
		//전체출력
//		System.out.println("전통 for문");
//		for(int i = 0; i<set.size(); i++) {
//			System.out.println(set.get);
//		}
		
		System.out.println("향상된 for문");
		for( Object v : set) {
			System.out.println(v);
		}
		System.out.println("람다식");
		list.forEach( x-> System.out.println(x));
		list.forEach(System.out::println);
		
		System.out.println("Set 길이 갖고 놀기");	
		//길이 늘리기
		set.add(10); //-> 1,2,3,1,1,10
		System.out.println(set);
		set.add(10); // 1,2,?,3,1,1,10
		System.out.println(set);
		
		//길이 줄이기
		set.remove(0); // 2,10,3,1,1,10
		System.out.println(set);
		
		//set은 index를 줄 수 없다(원하는 위치에 못넣는다.)
		
	}

}
