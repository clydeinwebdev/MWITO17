import java.io.*;
import java.util.*;
public class J{
	public static void main(String [] args)throws FileNotFoundException{
		Scanner get = new Scanner(new File("J.in"));
		while(get.hasNext()){
			String word = get.nextLine();
			if(word.equals("DONE"))break;
			word = removeSymbols(word).toLowerCase();
			String rword = reverse(word);
			if(isPalindrome(word,rword)){
				System.out.println("You won't be eaten!");
			}
			else{
				System.out.println("Uh oh..");
			}
			// System.out.print(word+ " == " + rword);
			// System.out.println();

		}
	}
	static String removeSymbols(String word){
		String newWord = "";
		for(int i=0;i<word.length();i++){
			//System.out.print(word.charAt(i)+"-");
			if(	word.charAt(i)!='!' && word.charAt(i)!='@' &&
				word.charAt(i)!='#' && word.charAt(i)!='$' &&
				word.charAt(i)!='%' && word.charAt(i)!='^' &&
				word.charAt(i)!='&' && word.charAt(i)!='*' &&
				word.charAt(i)!='(' && word.charAt(i)!=')' &&
				word.charAt(i)!='-' && word.charAt(i)!='+' &&
				word.charAt(i)!='=' && word.charAt(i)!='*' &&
				word.charAt(i)!='/' && word.charAt(i)!='<' &&
				word.charAt(i)!='>' && word.charAt(i)!='.' &&
				word.charAt(i)!=',' && word.charAt(i)!='`' &&
				word.charAt(i)!='\'' && word.charAt(i)!='"' &&
				word.charAt(i)!=' '
				){
				// System.out.print(word.charAt(i)+"");
				newWord+=word.charAt(i)+"";
			}			
		}	
		return newWord;	
	}
	static String reverse(String word){
		String nw = "";
		for(int i=word.length()-1;i>=0;i--){
			nw+=word.charAt(i)+"";
		}
		return nw;
	}
	static boolean isPalindrome(String w1, String w2){
		return w1.equalsIgnoreCase(w2);
	}
}