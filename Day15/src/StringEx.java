
public class StringEx {

	public static void main(String[] args) {
		
		String a = "이종석";
		a = a + "만세";
		
		//String interpolation (치환, 중간에 값 넣기)
		String val = "안녕. 내 이름은 %s. 나이는 %d 살이야.";
		val = String.format(val, "박쇼",10);
		
		System.out.println(val);
		
		//StringBuffer, StringBuilder
		//StringBuffer Thread-safe
		//StringBuilder Thread-unSafe
		
		String name = new String("이종석");
		
		StringBuffer nameBuff = new StringBuffer("이종석");
		StringBuilder nameBuild = new StringBuilder("이종석");
		
		name = name + "만세";
		nameBuff.append("만세");
		nameBuild.append("만세");
		
		System.out.println("String :" + name);
		System.out.println("StringBuff :" + nameBuff);
		System.out.println("StringBuild :" + nameBuild);
		
		//문자열이 많아질수록, 연산이 많아질수록 성능은 StringBuilder > StringBuffer >>>4차원의 벽 >>>> String
	}
	
}
