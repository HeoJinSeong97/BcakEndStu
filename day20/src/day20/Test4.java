package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {
	
	
	
	
	
	public static void main(String[] args) {
		File f = new File("C:\\Users\\82109\\Desktop\\과제자료\\input.txt");
		//경로에 해당하는 파일이 없다면 새로 만들어준다.
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("파일생성작업//");
		}
		
		try {
			//파일을 읽어오는 스트림
			FileInputStream fis = new FileInputStream(f);
			int data;
			while((data=fis.read()) != -1) {
				//파일의 끝을 찾는 메소드 찾으면 -1을 반환해 false로된다.
				System.out.print((char)data);
			}
			System.out.println();
	
		} catch (FileNotFoundException e) {
			// 해당 파일이 존재하지 않는다면 발생한다.
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			System.out.println("fis완료");
		}
		
		try {
			String url = "C:\\\\Users\\\\82109\\\\Desktop\\\\과제자료\\\\input2.txt";
			FileOutputStream fos = new FileOutputStream(url);
			fos.write(65);
			fos.flush();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
