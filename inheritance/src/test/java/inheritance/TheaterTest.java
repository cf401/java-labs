package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
//    variables
//    String name;
//    public List<String> movies = new ArrayList<>();
//    List<Review> reviews = new ArrayList<>();

    Theater tone;
    Theater ttwo;
    Theater tthree;

    Review rwone;
    Review rwtwo;
    Review rwthree;

    @Before
    public void setUp() throws Exception {
        tone = new Theater("We do movies");
        ttwo = new Theater("Kings Cross");
        tthree = new Theater("Theature 9 and 3/4");

        rwone = new Review("Blade 3 was amazing.", "Michael Scott", 3, "Blade 3");
        rwtwo = new Review("I loved this movie.", "Dwight Schrutt", 3, "Matrix");
        rwthree = new Review("Why would they even remake this again?", "Jim Halbert", 1, "Spiderman");

        tone.reviews.add(rwone);
        tone.reviews.add(rwtwo);
        ttwo.reviews.add(rwthree);

        tone.addMovie("Blade 3");
        tone.addMovie("Matrix");
        tone.addMovie("Spiderman");

        tone.removeMovie("Spiderman");

    }

    @Test
    public void toStringTest() {
        String actual = ttwo.toString();
        String expected = "name: Kings Cross.";
        assertEquals(expected, actual);
    }

    @Test
    public void addReviewTest() {
        String actual = ttwo.reviews.get(0).toString();
        String expected = "author: Jim Halbert body: Why would they even remake this again? stars: 1.";
        assertEquals(expected, actual);
    }

    @Test
    public void addMovieTest() {
        String actual = tone.movies.get(1);
        String expected = "Matrix";
        assertEquals(expected, actual);
    }

    @Test
    public void removeMovieTest() {
        boolean actual = tone.movies.contains("Spiderman");
        boolean expected = false;
        assertEquals(expected, actual);
    }
}