package chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStreamMain_06 {

	public static void main(String[] args) {

		String filePath = "IOstream.txt";
		String data = "Hello, this is a test of" + " FileInputStream and FileOutputStream";
		
		// FileOutputStream: 데이터 쓰기
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			// 문자열 데이터를 바이트 배열로 변환하여 파일에 저장
			fos.write(data.getBytes());
			System.out.println("내용이 파일에 저장되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 쓰는 도중 오류 발생: " + e.getMessage());
		}
		

		// FileInputStream: 데이터 읽기
		try (FileInputStream fis = new FileInputStream(filePath)) {

			int byteData;
			System.out.println("파일 내용");
			
			while((byteData=fis.read()) != -1) { // -1이면 다 읽었다는 뜻
				System.out.print((char)byteData);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 읽는 도중 오류 발생: " + e.getMessage());
		}

	}

}
