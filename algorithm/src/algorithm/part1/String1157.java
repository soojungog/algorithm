package algorithm.part1;

import java.util.Scanner;

public class String1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		
		char[] charArr = new char[26];
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a') charArr[ch - 'a']++;
			else charArr[ch - 'A']++;
		}
		
		int pre_maxIdx = 0;
		int maxIdx = 0;
		for(int i=0; i<charArr.length; i++) {
			if(charArr[maxIdx] <= charArr[i]) {
				pre_maxIdx = maxIdx;
				maxIdx = i;
			}
		}

		if(maxIdx!= pre_maxIdx && charArr[maxIdx] == charArr[pre_maxIdx]) System.out.println("?");
		else System.out.println((char) (maxIdx + 'A'));
	}

}
