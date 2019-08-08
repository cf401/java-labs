package basics;


import java.util.*;

public class Lab03 {

//Use the October Seattle weather data above.
// Iterate through all of the data to find the min and max values.
// Use a HashSet of type Integer to keep track of all the unique temperatures seen.
// Finally, iterate from the min temp to the max temp and create a String
// containing any temperature not seen during the month. Return that String.

    public String findMinMaxNeverSeen (int[][]arr){

        HashSet<Integer> set = new HashSet<Integer>();
        int min = 9999;
        int max = 0;

        //iterate arr, add uniques, record max and min
        for (int[] x : arr){
            for (int y : x){
                set.add(y);
                if (y < min) min = y;
                if (y > max) max = y;
            }
        }

        //create output string
        StringBuilder output =new StringBuilder("High: " + max + "\n");
        output.append("Low: " + min + "\n");

        //iterate from min to max
        for (int i = min; i <= max ; i ++ ){
            //if set doesn't contain i, add to output string
            if (! set.contains(i) ){
                output.append("Never saw temperature: " + i + "\n");
            }
        }
        return output.toString();
    }

    //Write a function called tally that accepts a List of Strings representing
    // votes and returns one string to show what got the most votes.
    public String tally (List<String> votes){

        int mostVotes = 0;
        String winner = "";

        //iterate each voting option
        for (String x : votes){
            //get frequency of each item.
            int freq = Collections.frequency(votes, x);
            // if greater, assign new winner and count
            if (freq > mostVotes) {
                mostVotes = freq;
                winner = x;
            }
        }
        //format output
        String output = winner + " received the most votes!";
        return output;
    }
}
