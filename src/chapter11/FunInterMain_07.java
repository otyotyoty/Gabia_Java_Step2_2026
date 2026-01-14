package chapter11;

public class FunInterMain_07 {
	
	public void test() {
		
		// functional interface
//		FunInter fi = new FunInter() 원래 이거지만 더 간단히 사용
		new FunInter() {
			
			@Override
			public void printData() {
				System.out.println("목요일!!");
				
			}
		}.printData();
	} //test

	public static void main(String[] args) {
		FunInterMain_07 funinter = new FunInterMain_07();
		funinter.test();

	}

}
