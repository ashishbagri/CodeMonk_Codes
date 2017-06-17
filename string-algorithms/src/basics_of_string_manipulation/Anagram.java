package basics_of_string_manipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();

		while (tests-- > 0) {
			int Rcount = Integer.parseInt(sc.next());
			int Kcount = Integer.parseInt(sc.next());

			String str = sc.next();
			int rc = 0;
			int kc = 0;
			ArrayList<String> sub = findSubString(str);
			for(String s : sub){  
				if(Rcount==find(s,'R'))
					rc++;
				if(Kcount==find(s,'K'))
					kc++;
				
			}
			System.out.println(rc+" "+kc);
		}
	}

	private static int find(String string,char string2) {
		
		int sum =0;
		for(int i =0;i<string.length();i++){
			if(string2==string.charAt(i))
				sum++;
		}
		return sum;
	}

	private static ArrayList<String> findSubString(String str) {
		ArrayList<String> stlist = new ArrayList<String>();
		 for (int i=0; i <str.length(); i++)
		    {
		        // Pick ending point
		        for (int j=i; j<str.length(); j++)
		        {
		             stlist.add(str.substring(i, j+1));
		        }
		    }
		return stlist;
	}
}
