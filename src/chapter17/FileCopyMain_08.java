package chapter17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain_08 {

	public static void main(String[] args) {

		// 복사할 원본 파일
		String sourceFilePath = "source01.txt";
		// 버퍼 없이 복사할 파일
		String destFilePathWithoutBuffer = "dest_without_buffer.txt";
		// 버퍼를 사용하여 복사할 파일
		String destFilePathWithBuffer = "dest_with_buffer.txt";

		// 원본 파일 생성 코드(10MB의 데이터 생성)
		createTestFile(sourceFilePath, 1024 * 1024 * 10); // 10MB
		
		long startTime = System.nanoTime();
		copyWithoutBuffer(sourceFilePath, destFilePathWithoutBuffer);
		long endTime = System.nanoTime();
		long durationWithOutBuffer = endTime - startTime;
		System.out.println("버퍼 사용하지 않고 복사시 소요 시간: " + durationWithOutBuffer / 1_000_000 + "ms");
		
		startTime = System.nanoTime();
		copyWithBuffer(sourceFilePath, destFilePathWithBuffer);
		endTime = System.nanoTime();
		durationWithOutBuffer = endTime - startTime;
		System.out.println("버퍼 사용하여 복사시 소요 시간: " + durationWithOutBuffer / 1_000_000 + "ms");
		

	}
	
	private static void createTestFile(String filePath, int sizeInBytes) {
		
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
			
			byte[] data = new byte[sizeInBytes];
			bos.write(data);
			
		} catch (Exception e) {
			System.out.println("파일 생성 도중 오류 발생: " + e.getMessage());
		}
		
	}

	private static void copyWithoutBuffer(String source, String dest) {
		
		try (FileInputStream fis = new FileInputStream(source);
		         FileOutputStream fos = new FileOutputStream(dest)){
			
			int byteData;
			
			while((byteData = fis.read()) != -1) {
				fos.write(byteData);
			}
			System.out.println("파일이 성공적으로 저장 되었습니다.");
			
		} catch (Exception e) {
			System.out.println("파일 복사 도중 오류 발생: " + e.getMessage());
		}

	}
	private static void copyWithBuffer(String source, String dest) {

		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))){
			
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead=bis.read(buffer)) != -1) {
				//1024KB씩 0부터 시작해서 내용 복사하여 파일에 저장
				bos.write(buffer, 0, byteRead);
			}
			System.out.println("파일이 성공적으로 저장 되었습니다.");
			
		} catch (Exception e) {
			System.out.println("파일 복사 도중 오류 발생: " + e.getMessage());
		}
		
	}
}
