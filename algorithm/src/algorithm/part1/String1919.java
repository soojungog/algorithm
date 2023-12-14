package algorithm.part1;

import java.util.Scanner;

public class String1919 {

	public static char[] getAlphabetCount(String str) {
		char[] charArr = new char[26];
		for(int i=0; i<str.length(); i++) {
			charArr[str.charAt(i) - 'a']++;
		}
		
		return charArr;
	}
	
	
	// ½¼»ý´ÔÀÌ Ç¬ ¹®Á¦Ç®ÀÌ
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a_str = scan.nextLine();
		String b_str = scan.nextLine();
		
		char[] aCharArr = getAlphabetCount(a_str);
		char[] bCharArr = getAlphabetCount(b_str);
		
		int answer = 0;
		for(int i=0; i<aCharArr.length; i++) {
			answer += Math.abs(bCharArr[i] - aCharArr[i]);
		}
		
		System.out.println(answer);
	}
	
	// ½¼»ý´ÔÀÌ Ç¬ ¹®Á¦Ç®ÀÌ
	public static void main1(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a_str = scan.nextLine();
		String b_str = scan.nextLine();
		
		char[] aCharArr = new char[26];
		char[] bCharArr = new char[26];
		for(int i=0; i<a_str.length(); i++) {
			aCharArr[a_str.charAt(i) - 'a']++;
		}
		for(int i=0; i<b_str.length(); i++) {
			bCharArr[b_str.charAt(i) - 'a']++;
		}
		
		int answer = 0;
		for(int i=0; i<aCharArr.length; i++) {
			if(aCharArr[i] > bCharArr[i]) {
				answer += aCharArr[i] - bCharArr[i];
			}else if(aCharArr[i] < bCharArr[i]) {
				answer += bCharArr[i] - aCharArr[i];
			}
		}
		System.out.println(answer);
	}
	
	// ³»°¡ Ç¬ ¹®Á¦Ç®ÀÌ
	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		int cnt = 0;
		char[] c1 = str2.toCharArray();
		for(int i=0; i<str1.length(); i++) {
			String temp_str = new String(c1);
			if(temp_str.indexOf(str1.charAt(i)) == -1) {
				cnt ++;
			}else {
				c1[temp_str.indexOf(str1.charAt(i))] = '?';
			}
		}
		

		char[] c2 = str1.toCharArray();
		for(int i=0; i<str2.length(); i++) {
			String temp_str = new String(c2);
			if(temp_str.indexOf(str2.charAt(i)) == -1) {
				cnt ++;
			}else {
				c2[temp_str.indexOf(str2.charAt(i))] = '?';
			}
		}
		System.out.println(cnt);
	}

}
