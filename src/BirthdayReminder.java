import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer=JOptionPane.showInputDialog("whitch birthday do you want to know? moms or dad?");
		// 3. Print out what the user typed
		if (answer.equals("mom")) {
			JOptionPane.showMessageDialog(null, "The answer is 01/14");
		}
		if (answer.equals("dad")) {
			JOptionPane.showMessageDialog(null, "the answer is 06/09");
		}
		if (answer.equals("your birthday")) {
			JOptionPane.showMessageDialog(null, "The answer is 09/05");
		} else {
			JOptionPane.showMessageDialog(, message);
		}
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
