package algorithm.part1;

import java.util.Scanner;

public class String2744 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if('A' <= c && c <= 'Z') {
				System.out.print((char) ('a' + c -'A'));
			}else {
				System.out.print((char) ('A' + c -'a'));
			}
		}

	}
	
	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		char[] char_arr = str.toCharArray();
		char[] char_arr2 = new char[str.length()];
		
		for(int i=0; i<char_arr.length; i++) {
			int char_i = (int) char_arr[i];
			if(char_i < 97) {
				char_arr2[i] = (char) (char_i + 32);
			}else {
				char_arr2[i] = (char) (char_i - 32);
			}
		}
		
		String str2 = new String(char_arr2);
		System.out.println(str2);

	}
}
