package chapter08;

public class DmbCellPhoneMain_07 {

	public static void main(String[] args) {
		
		// 11 Java폰 블랙
		DmbCellPhone dmb = new DmbCellPhone(11, "Java폰", "Black");
		
		// 상속받은 필드
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);
		System.out.println("채널: " + dmb.channel);
		System.out.println();
		dmb.powerOn();
		dmb.bell();
		dmb.receiveVoice("안녕하세요");
		dmb.sendVoice("넵");
		dmb.receiveVoice("좋은하루 되세요");
		dmb.turnOnDmb();
		dmb.turnOffDmb();
		dmb.powerOff();
		
		
		// 전화통화 구현
		
	}

}
