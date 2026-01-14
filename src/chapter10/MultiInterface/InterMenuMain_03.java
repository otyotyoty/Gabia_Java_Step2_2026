package chapter10.MultiInterface;

public class InterMenuMain_03 implements Inter_Menu3 {
	
	public static void main(String[] args) {
		
		InterMenuMain_03 im = new InterMenuMain_03();
		
		Inter_Menu1 im1 = im;
		Inter_Menu2 im2 = im;
		Inter_Menu3 im3 = im;
		System.out.println("-----Inter_Menu1-----");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
		im.show();
		System.out.println("-----Inter_Menu2-----");
		System.out.println(im2.tangsuyuck());
		System.out.println("-----Inter_Menu3-----");
		System.out.println(im3.boggembab());
		im3.show();
		
	}

	@Override
	public String jajang() {
		return "하나죽으면 아는 짜장면";
	}

	@Override
	public String jjambbong() {
		return "해장하세요";
	}

	@Override
	public String tangsuyuck() {
		return "찹쌀 탕수육";
	}

	@Override
	public String boggembab() {
		return "후난식 볶음밥 강추!";
	}
}
