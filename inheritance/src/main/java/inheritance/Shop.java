package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Reviewable {
    //variables
    String name;
    String description;
    String price;
    List<Review> reviews = new ArrayList<>();

    //constructor
    Shop(String name, String description, String price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    //methods
    @Override
    public String toString(){
        String output = "name: " + this.name
                + " description: " + this.description
                + " price: " + this.price
                + ".";
        return output;
    }

    public void addReview(Review review){
        //if review is not already in reviews
        if (!reviews.contains(review)){
            //add review into reviews
            this.reviews.add(review);
        }

    }
}
