package day20;

import java.util.ArrayList;
import java.util.Arrays;
public class Test33 {
	public static void main(String[] args) {
		int stage = 5;
		int[] round = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] answer = {};
		for (int i = 1; i <= stage; i++) {
			int cnt=0;
			int wincnt=0;
			for (int j = 0; j < round.length; j++) {
				if (round[j] >= i) {
					cnt++;
					if (round[j] > i) {
						wincnt++;
					}
				}
				
			}
		}
		
		
		
	}
}
