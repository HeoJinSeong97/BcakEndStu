package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {
	
	
	
	
	
	public static void main(String[] args) {
		File f = new File("C:\\Users\\82109\\Desktop\\�����ڷ�\\input.txt");
		//��ο� �ش��ϴ� ������ ���ٸ� ���� ������ش�.
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("���ϻ����۾�//");
		}
		
		try {
			//������ �о���� ��Ʈ��
			FileInputStream fis = new FileInputStream(f);
			int data;
			while((data=fis.read()) != -1) {
				//������ ���� ã�� �޼ҵ� ã���� -1�� ��ȯ�� false�εȴ�.
				System.out.print((char)data);
			}
			System.out.println();
	
		} catch (FileNotFoundException e) {
			// �ش� ������ �������� �ʴ´ٸ� �߻��Ѵ�.
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			System.out.println("fis�Ϸ�");
		}
		
		try {
			String url = "C:\\\\Users\\\\82109\\\\Desktop\\\\�����ڷ�\\\\input2.txt";
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
