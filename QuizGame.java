package day3;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Is the chess championships real");
		if (answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}

		String answer2 = JOptionPane.showInputDialog("Is the movie Harry Porter inspirational");

		if (answer2.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		String answer3 = JOptionPane.showInputDialog("Is Big foot real");

		if (answer3.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Incorrect");
		} else {
			JOptionPane.showMessageDialog(null, "Correct");

		}
		String answer4 = JOptionPane.showInputDialog("which county started mummification");

		if (answer4.equalsIgnoreCase("egypt")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		String answer5 = JOptionPane.showInputDialog("Where is the great pyramid of Giza");

		if (answer5.equalsIgnoreCase("Egypt")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}

	}
}
