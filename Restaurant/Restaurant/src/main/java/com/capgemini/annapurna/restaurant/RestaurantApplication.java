package com.capgemini.annapurna.restaurant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author ugawari
 *
 * @SpringBootApplication to start a Spring application context
 */
@SpringBootApplication
public class RestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

	/*Set<FoodItem> foodItems = new HashSet<FoodItem>();
	Map<Integer, Integer> ratings = new HashMap<Integer, Integer>();
	Map<Integer, String> reviews = new HashMap<Integer, String>();
	Set<String> photos = new HashSet<String>();

	@Bean
	public CommandLineRunner produceData(RestaurantRepository repository) {
		foodItems.add(new FoodItem());
		foodItems.add(new FoodItem());

		ratings.put(101, 3);
		ratings.put(102, 4);

		reviews.put(101, "Quality Good");
		reviews.put(102, "Quality Good");

		photos.add("c:/food");
		photos.add("c:/seefood");

		return (env) -> {
			repository.save(
					new Restaurant(101, "Royal Foods", new Address("Vitawa", "Thane", "Maharashtra", "India", 450124),
							foodItems, ratings, reviews, "Veg-NonVeg", photos));
		};
	}*/

}
