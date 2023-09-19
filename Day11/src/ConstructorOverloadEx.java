/*
	생성자(메소드)오버로딩
	메서드 오버로딩과 똑같음(인자의 수, 인자의 데이터타입)
*/

class Student {
	
	String name;	//학생이름
	int grade;		//학년

	public Student(){
		this("홍길동",1);	//내가 만든 생성자 중 String,int를 인자로 받는 생성자를 호출!
	}

//----인자 하나(String)을 갖는 생성자 Overloading-
	public Student(String stdName) {
		this(stdName,1);
	}
//----인자 둘(String,int)을 갖는 생성자 Overloading-	
	public Student(String name, int grade) {
		this.name = name;	//좌측의 name이 맴버변수, 우측의 name이 지역변수 -> 
		this.grade = grade;
	}
	
	public Student(int grade, String name) {
		this.grade = grade;
		this.name = name;
	}
	public void printMe() {
		System.out.println("내 이름은 "+name+" "+grade+"학년입니다.");
	}

}


public class ConstructorOverloadEx {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("코난");//인자하나
		Student std3 = new Student("이누야샤",2);
		Student std4 = new Student(7,"박쇼");
		
		std1.printMe();
		std2.printMe();
		std3.printMe();
		std4.printMe();
	
	}
	
	
}
