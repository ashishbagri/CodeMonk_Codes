package symbol_tables.elementry_implementation;

import java.util.LinkedList;

import symbol_tables.SymbolTable;

public class LinkedListImpl<K, V> implements SymbolTable<K, V> {

	private LinkedList<Pair<K, V>> elementryList = new LinkedList<Pair<K, V>>();

	@Override
	public V get(K key) {
		Pair pair = null;
		for(Pair p : elementryList){
			K k = (K)p.getKey();
			
			if(key.equals(k)){
				pair = p;
			}
		}
		return (V)pair.getValue();
	}

	@Override
	public void put(K key, V value) {
		Pair pair = null;
		for(Pair p : elementryList){
			K k = (K)p.getKey();
			
			if(key.equals(k)){
				pair = p;
			}
		}
		if(pair!=null){
			pair.setValue(value);
		}else{
			elementryList.add(new Pair(key,value));
		}
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
