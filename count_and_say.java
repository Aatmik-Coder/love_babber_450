package strings_love_babbar;

import java.util.*;

public class count_and_say {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String st = count_say(num);
		System.out.println(st);
	}
	
	static String count_say(int n) {
		if(n==1) 
		{
			return "1";
		}
		if(n == 2) {
			return "11";
		}
		String s = "11";
		for(int i = 3; i <= n; i++) 
		{
			int count = 1;
			String t = "";
			s = s + '&';
			for(int j = 1; j < s.length(); j++) {
				if(s.charAt(j) != s.charAt(j-1)) 
				{
					t = t + count + "";
					t = t + s.charAt(j-1);
					count = 1;
				}
				else
				{
					count++;
				}
			} 
			s = t;
		}
		return s;
	}

}
