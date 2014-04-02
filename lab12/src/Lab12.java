import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/*
* CSC 171
*
* Version 1.0
*
* Copyright notice
*
* Course : CSC171 Fall 2013 
*
* Assignment : LAB 12
*
* Author : Tyler James Evers
*
* Lab Session : Monday/Wednesday 12:30-1:45
*
* Lab TA : 
*
* Last Revised : October 27th, 2013
*
*/

public class Lab12
{
	public static void main(String[]args)
	{
		JFrame frame = new JFrame("Lab12");
		Lab12Panel panel = new Lab12Panel();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.add(panel);
		
		
		JButton exit = new JButton("exit");
		exit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
	}
}	
	