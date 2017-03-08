package symbol_tables.elementry_implementation;

import org.junit.Test;

public class TestLinkedListImpl {

	@Test
	public void test() {
		LinkedListImpl<Character, Integer> list = new LinkedListImpl<Character, Integer>();
		list.put('S', 0);
		list.put('S', 5);
		list.put('E', 5);
		list.put('A', 1);
		list.put('D', 9);
		list.put('A', 8);
		list.put('E', 11);
		
		System.out.println(list.get('S'));
	}

}
