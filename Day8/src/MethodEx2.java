//인자를 제한 없이 받는 방법
//1. 인자를 배열로 받기
//	메서드명(데이터타입[] 변수명)

//2. 인자를 데이터타입 ... 변수명 으로 받기
// 	메서드명(데이터타입 ... 변수명)

	import java.util.Arrays;

public class MethodEx2 {


	
	static int getAddAll(int[] x) {		//인자는 int 배열 한개임
		int result = 0;
		for(int val : x) {
			result += val;
		}
	
	return result;
	}
	
	static void printAddAll(int ...x) {		//가변인자 _ 인자 갯수 변할 수 있음
		int result = 0;
		for(int val : x) {
			result += val;
			}
		System.out.println(result);	
	}
	
	//static void printAddAlllDoubleParam(int...x, String name) <- 이건 에러난다~~
	static void printAddAlllDoubleParam(String name, int...x) {		//첫번째 인자는 Stirng, 두번째 인자는 가변인자
		System.out.println("나는 "+name+"입니다.");					//하지만 가변인자가 첫번째에 들어가면 안된다.
		System.out.println("저한테 넘어온 int ... x는");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}
	// 메서드 선언
	// 메서드명 sliceArray
	// 인자는 int[],int from
	// 결과값 return int[]
	// 실행문 인자로 받은 int[]의 from 인덱스부터 끝까지의 배열값을 복제해서 리턴해라
	// ex) 인자 int[] = {1,2,3,4,5};
	// int[] b = sliceArray(a,1);
	//System.out.println(Arrays.toString(b)); --> {2,3,4,5,}
	
	static int[] sliceArray(int[] x, int from) {
		
		
	}
	
	
	//============================================================================================
	public static void main(String[] args) {	

		
		printAddAll(1,2,3,4);	// int ... x 방식 <- 인자가 여러개임

		int[] param = {1,2,3,4};
		int result = getAddAll(param);		// int[] x 방식 <- 인자는 하나임
						// 배열인자 : 인자의 수를 제한하지만, 그 값은 배열의 길이 제한이 없다.



System.out.println(result);		
		
		printAddAlllDoubleParam("이종석",1,2,3,4,5,6,10);
		
		int[] a = {1,2,3,4,5};
		int[] b = sliceArray(a,1);
		System.out.println();
		System.out.println(Arrays.toString(b));	 //[3,4,5] 출력되게
		
	}
}
