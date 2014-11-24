import java.util.ArrayList;

public class main {
	public static void main(String[] args){
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		intArr.add(5);
		System.out.println(intArr.size());
		intArr.set(0, 6);
		System.out.println(intArr.size());
		intArr.add(10);
		intArr.add(6);
		System.out.println(intArr.indexOf(6));
		System.out.println(intArr.lastIndexOf(6));
	}
}