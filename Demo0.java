// Prints the numbers 0 to 5.
// (Same program as shown in lecture 1-1).
public class Demo0 {
	public static void main(String[] args) {
		// Declares an int variable, and sets it to 1
        int i = 0;
        // Complete the program's code here:
        // loop that checks if the number is smaller than 6
        while(i < 6) {
            //prints the number and goes down a line
            System.out.println(i);

            //adds 1 to the integer
            i = i+1;
            //if the number is still smaller than 6 the loop runs again
        }
        //print the word done when you finish printing all of the numbers
        System.out.println("Done");
    }
    //1. the class name has to be saved as the files name - compilation problem
    //2. changing the content of a string doesnt matter - not an error
    //3. not putting quotations at the end of a string is a compiling error - not according to the java language
    //4. not putting quotations at all around a string "turns" it into a symbol - since the symbol Done doesnt exist in the java language its a compiling error
    //5. compilation / running error - code doesnt run
    //6. compilation error - printline is not a symbol in the java language
    //7. compilation error - println doesnt print its not the command
    //8. compilation error - syntax error
    //9. compilation error - syntax error
    //10. logical error - not what we want the code to do, runs forever printing 0
    

}
