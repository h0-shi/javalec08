import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
	
		// 1. 배열 선언 <- 배열공간(값이 들어갈 곳)을 만들지 않음
		int a[];
		int []b;		
		
		// 2. 선언과 동시에 초기화.
		int c[]= {1,2,3};	// 방 3개짜리 배열 변수
		
		//3. 선언 + 빈 공간 할당
		int d[] = new int[10];
		
		System.out.println("C 변수의 2번째 방의 값 : " + c[1]);
		c[0] = -10;
		System.out.println("C[0] = " + c[0]);

		int x[] = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(x));
		
		//x.length
		System.out.println(x.length);
		//for(배열의 시작 idx; 초기변수 < 배열길이; 초기변수++)
		for(int idx = 0; idx < x.length; idx++) {
			System.out.println("x["+idx+"] = "+x[idx]);
		}
		
		System.out.println("");	//	줄바꿈
		
		int idx2 = 0;
		while( idx2 <= x.length-1) {
			System.out.println("x["+idx2+"] = "+x[idx2]);
			idx2 ++;
		}
		// Array Index Out of Bound Exception 오류가 발동한다.
	//	System.out.println("x[8]" + x[8]);	//	문법적으로 오류는 없으니 컴파일러가 에러를 잡아내진 못함
		
		System.out.println("");	//	줄바꿈
		
		for(int w : x) {
			System.out.println("x["+w+"] : " + w);
		}
		
	}

}
