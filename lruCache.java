import java.util.LinkedList;
import java.util.HashMap;

public class lruCache {
	// Properties
	private HashMap<Object, Object> store;
	private LinkedList<Object> usedOrder;
	private int max_size;
	private int current_size;

	// Constructor
	public lruCache(int sz){
		store  = new HashMap<Object, Object>();
		usedOrder = new LinkedList<Object>();
		max_size = sz;
		current_size = 0;
	}

	public void add(Object key, Object value){
		if( current_size < max_size ){
			store.put(key, value);
			usedOrder.addFirst(key);
			current_size++;
		} else {
			// remove least recently used
			Object removed_key = usedOrder.getLast();
			usedOrder.pop();
			store.remove(removed_key);
			// add item
			usedOrder.addFirst(key);
			store.put(key, value);
		}
	}

	public Object get(Object key){
		usedOrder.remove(usedOrder.indexOf(key));
		usedOrder.addFirst(key);
		return store.get(key);
	}


	public static void main(String[] args){
		lruCache cache = new lruCache(1);
		cache.add(5, "hello");
		cache.add("hola", 20);
		System.out.println(cache.get(5));
		System.out.println(cache.get("hola"));
	}
}