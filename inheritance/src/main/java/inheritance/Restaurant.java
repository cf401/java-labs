package inheritance;

//Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
//Implement a Restaurant constructor.
//Test that your Restaurant constructor is behaving reasonably.
//Implement a reasonable toString method for Restaurants.
//Write a test to create an instance of Restaurant and ensure that its toString is working properly

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    //variables
    String name;
    int stars;
    String price;
    List<Review> reviews = new ArrayList<>();

    //constructor
    Restaurant(String name, int stars, String price){
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    //methods
    public String print(){
        String output = "name: " + this.name
                + " stars: " + this.stars
                + " price: " + this.price
                + ".";
        return output;
    }

    public void addReview(Review review){
        //if review is not already in reviews
        if (!reviews.contains(review)){
            //add review into reviews
            this.reviews.add(review);
            //change star count for new review
            this.stars = review.stars;
        }

    }
}
