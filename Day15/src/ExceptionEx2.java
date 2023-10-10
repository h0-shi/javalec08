import java.util.Scanner;
import java.util.InputMismatchException;

class Student{
	
	String name;
	int grade;
	
	Student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [name : " + name
				+", grade : "+ grade + "]";
	}
}

public class ExceptionEx2 {
	
	static Student[] students = new Student[3]; // 학생명부
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int grade = 0;
		int studentIdx = 0; // 배열 인덱스
		
		while(true) {
		System.out.println("이름을 입력하세요 :");
		name = scanner.nextLine();
		
		try {
		System.out.println("학년을 입력하세요 :");
		grade =Integer.parseInt(scanner.nextLine());
		students[studentIdx++] = new Student(name, grade);	//ArrayIndexOutOfBoundsException 배열 길이 초과
		} catch(InputMismatchException ex) {
			System.out.println("학년은 숫자만 입력 가능");
			continue;
		} catch(ArrayIndexOutOfBoundsException ex) {		//ArrayIndexOutOfBoundsException 배열 길이 초과
			System.out.println("최대 3개까지 입력");
			break;
		}catch(Exception ex) {
			System.out.println("알 수 없는 오류 발생");
		}
		//if(studentIdx == 3) break;
		System.out.println((studentIdx) +"명의 학생이 저장되었습니다.");
		}
		
		for(Student std : students) {
			System.out.println(std);
		}
	}
}

