import java.util.Arrays;

public class DeepCopyEx {

	public static void main(String[] args) {

		//Deep Copy(깊은 복사) ->
		//1. Heap 영역에서 실제 데이터를 복사(복제)
		//2. 새로 복제된 값의 주소값을 넣는다.(대상 변수에)
		
		int a[] = {1,2};
		int b[] = {3,4,5};	// 복제 할 놈
		int temp[] = new int[3];
		for(int i = 0; i < b.length; i++) {
			temp[i]=b[i];
		}
		
		System.out.println("a : " +Arrays.toString(a));
		System.out.println("b : " +Arrays.toString(b));
		a = temp;
		b[1] = - 10;
		System.out.println("a : " +Arrays.toString(a));
		System.out.println("b : " +Arrays.toString(b));
		System.out.println(System.identityHashCode(a));
		
		// 배열 복사에 관련되서는 함수(매쏘드)를 기본 제공한다.
		int aa[] = {1,2};
		int bb[] = {0,1,2,3};
		bb = aa;			// 샬로우카피 - 주소값이 같음
		
		System.out.println("aa(" + System.identityHashCode(aa) + ") = " + Arrays.toString(aa));
		System.out.println("bb(" + System.identityHashCode(bb) + ") = " + Arrays.toString(bb));
		
		bb = aa.clone();	// 딥카피	- 주소값이 다름
	
		System.out.println("aa(" + System.identityHashCode(aa) + ") = " + Arrays.toString(aa));
		System.out.println("bb(" + System.identityHashCode(bb) + ") = " + Arrays.toString(bb));
		
		
		int cc[] = {1,2};
		int dd[] = {1,2,3,4,5,6,7,8,9};
		int ee[] = Arrays.copyOfRange(dd, 2, 5);
		System.out.println(Arrays.toString(ee));
		//deep copy
	
		int aaa[] = {1,2,3};
		int bbb[] = {1,2,3};
		
		System.out.println(aa);
		
		
	}

}
