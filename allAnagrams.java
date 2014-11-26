/**
 * Given a single input string, write a function that produces all possible anagrams
 * of a string and outputs them as an ArrayList.
 * Example: anagrams('def') -> ['def', 'dfe', 'edf', 'efd', 'fde', 'fed']
 */

import java.util.ArrayList;

public class allAnagrams {
	// 
	public static ArrayList<String> anagrams(String remaining, String current, ArrayList<String> results){
		if(remaining.length() == 0){
			results.add(current);
		} else {
			for(int i = 0; i < remaining.length(); i++){
				String newStr = current + remaining.charAt(i);
				String newRemaining = "";
				for(int j=0; j < remaining.length(); j++){
					if( i != j){
						newRemaining +=  remaining.charAt(j);	
					}
				}
				anagrams(newRemaining, newStr, results);
			}
		}
		return results;
	}

	// Overload anagrams class for ease of use
	public static ArrayList<String> anagrams(String start){
		return anagrams(start, "", new ArrayList<String>());
	}

	public static void main(String[] args){
		ArrayList<String> result = anagrams("def");
		for( int i = 0; i < result.size(); i++ ){
			System.out.println(result.get(i));
		}
	}
}