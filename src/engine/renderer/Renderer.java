package engine.renderer;

import engine.Color;
import engine.renderer.jframe.JFrameRenderer;
import engine.renderer.opengl.OpenGLRenderer;

public class Renderer 
{
	public static int JFRAME_RENDERER = 0;
	public static int OPENGL_RENDERER = 0;
	
	private RendererAdapter renderer;
	
	public Renderer(int type)
	{
		if(type == JFRAME_RENDERER)
			renderer = new JFrameRenderer();
		else if(type == OPENGL_RENDERER)
			renderer = new OpenGLRenderer();
		else
			System.out.println("Error: Not Valid Renderer");
	}
	
	public void setTransform(Transform transform)
	{
		renderer.setTransform(transform);
	}
	
	public void setColor(Color color)
	{
		renderer.setColor(color);
	}
	
	public void drawRectangle(float width, float height)
	{
		renderer.drawRectangle(width, height);
	}
	
	public void clear() {
		renderer.clear();
	}
	
	public void update()
	{
		renderer.update();
	}

	public Window getWindow() 
	{
		return renderer.getWindow();
	}
}
