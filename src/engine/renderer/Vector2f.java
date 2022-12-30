package engine.renderer;

public class Vector2f 
{
	private float x;
	private float y;	
	
	public Vector2f()
	{
		x = 0;
		y = 0;
	}
	
	public Vector2f(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	public float getX() 
	{
		return x;
	}

	public void setX(float x) 
	{
		this.x = x;
	}

	public float getY() 
	{
		return y;
	}

	public void setY(float y)
	{
		this.y = y;
	}
	
	public void add(Vector2f vector)
	{
		x += vector.getX();
		y += vector.getY();
	}

	public void multiply(Vector2f vector) 
	{
		x *= vector.getX();
		y *= vector.getY();
	}
}
