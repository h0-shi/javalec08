package computer.persp;

public class GeForce extends VideoCard {
	
	@Override
	public void showMonitor(String text) {
		this.directX지원();
		super.showMonitor("나는 Geforce "+text);
	}
	
	public void directX지원() {
		System.out.println("directX 지원한다~");
	}



}
