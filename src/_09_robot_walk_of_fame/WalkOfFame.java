
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
rob.setX(250);
rob.setY(75);
rob.setRandomPenColor();
rob.penDown();
rob.setSpeed(99999);
rob.setWindowColor(Color.white);
// 2. Make the robot draw a star shape. Hint: 144.


for (int i = 0; i < 5; i++) {
	rob.turn(144);rob.move(200);
	rob.setRandomPenColor();
	rob.turn(144);rob.move(200);
	rob.setRandomPenColor();
	rob.turn(144);rob.move(200);
	rob.setRandomPenColor();
	rob.turn(144);rob.move(200);
	rob.setRandomPenColor();
	rob.turn(144);rob.move(200);
	rob.turn(144);rob.move(200);
	rob.setRandomPenColor();
	rob.turn(144);rob.move(200);
	rob.setRandomPenColor();
	rob.turn(144);rob.move(400);
}
for (int i = 0; i < 5; i++) {
rob.setPenColor(Color.white);
rob.setPenWidth(999);
rob.turn(144);rob.move(200);
rob.turn(144);rob.move(200);
rob.turn(144);rob.move(200);
rob.turn(144);rob.move(200);
rob.turn(144);rob.move(200);
rob.turn(144);rob.move(200);
rob.turn(144);rob.move(200);
rob.turn(144);rob.move(400);
}
// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
