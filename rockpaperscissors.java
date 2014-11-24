import java.lang.String;
import java.util.Vector;

// Class used to calculate potential
public class rockpaperscissors {
	// Declare vector matrix to store our items
	public static Vector<Vector<String>> result = new Vector<Vector<String>>();
	public static String[] options = {"rock", "paper", "scissors"};
	// Constructor
	rockpaperscissors(){
		for(int i = 0 ; i < 3; i++ ){
			result.add(new Vector<String>());
			result.get(i).add(options[i]);
		}
	}

	public static Vector<Vector<String>> calculatePossibilities(int roundsRemaining){
		if( roundsRemaining == 1 ){
			return result;
		} else {
			int size = result.size();
			// Add two clones of the array to the end;
			for( int i = 0; i < size; i++ ){
				Vector<String> copy = (Vector<String>)result.get(i).clone();
				result.add(copy);
			}
			for( int i = 0; i < size; i++ ){
				Vector<String> copy = (Vector<String>)result.get(i).clone();
				result.add(copy);
			}
			// Add rock to first third
			for( int i = 0; i < size; i++ ){
				result.get(i).add("rock");
			}
			// Add paper to second third
			for( int i = size; i < size * 2; i++ ){
				result.get(i).add("paper");
			}
			// Add scissors to third third
			for( int i = size * 2; i < size * 3; i++ ){
				result.get(i).add("scissors");
			}
			return calculatePossibilities( roundsRemaining - 1 );
		}
	}

	public static void main(String[] args){
		rockpaperscissors test = new rockpaperscissors();
		System.out.println(test.result.get(0).get(0));
		Vector<Vector<String>> answer = test.calculatePossibilities(3);
		System.out.println("Answer size is: " + answer.size());
		for( int i = 0; i < answer.size(); i++ ){
			System.out.println("START");
			for( int j = 0; j < answer.get(0).size(); j++){
				System.out.println(answer.get(i).get(j));
			}
			System.out.println("END");
		}
	}
}