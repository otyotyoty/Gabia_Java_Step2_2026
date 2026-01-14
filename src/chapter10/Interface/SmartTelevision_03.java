package chapter10.Interface;

public class SmartTelevision_03 {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(10);
		tv.search("네이버");
		tv.turnOff();
		System.out.println();
		
		Remote rc = tv;
		rc.turnOn();
		rc.setVolume(-10);
//		rc.search("네이버");
		rc.turnOff();
		System.out.println();
		
		Searchable se = tv;
//		se.turnOn();
//		se.setVolume(-10);
		se.search("네이버");
//		se.turnOff();
		
	}
}
