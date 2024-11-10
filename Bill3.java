// Splits a restaurant bill evenly among three diners.

public class Bill3 {
	public static void main(String[] args) {
		// create strings for the names
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

		//create an integer of the sum total of the bill 
		//turn the string into an int
		int bill = Integer.parseInt(args[3]);
		
		//create a double to enter bill into and divide it by 3
		double mybill = (double)(bill / 3);
		mybill = (double) Math.ceil(mybill);
		
		
		
		//prints the diners total 
		System.out.println("dear " + name3 + ", " + name2 + 
			" and " + name1 + ": pay " + mybill + " Shekels each.");

	      
	}
}
