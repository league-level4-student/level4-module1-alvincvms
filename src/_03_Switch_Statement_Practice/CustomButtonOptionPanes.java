package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("it's sunday!");
			break;
		case "Monday":
			System.out.println("SCHOOL");
			break;
		case "Tuesday":
			System.out.println("STILL SCHOOL");
			break;
		case "Wednesday":
			System.out.println("MORE SCHOOL");
			break;
		case "Thursday":
			System.out.println("almost there");
			break;
		case "Friday":
			System.out.println("finally, an end");
			break;
		case "Saturday":
			System.out.println("it's saturday!");
			break;
		}
	}
}
