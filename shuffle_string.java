package strings_love_babbar;

import java.util.Scanner;
import java.util.Stack;

public class shuffle_string {

	public static void main(String[] args) {
		Stack<Character> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String[] st_ar = {"xy21","yx2","y1x2"};
		String[] yes_no = new String[st_ar.length];
		String s1 = "xy";
		String s2 = "12";
		s1 = s1.concat(s2);
		
		for(int i = 0; i < st_ar.length; i++) {
			if(st_ar[i].length() != s1.length()) {
				yes_no[i] = "no";
			} else {
				boolean res = st_ar[i].contains(s1);
				yes_no[i] = "yes";
			}
		}
		
		for(String r : yes_no) {
			System.out.println(r);
		}
	}
}
