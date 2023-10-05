package winterface;

public class PaymentProcess {

	public void paygo(Paymethod pp) {
		pp.pay();
	}
	//payment는 인터페이스이기 때문에 new 사용 불가
	public static void main(String[] args) {
		PaymentProcess pp = new PaymentProcess();
			
		Paymethod card = new Card();
		Paymethod cash = new Cash();
		Bank bank = new Cash();
		
		pp.paygo(cash);
		System.out.println("==================");
		pp.paygo(card);
		System.out.println("==================");
		bank.저축();
		
		//Paymethod cash = new Cash();
		cash.pay(); 
//		cash.저축();//error
//		-----타입캐스팅---------------
		((Bank)cash).저축();
		
		//Bank bank =new Cash();
		bank.저축();
//		bank.pay();//error
		((Paymethod)bank).pay();
		
		Cash c = new Cash();
		c.저축();
		c.pay();
		
		cash.payback();		//cash는 payback() 지원 - 재정의
		card.payback();		//card는 payback() 미지원 - 재정의 안함
		
		//익명구현객체
		Paymethod pp2 = new Paymethod() {
			
			@Override
			public void pay() {
				System.out.println("익명구형객체");				
			}
		};
			pp2.pay();
			
			if(pp2 instanceof Paymethod) {
				System.out.println("pp2는 Paymethod의 자식이거나 본체");
			}
		
	}
}
