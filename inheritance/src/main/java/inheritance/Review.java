package inheritance;
//Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
//Write a Review constructor.
//Test that your constructor is working reasonably.
//Implement a reasonable toString method for Reviews.
//Write a test to create an instance of Review and ensure that its toString is working properly.

public class Review {
    //variables
    String body;
    String author;
    int stars;
    String movie;

    //constructor
    Review(String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    //overloaded constructor
    Review(String body, String author, int stars, String movie){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movie = movie;
    }

    //methods
    public String toString(){
        String output = "author: " + this.author
                + " body: " + this.body
                + " stars: " + this.stars
                + ".";
        return output;
    }
}
