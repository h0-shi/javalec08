package javalec.computer.videocard;

public class ModiEx {

	public static void main(String[] args) {
		
		GeForce video1 = new GeForce();
		video1.defaultPrintName();
		
		GeForce video2 = new GeForce();
		GeForce video3 = new GeForce("냥냥");
		
		System.out.println(video2.modelName);
		System.out.println(video3.modelName);
	
	}
	
}
