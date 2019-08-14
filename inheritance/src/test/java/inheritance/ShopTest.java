package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    //variables
    //    String name;
    //    String description;
    //    String price;

    Shop sone;
    Shop stwo;
    Shop sthree;

    Review swone;
    Review swtwo;
    Review swthree;

    @Before
    public void setUp() throws Exception {
        sone = new Shop("Jerry Daycare", "leave your jerry in safety.", "$$$");
        stwo = new Shop("Fake Door Emporium", "we've got fake doors.  they're all fake!", "$$");
        sthree = new Shop("Cursed Curios", "everything in this store is cursed for your pleasure.", "$");

        swone = new Review("I loved the Dragon meat.", "Michael Scott", 3);
        swtwo = new Review("Almost like unicorn.", "Dwight Schrutt", 3);
        swthree = new Review("I've tasted sawdust that was better.", "Jim Halbert", 1);

        sone.reviews.add(swone);
        sone.reviews.add(swtwo);

        stwo.reviews.add(swthree);
    }

    @Test
    public void toStringTest() {
        String actual = stwo.toString();
        String expected = "name: Fake Door Emporium description: we've got fake doors.  they're all fake! price: $$.";
        assertEquals(expected, actual);
    }

    @Test
    public void addReviewTest() {
        String actual = stwo.reviews.get(0).toString();
        String expected = "author: Jim Halbert body: I've tasted sawdust that was better. stars: 1.";
        assertEquals(expected, actual);
    }

}