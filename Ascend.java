// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		//you need to get 3 random numbers and put them into integers
		// create your integers
		double a;
		double b;
		double c;

		// generate your random numbers using the Math.random() function
		//create the commad line function to get the limit
		int lim = Integer.parseInt(args[0]);

		//we need a and b and c to be doubles so im changing lim to a double
		double limit = (double)lim;
		
		a = Math.random();
		b = Math.random();
		c = Math.random();

		// the function generates numbers between 0-1 yet we dont know our limit
		//only that its larger than zero
		//since our program needs to print ints (round numbers) in the end we need 
		//to multiply the randomly generated numbers by the limit
		a = (int)(a * lim);
		b = (int)(b * lim);
		c = (int)(c * lim);

		//now we need to find the smallest number and put them in ascending order using the min function
		//create new veriables to check which number is the smallest
		double smallest;
		double largest;

		//to find the smallest number im creating a new veriable that will hold the smaller between
		//the first two numbers, then ill run the function again with my new veriable and the third number.
		//the result must be the smallest number 
		smallest = Math.min(a, b);
		smallest = Math.min(smallest, c);

		//to find the largest number im creating a new veriable that will hold the larger between
		//the first two numbers, then ill run the function again with my new veriable and the third number.
		//the result must be the largest number 
		
		largest = Math.max(a, b);
		largest = Math.max(largest, c);
		
		//now i need to find the middle number without using the if function
		//um creating a new integer and to find the middle number im ading the values 
		//of a, b & c and subtracting the values of min and max that i found

		double middle = (a + b + c) - (smallest + largest);		

		// print the result of the number like you got them and then by ascending order
		System.out.print((int)a + " ");
		System.out.print((int)b + " ");
		System.out.println((int)c);
		System.out.print((int)smallest + " ");
		System.out.print((int)middle + " ");
		System.out.println((int)largest );



		}
		
	}

