class User{
	String name;
	int age;
	User(String name, int age){this.name=name; this.age=age;}
	
	boolean isSameUser(User user) {
		return this.name.equals(user.name);
	}
	
	boolean isSameUseer2(User user) {
		return this.name.equals(user.name)&&this.age == user.age;
	}
}

interface InterA{
	boolean isSameUser(User user1, User user2);
	boolean isSameUser2(User user1, User user2);
}

//람다 함수ㅇ형 인터페이스
@FunctionalInterface
interface InterB{
	boolean isSameUser(User user1,User user2);
	
	// (x,y) -> x.name.equals(y.name);
//	boolean isSameUser(User user1, User user2) {
//		return user1.name.equals(user2.name);
//	}
	
//	boolean isSameUser2(); // 람다 함수형 인터페이스의 추상메소드는 하나만 들어갈 수 있다. => 이름을 지정 할 수 없어서
	//구현부가 있는 default 매서드는 추가 가능
	default void printName() {
		System.out.println("호우");
	}
}


public class Lambda {
	
	public static void main(String[] args) {
		
		User user1 = new User("이종석", 10);
		User user2 = new User("이종석", 29);
		System.out.println("동명이인 ? "+user1.isSameUser(user2));
		System.out.println("동갑 ? "+ user1.isSameUseer2(user2));
		
		//익명개체
		InterA func = new InterA() {

			@Override
			public boolean isSameUser(User user1, User user2) {
				return user1.name.equals(user2.name);
			}

			@Override
			public boolean isSameUser2(User user1, User user2) {
				return user1.name.equals(user2.name)&&user1.age == user2.age;
			}
			
		} ;
		
		System.out.println("동명이인 ? "+func.isSameUser(user1,user2));
		System.out.println("동갑 ? "+func.isSameUser2(user1,user2));
	
		InterB a =  (x,y) -> x.name.equals(y.name);		
		InterB b = (t,v) -> t.name.equals(v.name)&&t.age == v.age;
		
		System.out.println("동명이인이냐고~ "+ a.isSameUser(user1, user2));
		System.out.println("동갑이냐고~ "+ b.isSameUser(user1, user2));
		
	}
	
//	boolean test(InterB interB,User user1, User user2) {
//		return interB.
	}

