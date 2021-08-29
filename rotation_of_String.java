package strings_love_babbar;

import java.util.Scanner;

public class rotation_of_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		System.out.println(isRotation(s1,s2)?true:false);
	}
	static boolean isRotation(String s1, String s2) {
		return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
	}

}
