package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
String davePower="water controler";
String kiannaPower="Super Intelligence";
String AngelPower="Fire balls";
String DavidPower="All of the powers";
String peterPower="Super xray";
        // 2. Ask the user to enter a name. Store their answer in a variable.
JOptionPane.showMessageDialog(null ,"Enter a name");
String ans =JOptionPane.showInputDialog("Write name here");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
if(ans.equals("dave")){
JOptionPane.showMessageDialog(null ,"That person's power is "+davePower);
}

if(ans.equals("kianna")){
JOptionPane.showMessageDialog(null ,"That person's power is "+kiannaPower);

}
if(ans.equals("Angel")){
JOptionPane.showMessageDialog(null ,"That person's power is "+AngelPower);
}
if(ans.equals("David")){
JOptionPane.showMessageDialog(null ,"That person's power is "+DavidPower);
}
if(ans.equals("peter")){
	JOptionPane.showMessageDialog(null ,"That person's power is "+peterPower);
	}




    }
}
