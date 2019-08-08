package basics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Lab03Test {

    @Test
    public void findMinMaxNeverSeen() {
        Lab03 classUnderTest = new Lab03();

        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expected =
                "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n";

        assertEquals(classUnderTest.findMinMaxNeverSeen(weeklyMonthTemperatures),expected);
    }

    @Test
    public void tally() {
        Lab03 classUnderTest = new Lab03();

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String expected = "Bush received the most votes!";

        assertTrue(classUnderTest.tally(votes).equals(expected));
    }
}