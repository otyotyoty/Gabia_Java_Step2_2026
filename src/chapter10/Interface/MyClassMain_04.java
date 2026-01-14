package chapter10.Interface;

public class MyClassMain_04 {

	public static void main(String[] args) {

		MyClass mClass = new MyClass();
		
		X x1 = mClass;
		x1.X();
		
		Y y1 = mClass;
		y1.Y();
		
		MyInterface mInterface = mClass;
		mInterface.X();
		mInterface.Y();
		mInterface.myMethod();
		
		

	}

}
