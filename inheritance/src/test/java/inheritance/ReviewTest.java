package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Review one;
    Review two;
    Review three;
    @Before
    public void setUp() throws Exception {
        one = new Review("I loved the Dragon meat.", "Michael Scott", 3);
        two = new Review("Almost like unicorn.", "Dwight Schrutt", 3);
        three = new Review("I've tasted sawdust that was better.", "Jim Halbert", 1);

    }

    @Test
    public void print() {
        String actual = one.print();
        String expected = "author: Michael Scott body: I loved the Dragon meat. stars: 3.";
        assertEquals(expected, actual);
    }

    @Test
    public void rConstructorTest() {
        String actual = two.print();
        String expected = "author: Dwight Schrutt body: Almost like unicorn. stars: 3.";
        assertEquals(expected, actual);
    }
}