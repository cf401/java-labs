package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater implements Reviewable {

    //variables
    String name;
    public List<String> movies = new ArrayList<>();
    List<Review> reviews = new ArrayList<>();

    //constructor
    Theater(String name){
        this.name = name;
    }

    //methods
    @Override
    public String toString(){
        String output = "name: " + this.name
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

    public void addMovie(String movie){
        this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }
}
