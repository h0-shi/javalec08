class Math01{
	int divide(int x, int y) throws ArithmeticException,Exception {
		
		if(y == 0) throw new ArithmeticException("0으로는 못나눠");
		return x/y; 	// if y = 0, Exception
	}
}

public class ExceptionEx03 {
	
	public static void main(String[] args) {
		Math01 m = new Math01();
		int b = 0;
		try {
			b = m.divide(10,0);
		} catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		System.out.println(b);		
	}

}
