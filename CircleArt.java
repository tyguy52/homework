import java.awt.*;
import java.util.*;
public class CircleArt 
{
	public static void main(String[]args)
	{
		
		DrawingPanel panel = new DrawingPanel(400,400);
		Graphics g = panel.getGraphics();
	    Random rand = new Random();
	    Circle bigCircle = new Circle(200,200,150);
		//Circle [] goodCircle = new Circle [10000];
		ArrayList<Circle> circle = new ArrayList<Circle>();
	    panel.setBackground(Color.black);
	    g.drawRect(0, 0, 399, 399);
	   
	    for(int i=0; i<1000000;i++)
	    {
	    	Circle c = new Circle(rand.nextInt(400),rand.nextInt(400),rand.nextInt(20)+1);
	    	
	    	if(!c.isIntersecting(bigCircle))
	    	{
	    		if(circle.isEmpty())
	    		{
	    			circle.add(c);
	    		}
	    		
	    		for(int j=0; j<circle.size();j++)
	    		{
	    			if(!c.isOutside(circle.get(j))||circle.contains(c))
	    				break;
	    			if(c.isOutside(circle.get(j))&&j==circle.size()-1)
	    			{
	    				circle.add(c);
	    			}
	    		}
	    		
	    	}
	    }
	    
	
	    
	    
	    
	    for(Circle s: circle)
	    { 
	    	if (s.isInside(bigCircle)==true)
	    	{
	    		g.setColor(new Color(rand.nextInt(256),255, rand.nextInt(256)));
	    		s.draw(g);
	    	}
	    	if(s.isOutside(bigCircle)==true)
	    	{
	    		g.setColor(new Color(rand.nextInt(256), rand.nextInt(256),255));
	    		s.fill(g);
	    	}
	    }
	}
    
	public static boolean checkArray(ArrayList<Circle> circle, Circle c)
	{
		for(Circle s: circle)
		{
			if(c.isIntersecting(s))
				return false;
			if(!c.isIntersecting(s))
			{
				if(circle.indexOf(s)==circle.size()-1)
				{
					return true;
				}
			}
		}
		
		return false;
	}
}
