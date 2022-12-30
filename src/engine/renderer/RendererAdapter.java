package engine.renderer;

import engine.Color;

public abstract class RendererAdapter 
{	
	protected Transform transform;
	protected Color color;
	protected Window window;
	
	public RendererAdapter()
	{
		transform = new Transform();
		color = new Color();
		window = new Window();
	}
	
	public void setTransform(Transform transform)
	{
		this.transform = transform;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}

	public Window getWindow() {
		return window;
	}
	
	public abstract void clear();
	public abstract void drawRectangle(float width, float height);
	public abstract void update();
}
