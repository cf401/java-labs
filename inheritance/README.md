# Challenge Summary
<!-- Short summary or background information -->
- write a restaurant and review class, then have the first hold 
instances of the second.
- write a shop and theature class, add a list of movies to theature.  allow for reviews to be about movies. 

## Challenge Description
<!-- Description of the challenge -->
```
//Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
//Implement a Restaurant constructor.
//Test that your Restaurant constructor is behaving reasonably.
//Implement a reasonable toString method for Restaurants.
//Write a test to create an instance of Restaurant and ensure that its toString is working properly

//Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
//Write a Review constructor.
//Test that your constructor is working reasonably.
//Implement a reasonable toString method for Reviews.
//Write a test to create an instance of Review and ensure that its toString is working properly.

//write a shop and theature class, add a list of movies to theature.  allow for reviews to be about movies.
```

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
create two classes.
create print methods for both.
restaurant contains an array of reviews.
add method in rest changes star value by new review.

create two additional classes.  
create print methods.
create print method for movie list.
allow for reviews to be about movies with an overloaded constructor.
implements interface for classes.

```
data structure: arraylist
BIG O:
get  O(1)
add  O(1)
find O(n)
next O(1)
remove(0)
```


## Credits and Contributions
Nick Paro
Matt Stuhring
Padmapriya Ganapathi