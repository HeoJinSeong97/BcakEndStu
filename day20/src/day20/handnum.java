package day20;

public class handnum {
	public static void main(String[] args) {
		int s= 123;
		String str = ""+s;
		int n = 0;
		char x[] = new char[str.length()];
		for (int i = 0; i < x.length; i++) {
			x[i] = str.charAt(i);
		}
		for (int i = 0; i < str.length(); i++) {
			n += Character.getNumericValue(x[i]);
		}
		System.out.println(n);
		
	}
}