package chapter08;

public class ApplianceMain_05 {

	public static void main(String[] args) {
		
//		TV tv = new TV("삼성");
		Appliance tv = new TV("삼성"); //이것도 결과는 같음. 부모 클래스 표시
		Appliance washer = new Washer("LG");
		
		
		tv.turnOn();
		System.out.println();
		washer.turnOn();

		System.out.println("-----------------------------");
		
		Appliance[] list = new Appliance[3]; //참조 공간 확보
		list[0] = new Washer("LG");
		list[1] = new TV("SAMSUNG");
		list[2] = new Washer("DAEWOO");
		
		for(Appliance a:list) {
			a.turnOff();
		}
		
	}

}
