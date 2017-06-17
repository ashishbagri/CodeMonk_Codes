package BasicsOFBitManipulations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ChuChu {

	public static void main(String args[]) throws NumberFormatException, IOException {
		ArrayList<String> a_list = new ArrayList<String>();
		String fillstr = "0";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nc = Integer.parseInt(br.readLine());
		String withncdigits = String.format("%0" + nc + "d", Integer.parseInt(fillstr));

		StringBuilder str = new StringBuilder(withncdigits);
		StringBuilder strMain = new StringBuilder(withncdigits);

		int a = nc;
		for (int i = 0; i < a; i++) {
			str.setCharAt(i, '1');

			String sub = str.substring(0, i + 1);

			for (int j = 0; j < a - i; j++) {

				String out = strMain.replace(j, sub.length() + j, sub).toString();

				a_list.add(out);
				strMain.replace(0, withncdigits.length(), withncdigits);

			}
			Collections.reverse(a_list);

			Iterator it = a_list.iterator();
			while (it.hasNext()) {
				System.out.print(Integer.parseInt((String) it.next(), 2) + " ");
			}
			a_list = new ArrayList<>();

		}

	}
}