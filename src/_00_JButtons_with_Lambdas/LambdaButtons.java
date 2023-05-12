package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		Random rand = new Random();
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
		addNumbers.addActionListener((b)-> {
		
			int s = rand.nextInt(101);
			int s2 = rand.nextInt(101);
			JOptionPane.showMessageDialog(null,s + " plus " + s2 + " equals " + s+s2);
			
		});
		randNumber.addActionListener((b) ->	{
			JOptionPane.showMessageDialog(null, "Your random number is " + rand.nextInt(101));
		});
		tellAJoke.addActionListener((b) -> {
			JOptionPane.showMessageDialog(null, "Why did the bycicle fall down? \nBecause it was too tired");
		});
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	
	
}
