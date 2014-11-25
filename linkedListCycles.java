/*
 * Assignment: Write a function that returns true if a linked list contains a cycle, or false if it terminates somewhere
 *
 * Explanation:
 * 
 * Generally, we assume that a linked list will terminate in a null next pointer, as follows:
 *
 * A -> B -> C -> D -> E -> null
 *
 * A 'cycle' in a linked list is when traversing the list would result in visiting the same nodes over and over
 * This is caused by pointing a node in the list to another node that already appeared earlier in the list. Example:
 *
 * A -> B -> C
 *      ^    |
 *      |    v
 *      E <- D
 *
 * hasCycle(nodeA); // => true
 *
 * Constraint 1: Do this in linear time
 * Constraint 2: Do this in constant space
 * Constraint 3: Do not mutate the original nodes in any way
 */

public class linkedListCycles {
	public static class Node {
		private Object value;
		public Node next;
		public Node prev;
		
		public Node(){
			next = null;
			prev = null;
			value = 0;
		}
		
		public Node(Object val){
			next = null;
			prev = null;
			value = val;
		}
	}

	public static boolean hasCycle(Node start){
		Node i = start;
		Node j = start;
		while( i != null && j != null ){
			i = i.next;
			j = j.next.next;
			if( i == j ){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args){
		Node n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		n1.next.next.next = new Node(4);
		n1.next.next.next.next = n1;
		System.out.println(hasCycle(n1)); // should be true
		n1.next.next.next.next = null;
		System.out.println(hasCycle(n1)); // should be false
	}
}