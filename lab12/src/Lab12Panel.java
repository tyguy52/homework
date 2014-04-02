import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Lab12Panel extends JPanel implements KeyListener
{
	Color fillColor = color[0];
	final static Color INDIGO = new Color(75,0,130);
	final static Color VIOLET = new Color(138,43,226);
	int rectX = 250;
	int rectY = 250;
	
	public Lab12Panel()
	{
		setVisible(true);
		addKeyListener(this);
		setFocusable(true);
		setPreferredSize(new Dimension(500,500));
	}

	static Color[] color = new Color[]
		{
		Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, INDIGO, VIOLET	
		};
	
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(fillColor);
		g.fillRect(rectX, rectY, 100, 100);
	}
	

		
		public void keyPressed(KeyEvent e)
		{
		
		}
		
		public void keyReleased(KeyEvent e)
		{
			int c = e.getKeyCode();
			if(c == KeyEvent.VK_ENTER)
			{
					fillColor= color[1];
					repaint();
				}		
			}		
		
		public void keyTyped(KeyEvent e)
		{
			int c = e.getKeyCode();
			if(c == KeyEvent.VK_LEFT)
			{
				rectX -= 5;
				repaint();
			}
			
			if(c == KeyEvent.VK_RIGHT)
			{
				rectX += 5;
				repaint();
			}
			
			if(c == KeyEvent.VK_UP)
			{
				rectY -= 5;
				repaint();
			}
			
			if(c == KeyEvent.VK_DOWN)
			{
				rectY += 5;
				repaint();
			}
		}
	}
	


