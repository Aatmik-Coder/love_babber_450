package strings_love_babbar;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		reverseString(s);
	}

	public static void reverseString(String str) {
		String[] ar = str.split(" ");
		for(int i = ar.length-1; i >= 0; i--)
		{
			System.out.print(ar[i] + " ");
		}
	}
}
