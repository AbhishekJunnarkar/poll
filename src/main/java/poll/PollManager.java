package poll;

import java.util.List;

public class PollManager {

	public static void main(String[] args) {
		List<Poll> polls = List.of(new Poll("Check_your_Stress", "psychology", 5, 20000),
				new Poll("Core Java", "J2EE", 5, 18000), new Poll("Spring", "Spring Framework", 4, 22000),
				new Poll("Spring Boot", "Spring Framework", 5, 15000),
				new Poll("Spring-Security", "Spring Framework", 5, 12000),
				new Poll("Spring-MVC", "Spring Framework", 4, 18000),
				new Poll("Spring-Batch", "Spring Framework", 5, 9000),
				new Poll("Spring Integration", "Spring Framework", 5, 6000),
				new Poll("Spring Data", "Spring Framework", 3, 26000));

		//all match // None match // any match
		
		
	}
}

class Poll {
	private String name;
	private String category;
	private int reviewStarRating; // 1 to 5 stars
	private int noOfSubscribers;

	public Poll(String name, String category, int reviewStarRating, int noOfSubscribers) {
		this.name = name;
		this.category = category;
		this.reviewStarRating = reviewStarRating;
		this.noOfSubscribers = noOfSubscribers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewStarRating() {
		return reviewStarRating;
	}

	public void setReviewStarRating(int reviewStarRating) {
		this.reviewStarRating = reviewStarRating;
	}

	public int getNoOfSubscribers() {
		return noOfSubscribers;
	}

	public void setNoOfSubscribers(int noOfSubscribers) {
		this.noOfSubscribers = noOfSubscribers;
	}

	@Override
	public String toString() {
		return "name " + name + " category " + category + " reviewStarRating " + reviewStarRating + " noOfSubscribers "
				+ noOfSubscribers;
	}
}