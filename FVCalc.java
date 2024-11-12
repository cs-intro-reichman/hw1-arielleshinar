// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		//create the integers for the invested money 
		//turn from string to int
		int currentValue = Integer.parseInt(args[0]);

		//create an integer for the rate (assume non-negative)
		double rate = Double.parseDouble(args[1]);

		//create integer for the number of years its in the bank
		int n = Integer.parseInt(args[2]);

		//creat integer for future ammount (double)
		double futureValue;

		//calc the future value

		//first step- calc 1+rate and use the math.pow function
		//create an integer to put the equation for the new rate in
		// calc the rate in precentages

		double inside = rate / 100;
		inside = 1 + inside;
		double years = (double)n;
		inside = (double) Math.pow(inside, years);

		//second step- current value * (1+rate) 
		//to the power of n = futureValue
		//current value * inside = future value

		futureValue = (currentValue * inside);

		//print the value of future value as an int

		System.out.println("After " + n + " years, a $" + currentValue + 
			" saved at " + rate + "% will yield $" + ((int)(futureValue)));


		// rate is double 
		// future is double , but  printed as int
		// nothing is negative 
	}
}