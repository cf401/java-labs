//Author: Jack Daniel Kinne

package basics;

import java.util.Random;

public class Library {

    //roll a six sided dice n times.  return values in array.
    public int[] roll(int n) {
        int[] diceValues = new int[n];
        for (int i = 0 ; i < diceValues.length; i ++){
            Random rand = new Random();
            diceValues[i] = rand.nextInt(7);
        }
        return diceValues;
    }

    //check array for duplicates.  return bool.
    public boolean containsDuplicates(int[] arr){
        for(int x: arr){
            int count = 0;
            for (int y: arr){
                if(x == y) count++;
                if (count > 1) return true;
            }
        }
        return false;
    }

    //calculate average of array.  return avg.
    public int calculateAverage(int[] arr){
        int sum = 0;
        int averageValue = 0;

        for ( int x : arr){
            sum = sum + x;
        }

        averageValue = sum / arr.length;
        return averageValue;
    }

    //calculate averages of n arrays.  return lowest array.
    public int[] arrayArrayLowAverage(int[][]arr){
        int[] averageLowestValues = new int[arr.length];
        int index = 0;
        int lowest = 999;
        int indexOfLowest = 0;

        for(int[] array : arr){
            //set average into array
            averageLowestValues[index] = calculateAverage(array);
            //find lowest value and index
            if (averageLowestValues[index] < lowest) {
                lowest = averageLowestValues[index];
                indexOfLowest = index;
            }
            index++;
        }
        return arr[indexOfLowest];
    }
}
