package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test21 {
	public static void main(String[] args) {
		String str = "C:\\\\Users\\\\82109\\\\Desktop\\\\�� ����\\\\iu\\\\";
//		���������
		try {
			FileInputStream fis = new FileInputStream(str + "LILAC.png");
			FileOutputStream fos = new FileOutputStream(str + "LILAC_���纻.png");

			byte[] b = new byte[1000];
			int len;
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
			fis.close();
			fos.flush();
			fos.close();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("�������� ����Ϸ�");
		}
	}
}
