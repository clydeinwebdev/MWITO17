import java.io.*;
import java.util.*;
public class D{
	public static void main(String [] args)throws FileNotFoundException{
		Scanner get = new Scanner(new File("D.in"));
		while(get.hasNext()){
			String word = get.nextLine();			
			if(word.equals("#"))break;
			word = replace(word);
			System.out.println(word);
		}
	}
	static String replace(String word){
		String nw = "";
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)==' '){
				nw+="%20";
			}
			else if(word.charAt(i)=='!'){
				nw+="%21";
			}
			else if(word.charAt(i)=='$'){
				nw+="%24";
			}
			else if(word.charAt(i)=='%'){
				nw+="%25";
			}
			else if(word.charAt(i)=='('){
				nw+="%28";
			}
			else if(word.charAt(i)==')'){
				nw+="%29";
			}
			else if(word.charAt(i)=='*'){
				nw+="%2a";
			}
			else{
				nw+=word.charAt(i)+"";
			}		
			// nw+=word.charAt(i)+"";	
		}	
		return nw;		
	}
}