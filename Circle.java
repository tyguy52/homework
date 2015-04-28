import java.awt.*;

public class Circle 
{
	Graphics g;
	public int x,y;
	public int radius;
	
	Circle(int x, int y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public boolean isInside(Circle c2)
	{
		double distance = Math.sqrt(Math.pow((x-c2.x), 2)+Math.pow((y-c2.y), 2));
		
		if(distance <=Math.abs(radius-c2.radius))
			return true;
		else
		return false;
	}
	
	public boolean isOutside(Circle c2)
	{
		double distance = Math.sqrt(Math.pow((x-c2.x), 2)+Math.pow((y-c2.y), 2));
		
		if(distance >= (radius+c2.radius))
			return true;
		else
			return false;
	}
	
	public boolean isIntersecting(Circle c2)
	{
		double distance = Math.sqrt(Math.pow((x-c2.x), 2)+Math.pow((y-c2.y), 2));
		
		if(distance <=Math.abs(radius-c2.radius))
			return false;
		else if(distance < (radius+c2.radius))
			return true;
		else
			return false;
	}
	
	public void fill(Graphics g)
	{
		int diameter = radius*2;
		g.fillOval(x-radius, y-radius, diameter, diameter);
	}
	
	public void draw(Graphics g)
	{
		int diameter = radius*2;
		g.drawOval(x-radius, y-radius, diameter, diameter);
	}
}
