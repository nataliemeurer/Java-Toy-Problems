public class linkedlist {
	public Node head;
	public Node tail;
	public int size;

	public linkedlist()
	{
		head = new Node();
		tail = head;
		size = 0;
	}

	public void addToTail(Object val)
	{

	}

	public void addToHead(Object val)
	{
		if( head.data == null ){
			System.out.println("Adding first item");
			head.data = val;
			head.next = tail;
			head.prev = null;
			tail = head;
		} else if(tail == head){
			System.out.println("Adding second item");
			Node newNode = new Node(val);
			tail.prev = newNode;
			newNode.next = tail;
			head = newNode;
		} else {
			System.out.println("Adding third item");
			Node newNode = new Node(val);
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	public Object remove(){
		Node removed = head;
		head = head.next;
		Object data = removed.data;
		removed = null;
		size--;
		return data;
	}

	// Get size of current list
	public int size(){
		return this.size;
	}

	private static class Node {
		// Object variables
		Node next;
		Node prev;
		Object data;

		// NODE CONSTRUCTORS
		public Node(){
			next = null;
			prev = null;
			data = null;
		}

		public Node(Object newData)
		{
			next = null;
			prev = null;
			data = newData;
		}
		public Node(Object newData, Node nextNode)
		{
			next = nextNode;
			prev = null;
			data = newData;
		}
		public Node(Object newData, Node nextNode, Node prevNode)
		{
			next = nextNode;
			prev = prevNode;
			data = newData;
		}
	}

	public static void main(String[] args){
		linkedlist mylist = new linkedlist();
		mylist.addToHead(5);
		mylist.addToHead("HELLO");
		mylist.addToHead(15);
		mylist.addToHead(20);
		System.out.println(mylist.size());
		System.out.println(mylist.remove());
		System.out.println(mylist.size());
		System.out.println(mylist.remove());
		System.out.println(mylist.size());
		System.out.println(mylist.remove());
		System.out.println(mylist.size());
	}

}