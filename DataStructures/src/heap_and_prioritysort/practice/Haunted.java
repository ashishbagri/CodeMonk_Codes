package heap_and_prioritysort.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Haunted {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(sc.next());
		long m = Long.parseLong(sc.next());

		Map<Long, Long> titleCount = new HashMap<Long, Long>();

		long id = 0;
		long max = 0;
		
		for (int i = 0; i < n; i++) {
			
			long m1 = Long.parseLong(sc.next());
			if (titleCount.get(m1) == null) {
				titleCount.put(m1, (long)1);
			} else {
				long l = titleCount.get(m1);
				titleCount.put(m1, l + 1);
			}
			if(max<titleCount.get(m1)){
				max = titleCount.get(m1);
				id = m1;
			}else{
				if(max == titleCount.get(m1)&& id<m1)
					id = m1;
			}
			System.out.println(String.format("%s %s", id, max));
		}
	}
}

/*class Event implements Comparator<Event> {
	private static Map<Long, Long> titleCount = new HashMap<Long, Long>();

	public Event() {
		// TODO Auto-generated constructor stub
	}

	private long m;

	public Event(long m) {
		this.m = m;

		if (titleCount.get(m) == null) {
			titleCount.put(m, new Long(1l));
		} else {
			long l = titleCount.get(m);
			titleCount.put(m, l + 1);
		}
	}

	@Override
	public int compare(Event event1, Event event2) {
		Long eventOneTile = event1.titleCount.get(event1.m);
		Long eventTwoTitle = event2.titleCount.get(event2.m);

		if (eventTwoTitle > eventOneTile) {
			return 1;
		}
		if (eventTwoTitle < eventOneTile)
			return -1;

		if (event2.m > event1.m)
			return 1;
		if (event2.m < event1.m)
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return String.format("%s %s", m, titleCount.get(m));
	}

}*/
