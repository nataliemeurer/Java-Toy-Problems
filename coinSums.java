import java.lang.Integer;

public class coinSums {
	private static Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 200};

	public static Integer makeChange(Integer amount){
		if (amount < 1){
			return 0;
		}
		return counter(0, amount);
	};

	public static int counter(Integer currentAmount, Integer desiredAmount){
		if(currentAmount == desiredAmount){
			return 1;
		}
		for( int i = 0; i < coins.length; i++ ){
			if( currentAmount + coins[i] < desiredAmount ){
				result += counter(currentAmount + coins[i], desiredAmount);
			} else {
				result += 0;
			}
		}
		return result;
	};

	public static void main(String[] args){
		System.out.println(makeChange(10));
	};
}