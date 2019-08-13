package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant rone;
    Restaurant rtwo;
    Restaurant rthree;

    Review rwone;
    Review rwtwo;
    Review rwthree;

    @Before
    public void setUp() throws Exception {
        rone = new Restaurant("Darrells Dragon Meat", 4, "$$$");
        rtwo = new Restaurant("Kraken's Bounty", 3, "$$");
        rthree = new Restaurant("Just SPAM", 2, "$");

        rwone = new Review("I loved the Dragon meat.", "Michael Scott", 3);
        rwtwo = new Review("Almost like unicorn.", "Dwight Schrutt", 3);
        rwthree = new Review("I've tasted sawdust that was better.", "Jim Halbert", 1);

        rone.reviews.add(rwone);
        rone.reviews.add(rwtwo);

        rtwo.reviews.add(rwthree);
    }

    @Test
    public void print() {
        String actual = rone.print();
        String expected = "name: Darrells Dragon Meat stars: 4 price: $$$.";
        assertEquals(expected, actual);
    }

    @Test
    public void rConstructorTest() {
        String actual = rtwo.print();
        String expected = "name: Kraken's Bounty stars: 3 price: $$.";
        assertEquals(expected, actual);
    }

    @Test
    public void accessReviewInRestTest() {
        String actual = rtwo.reviews.get(0).print();
        String expected = "author: Jim Halbert body: I've tasted sawdust that was better. stars: 1.";
        assertEquals(expected, actual);
    }

    @Test
    public void addReview() {
        Restaurant rfour = new Restaurant("We Do Bacon", 2, "$$");
        Review rwfour = new Review("Literally nothing else on the menu.", "Jim Halbert", 5);

        //will change star value on rest
        rfour.addReview(rwfour);

        String actual = rfour.print();
        String expected = "name: We Do Bacon stars: 5 price: $$.";
        assertEquals(expected, actual);
    }
}