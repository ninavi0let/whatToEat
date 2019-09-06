# whatToEat
import java.util.Scanner;

public class whatToEat {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int partySize = 0;
		int eventType = 0;
		String result;
		String mealSuggestions = "";
		String preparationSuggestions = "";

		System.out.println("Choose your event type!");
		System.out.println("If casual enter 1, if semi-formal enter 2, or formal enter 3:");
		eventType = scnr.nextInt();

		System.out.println("Enter your party size: ");
		partySize = scnr.nextInt();

		if (partySize == 1 && eventType == 1) {
			mealSuggestions = "sandwiches";
			preparationSuggestions = "in the microwave";
		} else if (partySize >= 2 && partySize <= 12 && eventType == 1) {
			mealSuggestions = "sandwiches";
			preparationSuggestions = "in your kitchen";
		} else if (partySize >= 13 && eventType == 1) {
			mealSuggestions = "sandwiches";
			preparationSuggestions = "by a caterer";
		} else if (partySize == 1 && eventType == 2) {
			mealSuggestions = "fried chicken";
			preparationSuggestions = "in the microwave";
		} else if (partySize >= 2 && partySize <= 12 && eventType == 2) {
			mealSuggestions = "fried chicken";
			preparationSuggestions = "in the kitchen";
		} else if (partySize >= 13 && eventType == 2) {
			mealSuggestions = "fried chicken";
			preparationSuggestions = "by a caterer";
		} else if (partySize == 1 && eventType == 3) {
			mealSuggestions = "chicken parmesan";
			preparationSuggestions = "in the microwave";
		} else if (partySize >= 2 && partySize <= 12 && eventType == 3) {
			mealSuggestions = "chicken parmesan";
			preparationSuggestions = "in the kitchen";
		} else if (partySize >= 13 && eventType == 3) {
			mealSuggestions = "chicken parmesan";
			preparationSuggestions = "by a caterer";
		}

		result = "Since you're hosting a " + eventType + " for " + partySize + " , you should serve " + mealSuggestions
				+ " prepared " + preparationSuggestions + ".";

		System.out.println(result);

	}

}
