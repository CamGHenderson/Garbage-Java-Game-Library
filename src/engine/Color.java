package engine;

public class Color 
{	
	private int red;
	private int green;
	private int blue;
	private int alpha;
	
	public static Color WHITE = new Color(255, 255, 255);
	public static Color BLACK = new Color(0, 0, 0);
	public static Color RED = new Color(255, 0, 0);
	public static Color GREEN = new Color(0, 255, 0);
	public static Color BLUE = new Color(0, 0, 255);
	
	public Color() 
	{
		this.red = 0;
		this.green = 0;
		this.blue = 0;
		this.alpha = 255;
	}
	
	public Color(int red, int green, int blue) 
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.alpha = 255;
	}

	public int getRed() 
	{
		return red;
	}

	public void setRed(int red) 
	{
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green)
	{
		this.green = green;
	}

	public int getBlue() 
	{
		return blue;
	}

	public void setBlue(int blue)
	{
		this.blue = blue;
	}

	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int alpha)
	{
		this.alpha = alpha;
	}
}
