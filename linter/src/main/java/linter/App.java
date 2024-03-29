//author: Jack Daniel Kinne
//challenge by: Code Fellows

package linter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {

    //Write a method that reads a JavaScript file with a given Path,
    // and generates an error message whenever it finds a line that doesn’t end
    // in a semi-colon.
    //
    //Read through the file line by line. Create a string that contains
    // a message such as "Line 3: Missing semicolon."
    // if a line is missing a semicolon.
    //
    //Don’t show an error if the line is empty.
    //Don’t show an error if the line ends with an opening curly brace {
    //Don’t show an error if the line ends with an closing curly brace }
    //Don’t show an error if the line contains if or else

    public String lintSemi(String path){

        Scanner s = null;
        int lineNumber = 0;
        String output = "";

        try{
            s = new Scanner(new BufferedReader(new FileReader(path)));
            if(s.hasNextLine() == false) return "file empty.";
            while (s.hasNextLine()) {
                if (s.hasNextLine() ){

                    //isolate the line
                    String line = s.nextLine();
                    //populate line number
                    lineNumber++;
                    char end = ' ';
                    //if the line is not null, grab the last character.
                    if(line.length() > 0 ) end = line.charAt(line.length() - 1);

                    // if a line is missing a semicolon, and doesn't hit an acceptable condition:
                    if(end != ';' && end !='{' && end != '}' && end != ' ' && !(line.contains("if")) && !(line.contains("else") ) ){
                        //return with line number

                        output = output + "Line " + lineNumber + ": Missing semicolon.\n";



                    }
                    //Don’t show an error if the line is empty.
                    //Don’t show an error if the line ends with an opening curly brace {
                    //Don’t show an error if the line ends with an closing curly brace }
                    //Don’t show an error if the line contains if or else
                }
            }
        }
        catch (FileNotFoundException e ) {
            return "The file was not found.";
        }

        if (output.length() > 0){
            return output;
        }
        else {
            return "File contains no missing semicolons.";
        }

    }

    public static void main(String[] args) {
        System.out.println(new App().lintSemi("./src/main/resources/gates.js"));
    }
}
