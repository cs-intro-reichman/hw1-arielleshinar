// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
       

		//0 1 2 3 4 5 6 7 8 9 +  13 14 15 16 17 18 19 20 21
		if ((hours < 10) || ((hours > 12) && (hours < 22) )){

			System.out.print("0");
			
			// if the hour is bigger than 12 subtract 12 to get new hour type and print it
			if (hours > 12){
				int newHours = hours - 12;
				System.out.print(newHours + ":");
			}
			// if its smaller than 12 (0-9) print as is
			else{
				System.out.print(hours + ":");
				}
		}
		// 10 11 12 + 22 23
		else {
			// if the hour is bigger than 12 subtract 12 to get new hour type and print it
			if (hours > 12){
				int newHours = hours - 12;
				System.out.print(newHours + ":");
			}
			// if hour is 10 11 or 12 print it as is
			else{
			System.out.print(hours + ":");
			}
		}

	//if the minutes are 1 digit add zero and print	
	if (minutes < 10){
			System.out.print("0" + minutes);
		}
		// if the minutes are 2 digits print them as is
		else {
			System.out.print(minutes);

		}

		// 0 1 2 3 4 5 6 7 8 9 10 11 am
		// 12 13 14 15 16 17 18 19 20 21 22 23 pm
		if (hours < 12){
			System.out.println(" AM");
		}
		else{
			System.out.println(" PM");
		}
	}

}