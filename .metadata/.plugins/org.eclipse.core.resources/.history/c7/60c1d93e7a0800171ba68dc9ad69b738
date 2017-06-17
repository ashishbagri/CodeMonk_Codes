package symbol_tables.elementry_implementation;

import java.util.ArrayList;
import java.util.List;

import symbol_tables.SymbolTable;

public class SortedLinkedListImpl<K,V> implements SymbolTable<K, V>{

	private List<Pair<K,V>> elementryElement = new ArrayList<SortedLinkedListImpl<K,V>.Pair<K,V>>();
	
	@Override
	public V get(K key) {
		if(elementryElement.isEmpty())
			return null;
		int rank = rank(key);
		if(rank<elementryElement.size()&&)
		return null;
	}

	private int rank(K key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void put(K key, V value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(K key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(K key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterable<K> keys() {
		// TODO Auto-generated method stub
		return null;
	}
	
	class Pair<K, V> {
		private final K key;
		private V value;

		public Pair(K key, V value) {
			super();
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}
		
		public void setValue(V value){
			this.value = value;
		}

		@Override
		public String toString() {
			return String.format("[%s,%s]", key, value);
		}
	}

}
