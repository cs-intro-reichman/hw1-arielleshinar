// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    //create an integer to hold the number
		int num = Integer.parseInt(args[0]);

		// create a if condition that check if the num has tens and hundeds
		//if not print only the ones and set a regular message for the rest
		if (num < 10){
			System.out.println("0 hundreds, 0 tens, and " + num + " ones.");
			
		} else {
			//if the num is larger than 10 you need to check if it has hundreds and tens
			//create new integers for the hundreds, tens and ones
			if (num < 100){
				// the int will be rounded down so if its 23/10=2.3 it will be 2
				int ten = num/10;
				//ten(the int) time 10 the number equals the tens so the full number
				//minus the tens is the ones
				int one = num - (ten*10);
				System.out.println("0 hundreds, " + ten + " tens, and " + one + " ones." );
			}
			 
			//if the num is larger than 99 you need to check all of its components
			if (num > 99){
				// like i said before an int will is rounded down so if it was
				// 517/100 =5.17 = 5
				int hundreds = num/100;

				//now the same as before, i want to subtract the hundreds so im taking the 
				//first digit from them and multiplying it by 100
				num = num - (hundreds * 100);
				// now we need to find the tens digit
				int ten = num / 10; 

				// lastly we need to find the ones
				// now the veriable num holds its first value minus the hundreds
				// im subtracting from it the tens first digit * 10 (meaning the tens)
				// resulting in ex' 17- (1*10) = 7
				int one =  num - (ten * 10);
				
				System.out.println(hundreds + " hundreds, " + ten + " tens, and " + one + " ones.");


			}

			

		}
	}
}
