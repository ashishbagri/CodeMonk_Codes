import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Little robot CJ-17 is exploring ancient ruins. He found a piece of paper with
 * a word written on it. Fortunately, people who used to live at this location
 * several thousand years ago used only two letters of modern English alphabet:
 * 'a' and 'b'. It's also known, that no ancient word contains two letters 'a'
 * in a row. CJ-17 has already recognized some of the word letters, the others
 * are still unknown.
 * 
 * CJ-17 wants to look up all valid words that could be written on this paper in
 * an ancient dictionary. He needs your help. Find him the word, which is the
 * first in alphabetical order and could be written on the paper.
 * 
 * Input format
 * 
 * The first line contains non-empty string s s consisting of 'a', 'b' and '?'
 * characters. Character '?' corresponds to unrecognized letter.
 * 
 * It's guaranteed, that there exists at least one ancient word, that could be
 * written on the paper.
 * 
 * Constraints
 * 
 * Length of s s is at most 50.
 * 
 * Output format
 * 
 * Output the first in alphabetical order word, that could be written on the
 * paper, found by CJ-17.
 * 
 * SAMPLE INPUT ?ba??b SAMPLE OUTPUT ababab Explanation Words ababab, ababbb,
 * bbabab and bbabbb could be written on paper. The first in alphabetical order
 * is ababab.
 * 
 * Time Limit: 2.0 sec(s) for each input file. Memory Limit: 256 MB Source
 * Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class ExploringRuins {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] result = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			char c = result[i];
			if (c == '?') {
				if (i == 0) {
					if (result[i + 1] == 'b'||result[i + 1] == '?') {
						c = 'a';
					} else
						c = 'b';

				} else {
					if (i == input.length() - 1) {
						if (result[i - 1] == 'b') {
							c = 'a';
						} else
							c = 'b';
					} else if (result[i - 1] == 'a'
							|| result[i + 1] == 'a')
						c = 'b';
					else {
						c = 'a';
					}
				}
			}
			result[i]= c;
		}
		System.out.println(new String(result));
	}
}
