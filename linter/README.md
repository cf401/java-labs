# Challenge Summary
<!-- Short summary or background information -->
write a linter app that checks for semi colons

## Challenge Description
<!-- Description of the challenge -->
```
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
```

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
modularize a function
start a scanner
read line by line
perform logical check based on conditions listed
indicate line number where flag triggers
return formated string + line number.


## Credits and Contributions
Nick Paro
Brandon Hurrington