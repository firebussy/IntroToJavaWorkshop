package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it..." );
		// Get the user to enter an adjective
String userName =JOptionPane.showInputDialog("Write an adjective");
		// Get the user to enter a type of liquid
String name =JOptionPane.showInputDialog("Type a type of liquid");
		// Get the user to enter a body part
String user =JOptionPane.showInputDialog("Write a body part");
		// Get the user to enter a verb
String userName2 =JOptionPane.showInputDialog("Write a verb");
		// Get the user to enter a place
String userName3 =JOptionPane.showInputDialog("Write a place you know");
		// Fit the user's words into this sentence, and save it in a String:
		String story =" Piranhas are more "+userName+" during the day, so cross the river at\n"+
		"night. Piranhas are attracted to fresh "+name+" and will most\n"+
		" likely take a bite out of your "+user+" if you "+userName2+". Whatever\n"+
		" you do, if you have an open wound, try to find another way to get\n"+
		" back to the "+userName3+". Good luck!";
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showConfirmDialog(null, story);

	}
}

;