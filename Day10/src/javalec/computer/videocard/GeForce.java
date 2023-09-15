package javalec.computer.videocard;

//접근제한자
//public -> protected -> default -> private
//접근을 제한하고자 하는 곳은 어디인가?
//클래스, 클래스 맴버듣 모두 접근제한자를 둘 수 있다.
//1. 클래스
//2. 속성(맴버변수)
//3. 메서드
//4. 생산자(메서드) <-- 붙을 수 있지만 주로 public


public class GeForce {

	public String modelName;
	private int price;
	
		public void showModel() {
			System.out.println("Radeon");
		}
		
		public void turnOnMonitor() {
			System.out.println("모니터 키라고~");
		}
		
		void defaultPrintName() {
			System.out.println("디폴트 메소드야");
		}
		
		public void protectedPrintName() {
			System.out.println("난 퍼블릭이야~");
		}

		public GeForce() {
			super();
//			modelName = "호";
//			price = 1000;
		}
		
		public GeForce(String model) {
			modelName = model;
		}
		
	}

