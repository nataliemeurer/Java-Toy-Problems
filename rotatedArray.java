public class rotatedArray {
	public static int search(int arr[], int bot, int top, int target){
		while(bot <= top){
			int m = (top + bot) / 2;
			if( arr[m] == target ){
				return m;
			} else if (arr[m] > arr[m + 1]){
				if(target < arr[0]){
					bot = m + 1;
				} else {
					top = m - 1;
				}
			} else if (arr[m] < arr[m - 1]){
				if(target < arr[0]){
					bot = m + 1;
				} else {
					top = m - 1;
				}
			} else if(target > arr[m]) {
				bot = m + 1;
			} else {
				top = m - 1;
			}
		}
		return -1;
	}

	public static int search(int arr[], int target){
		return search(arr, 0, arr.length - 1, target);
	}

	public static void main(String args[]){
		int myArr[] = {14, 15, 17, 19, 22, 24, 4, 6, 7, 8, 9};
		System.out.println(search(myArr, 14));
	}
}