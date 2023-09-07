
public class Array2Example {

	public static void main(String[] args) {
		
		//1. 
		
		int matrix [] [];
		
		//2. 선언과 동시에 데이터 공간 만들기
		int matrix2 [][]= new int [2][4];	
		//두개의 동으로 이루어진 아파트 단지, 한 동은 방 4개로 이루어져 있다. = 총 8가구
		// 내 친구의 집은 1동 3호다. -> 컴퓨터로는 0번째동 2번째 호 이다. -> matirx2[0][2];
		
		//3. 배열과 동시에 초기화
		int matrix3 [][]= {
				{1,2,3,4},
				{5,6,7,8}
				};
		
	//	System.out.println(matrix3[1][3]);
		
		int idx1 = 0;
		int idx2 = 0;
		
		System.out.println(matrix3.length);
//		System.out.println(matrix3[0].length);
	
		for(idx1=0; idx1<matrix3.length; idx1++ ) {
			for(idx2=0; idx2 <matrix3[0].length ; idx2++) {
				System.out.println("matrix 3 ["+idx1+"], ["+idx2+"] : "+ matrix3[idx1][idx2]);
				} 
			}	
		
		System.out.println("");
		
		
		// 아래의 코드 해석하기
		for(int[] a : matrix3) {
			for(int b : a)
				System.out.println(b);
			}
			
			
		}
		
		
		}
