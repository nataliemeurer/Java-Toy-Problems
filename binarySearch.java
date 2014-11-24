import java.lang.Math;

public class binarySearch {
	public static int binarySearch(Object[] arr, Object target, double length, int start){
		// choose middle item in the array
		int mid = (int)Math.floor(arr.length / 2);
		// return item if met
		if( arr[mid] == target){
			return mid;
		} else if( length > 0 ){
			// else recurse on upper and lower halves of the array
			binarySearch(arr, target, Math.floor(length / 2), (int)(mid - Math.floor(length / 2)));
			binarySearch(arr, target, Math.floor(length / 2), mid + 1);
		} else {
			return -1;
		}
		return -1;
	} 
	public static void main (String[] args){
		Object[] integers = { 9, 8, 2, 12, 19, 50};
		System.out.println(binarySearch(integers, 19, (double)integers.length, 0));
	}
}