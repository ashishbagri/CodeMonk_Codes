import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class LittleMonkandGobletofFire {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int operations = Integer.parseInt(br.readLine());
		PriorityQueue<Order> queue = new PriorityQueue<Order>(operations, 
				new Comparator<Order>() {

					@Override
					public int compare(Order o1 , Order o2) {
						// TODO Auto-generated method stub
						if (o1.getSchool() < o2.getSchool())
				        {
				            return -1;
				        }
				        if (o1.getSchool()> o2.getSchool())
				        {
				            return 1;
				        }
				        return 0;
					}
			
		});
		for(int i=0;i<operations;i++){
			String[] input = br.readLine().split(" ");
			if(input[0].equals("E")){
				put(queue,Integer.parseInt(input[1]),Integer.parseInt(input[2]));
			}else{
				//Order o = ;
				System.out.println(queue.remove());
			}
		}
	}

	private static void put(Queue<Order> queue, int parseInt,
			int parseInt2) {
		queue.offer(new Order(parseInt,parseInt2));
	}
}
class Order{
	private int school;
	private int number;
	Order(int school, int number){
		this.school = school;
		this.number = number;
	}
	public int getSchool(){
		return school;
	}
	public int getNumber(){
		return number;
	}
	public String toString(){
		return school+" "+number;
	}
}
