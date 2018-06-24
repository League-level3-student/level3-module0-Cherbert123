package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] array;
	//2 create an integer variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		int length = Integer.parseInt(JOptionPane.showInputDialog("Enter a Int:"));
		//4. Initialize the array of JButtons to be the size of the int created in step *********
		array = new JButton[length];
		//5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < array.length; i++) {
			array[i] = new JButton();
			array[i].addActionListener(this);
			panel.add(array[i]);
		}
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		window.add(panel);
		//9 add the panel to the window
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setVisible(true);
		//11. set the JFrame to visible.
		JOptionPane.showMessageDialog(null,"Find the Hidden Button, It Will Appear for a Moment Upon Clicking Ok");
		//12. Give the user the instructions for the game.
		Random random = new Random();
		hiddenButton = random.nextInt(length);
		//13. initialize the hiddenButton variable to a random number less than the int created int step ******
		array[hiddenButton].setText("Me");
		//14. Set the text of the JButton located at hiddenButton the read "ME"
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//15. Use Thread.sleep(100); to pause the program.
		array[hiddenButton].setText("");
		//16. Set the text of the JButton located at hiddenButton the be blank.
		while (true) {
			JButton button = array[random.nextInt(length)];
			if (button != array[hiddenButton]) {
			button.setText("Not Me");
			} else {
			button.setText("Me");
			}
			if (random.nextInt(8) == 2) {
				array[hiddenButton].setText("Me");
				
			
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			button.setText("");
			array[hiddenButton].setText("");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(buttonClicked == array[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "You Win!");
		} else {
			JOptionPane.showMessageDialog(null, "Try Again");
		}
		//18. else tell them to try again
	}
}
