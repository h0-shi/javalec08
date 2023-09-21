package computer.persp;

public class Radeon extends VideoCard{

	@Override
	public void showMonitor(String text) {
		game3dAcc();
		System.out.println("왕멋진 "+text);
	}
	
	//Overloading
	public void showMonitor() {
		this.showMonitor("이건 자식 객체의 showMonitor");
		super.showMonitor("이건 부모 객체의 showmonitor");
//		System.out.println("showMonitor");
	}
	
	public void game3dAcc() {
		System.out.println("Redeon 3D 가속");
	}
	
}
