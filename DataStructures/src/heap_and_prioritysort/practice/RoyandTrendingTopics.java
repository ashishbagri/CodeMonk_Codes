package heap_and_prioritysort.practice;

import java.time.DayOfWeek;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RoyandTrendingTopics {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int dataLength = sc.nextInt();

		PriorityQueue<Topic> topics = new PriorityQueue<Topic>(new Comparator<Topic>() {

			@Override
			public int compare(Topic firstTopic, Topic secondTopic) {
				Long firstTopicZScore = firstTopic.getChangeInScore();
				Long secondTopicZScore = secondTopic.getChangeInScore();

				int res = secondTopicZScore.compareTo(firstTopicZScore);
				if (res == 0) {
					return new Long(secondTopic.getId()).compareTo(new Long(firstTopic.getId()));
				}
				return res;
			}

		});

		while (dataLength-- > 0) {

			topics.add(new Topic(Long.parseLong(sc.next()), Long.parseLong(sc.next()), Long.parseLong(sc.next()), Long.parseLong(sc.next()), Long.parseLong(sc.next()), Long.parseLong(sc.next())));
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(topics.poll());
		}
	}
}

class Topic {

	private long id;
	private long z_score;
	private long likes;
	private long newZScore;
	
	public long getNewZScore() {
		return newZScore;
	}

	public void setNewZScore(long newZScore) {
		this.newZScore = newZScore;
	}

	public long getLikes() {
		return likes;
	}

	public void setLikes(long likes) {
		this.likes = likes;
	}

	private long posts;
	private long comments;
	private long shares;

	public Topic() {
		// TODO Auto-generated constructor stub
	}

	public long getChangeInScore() {
		long old_score = getZ_score();
		long new_score = getPosts()*50+getLikes()*5+getComments()*10+getShares()*20;
		setNewZScore(new_score);
		return new_score-old_score;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getZ_score() {
		return z_score;
	}

	public void setZ_score(long z_score) {
		this.z_score = z_score;
	}

	public long getPosts() {
		return posts;
	}

	public void setPosts(long posts) {
		this.posts = posts;
	}

	public long getComments() {
		return comments;
	}

	public void setComments(long comments) {
		this.comments = comments;
	}

	public long getShares() {
		return shares;
	}

	public void setShares(long shares) {
		this.shares = shares;
	}

	public Topic(long id, long z_score, long posts, long likes, long comments, long shares) {
		super();
		this.id = id;
		this.z_score = z_score;
		this.posts = posts;
		this.likes = likes;
		this.comments = comments;
		this.shares = shares;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s", getId(),getNewZScore());
	}
}
