package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[8];
		//3. use a for loop to initialize the robots.
			for (int i = 0; i < robots.length; i++) {
				robots[i] = new Robot("june");
				robots[i].setX(50 + (i * 100));
				robots[i].setY(500);
				robots[i].setSpeed(1000);
			}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
			Random random = new Random();
			boolean top = false;
			while (top == false) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].turn(10);
				robots[i].move(random.nextInt(50));
				if (robots[i].getY() <= 0) {
					top = true;
					robots[i].turn(2000);
				}
				int rand = random.nextInt(4);
				if (rand == 0) {
					robots[i].changeRobot("https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2017/05/12/104466932-PE_Color.240x240.jpg?v=1494613853");
				}
				if (rand == 1) {
					robots[i].changeRobot("http://image.oregonlive.com/home/olive-media/width600/img/trending/photo/2017/12/15/paijpg-452ba423f561a859.jpg");
				}
				if (rand == 2) {
					robots[i].changeRobot("http://www.jointheleague.org/wp-content/uploads/2014/12/dave.png");
				}
				if (rand == 3) {
					robots[i].changeRobot("http://www.jointheleague.org/wp-content/uploads/2017/04/Vic_WINTRISS.png");
				}
			}
			}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
