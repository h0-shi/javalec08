class Math{
	int add(int x, int y) {
		return x+y;
	}
	
	float add(float x, float y) {
		return x+y;
	}

	int add(int x) {
		return x+x;
	}
	
}// 인자의 데이터 타입이 다르거나, 인자의 수가 다르면 Overload가 가능


public class MethodOverloadEx {
	public static void main(String[] args) {
		Math math = new Math();
		System.out.println(math.add(10));
		System.out.println(math.add(10,20));
		System.out.println(math.add(10.0f,20.0f));
		
	}
	
	
}