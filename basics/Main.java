// random number generator
import java.util.*; 
//time and formating
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.*;

public class Main {
  public static void main(String[] args){
    //test pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(1);

    //note; this will run forever.
    commandLineClock();
  }
  
  //Write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
  public static String pluralize(String incoming, int count){   
    if (count == 0 || count > 1 ) {
      String plural = incoming + "s";
      return plural; 
    } 
    else {
      return incoming;
    }
  }

  //Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.
  public static void flipNHeads(int headsNeeded){
    int headsInARow = 0; 
    int flips = 0;
    while (headsNeeded > headsInARow){
      // create instance of Random class 
      Random rand = new Random();
      int random = rand.nextInt(2);
      //if tails, reset.  iterate if heads.
      if (random == 0 ){
        System.out.println("heads");
        headsInARow++;
        flips++;
      }
      else{
        System.out.println("tails");
        headsInARow = 0;
        flips++;
      }
    }
    //print it
    System.out.println("It took "+ flips + " flips to flip "+ headsNeeded +" heads in a row.");
  }

  //Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.
  //Zero-pad single digit numbers as strings so the timestamp is always the same number of characters. 12:10:58

//command line clock
  public static void commandLineClock(){
    //make a new timer
    Timer timer = new Timer();
    //make a new task 
    TimerTask task = new TimerTask(){
      public void run(){
        //print time
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
      }
    }; 
    timer.scheduleAtFixedRate(task, 1000, 1000);
  }

}//end class main