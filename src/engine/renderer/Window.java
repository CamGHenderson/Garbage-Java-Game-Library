package engine.renderer;

public class Window 
{
	private int width;
	private int height;
	private boolean open;
	
	public Window()
	{
		width = 0;
		height = 0;
		open = false;
	}

	public int getWidth() 
	{
		return width;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}

	public boolean isOpen() 
	{
		return open;
	}

	public void setOpen(boolean open) 
	{
		this.open = open;
	}
}
