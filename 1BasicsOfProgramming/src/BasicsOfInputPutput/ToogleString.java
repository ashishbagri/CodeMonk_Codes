package BasicsOfInputPutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * You have been given a String S S consisting of uppercase and lowercase
 * English alphabets. You need to change the case of each alphabet in this
 * String. That is, all the uppercase letters should be converted to lowercase
 * and all the lowercase letters should be converted to uppercase. You need to
 * then print the resultant String to output.
 * 
 * Input Format The first and only line of input contains the String S S
 * 
 * Output Format Print the resultant String on a single line.
 * 
 * Constraints 1 ≤ | S | ≤ 100 1≤|S|≤100 where | S | |S| denotes the length of
 * string S S.
 * 
 * SAMPLE INPUT abcdE SAMPLE OUTPUT ABCDe Time Limit: 5.0 sec(s) for each input
 * file. Memory Limit: 256 MB Source Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class ToogleString{
	public static void main(String args[]){
		String input = getInput();
		String toogledString = toogleString(input);
		System.out.println(toogledString);
	}
	private static String getInput(){
		try{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			return input;
		}catch(IOException e){
			throw new RuntimeException("Input is null");
		}
	}
	private static String toogleString(String input){
		
		char[] toogledChars = new char[input.length()];
		for(int i=0;i<input.length();i++){
		
			char currentChar = input.charAt(i);
			if(Character.isUpperCase(currentChar)){
				currentChar = Character.toLowerCase(currentChar);
			}else{
					currentChar = Character.toUpperCase(currentChar);
			}
			toogledChars[i] = currentChar;
		}
		return new String(toogledChars);
	}
}
