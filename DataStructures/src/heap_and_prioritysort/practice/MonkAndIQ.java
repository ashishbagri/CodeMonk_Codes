package heap_and_prioritysort.practice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MonkAndIQ {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int c = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());

		PriorityQueue<Course> pq = new PriorityQueue<Course>(new Course());

		for (int i = 1; i <= n; i++) {
			pq.add(new Course(i, Integer.parseInt(sc.next())));
		}
		for (int i = n + 1; i <= c; i++) {
			pq.add(new Course(i, 0));
		}
		for (int i = 0; i < p; i++) {
			int m = Integer.parseInt(sc.next());
			Course course = pq.poll();
			course.add(m);
			System.out.print(course.getCourseNumber()+" ");
			pq.add(course);
		}
	}
}

class Course implements Comparator<Course> {

	private int iq;
	private int courseNumber;
	private int secondLastIq;
	private int newIq;

	public void add(int iq) {
		this.secondLastIq = newIq;
		this.newIq = iq ;
		this.iq = newIq +secondLastIq;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	Course(int courseNumber, int iq) {
		this.secondLastIq = newIq;
		this.newIq = iq ;
		this.iq = newIq +secondLastIq;
		this.courseNumber = courseNumber;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getSecondLastIq() {
		return secondLastIq;
	}

	public void setSecondLastIq(int secondLastIq) {
		this.secondLastIq = secondLastIq;
	}

	@Override
	public int compare(Course o1, Course o2) {
		if (o1.iq > o2.iq)
			return 1;
		if (o1.iq < o2.iq)
			return -1;

		if (o1.getCourseNumber() > o2.getCourseNumber())
			return 1;
		if (o1.getCourseNumber() > o2.getCourseNumber())
			return -1;
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s", getCourseNumber(),getIq());
	}
}
