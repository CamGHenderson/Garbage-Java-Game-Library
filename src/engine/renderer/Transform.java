package engine.renderer;

public class Transform 
{
	private Vector2f origin;
	private Vector2f position;
	private Vector2f scale;
	private float rotation;
	
	public Transform()
	{
		origin = new Vector2f();
		position = new Vector2f();
		scale = new Vector2f(1.0f, 1.0f);
		rotation = 0.0f;
	}

	public Vector2f getOrigin() 
	{
		return origin;
	}

	public void setOrigin(Vector2f origin) 
	{
		this.origin = origin;
	}

	public Vector2f getPosition() 
	{
		return position;
	}

	public void setPosition(Vector2f position)
	{
		this.position = position;
	}

	public Vector2f getScale()
	{
		return scale;
	}

	public void setScale(Vector2f scale) 
	{
		this.scale = scale;
	}

	public float getRotation() 
	{
		return rotation;
	}

	public void setRotation(float rotation)
	{
		this.rotation = rotation;
	}
	
}
