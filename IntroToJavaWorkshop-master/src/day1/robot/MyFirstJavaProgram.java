package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot fire = new Robot();
fire.penDown();
fire.setRandomPenColor();
//fire.move(200);	
//fire.turn(90);		
//fire.move(200);
//fire.turn(90);
//fire.move(200);
//fire.turn(90);
//fire.move(200);
int sides =2;
for (int i= 0;i < 4;i++){
fire.move(200);
fire.turn(360/sides);
}
	}
}
