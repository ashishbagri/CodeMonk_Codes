package symbol_tables;

public interface SymbolTable<K,V> {

	V get(K key);
	void put(K key, V value);
	void delete(K key);
	boolean contains(K key);
	boolean isEmpty();
	int size();
	Iterable<K> keys();
}
