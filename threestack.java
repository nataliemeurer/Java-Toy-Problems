public class threestack {
	// member variables
	public int size = 600;
	public Object[] storage = new Object[size];
	public int[] stackCounts = {0, 0, 0};

	public threestack(){};

	public void push(int stackNum, Object item) {
		storage[(size/3 * stackNum) + stackCounts[stackNum] + 1] = item;
		stackCounts[stackNum]++;
	}

	public Object pop(int stackNum){
		Object removed = storage[(size/3 * stackNum) + stackCounts[stackNum]];
		storage[(size/3 * stackNum) + stackCounts[stackNum]] = null;
		return removed;
	}

	public static void main(String[] args){
		threestack stacks = new threestack();
		stacks.push(0, 5);
		stacks.push(0, 6);
		stacks.push(1, 4);
		System.out.println(stacks.pop(0));
	}

}