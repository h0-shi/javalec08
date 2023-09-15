import javalec.computer.videocard.GeForce;
import javalec.computer.videocard.Radeon;

public class ComputerApp {

	public static void main(String[] args) {
		//다른 폴더에 있는 GeForce와 radeon 객체를 생성하고싶다. 우야?
		GeForce video1 = new GeForce();
		video1.turnOnMonitor();
//		video1.protectedPrintName();	
		Radeon video2 = new Radeon();
		video2.turnOnMonitor();
		
	
	}

}
