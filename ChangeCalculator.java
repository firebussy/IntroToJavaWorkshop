package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
    String nickels=	JOptionPane.showInputDialog("How many nickles do you have");
        // Convert their answer to an int using Integer.parseInt()
int nick  =Integer.parseInt(nickels);
        // Ask the user how many dimes they have, and convert their answer
JOptionPane.showInputDialog("How many dimes do you have");
        // Ask the user how many quarters they have, and convert their answer
JOptionPane.showInputDialog("How many quarters do you have");
        // Calculate how much money the user has and save it in a double variable 
int totalNickles=nick*5;
int totalDimes=dime*10;
        // Tell the user how much money they have

    }
}