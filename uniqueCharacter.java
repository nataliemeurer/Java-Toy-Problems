// 1.1 Implement an algorithm to determine if a string has all unique characters. What if 
// you can not use additional data structures?
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Character;


public class uniqueCharacter {
	
	public static boolean uniqueCharacter(String str){
		HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
		for( int i=0; i < str.length(); i++ ){
			if( charCounts.get(str.charAt(i)) != null ){
				return false;
			} else {
				charCounts.put(str.charAt(i), 1);
			}
		}
		return true;

	};

	public static boolean uniqueCharacter2(String str){
		for( int i=0; i < str.length(); i++ ){
			if( str.lastIndexOf(str.charAt(i)) != str.indexOf(str.charAt(i)) ){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(uniqueCharacter("helo"));
		System.out.println(uniqueCharacter2("helo"));
	}
}