package chapter12.string;

public class StringObjectMain_02 {

	public static void main(String[] args) {
		
		StringObject v1 = new StringObject();
		v1.setValue(v1);
		
		System.out.println(v1.getValue());

		// AutoBoxing. 아래 코드와 수행하는게 같음
		// Integer v2 = new Integer(100);
		StringObject v2 = new StringObject();
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		
		int i = (int)v2.getValue(); //unBoxing
		System.out.println(i+2);
		
	}
}
