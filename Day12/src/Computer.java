import computer.persp.*;

public class Computer {
	
	public void videoCardSetUp(Radeon rd) {
		rd.showMonitor("print screen");
	}

	public void 범용비디오카드달기(VideoCard vd) {
		vd.showMonitor("print screen");
	}
	
	public static void main(String[] args) {
		
		Radeon rd = new Radeon();
		rd.showMonitor("화면출력하시죠");
		
		rd.showMonitor();
	
		VideoCard video = new Radeon();
		VideoCard video2 = new GeForce();
		
		video.showMonitor("이건 누구를 호출할까?");
		//1. 객체생성
		Computer com = new Computer();
		
		com.videoCardSetUp(new Radeon());
	
	}
	
}
