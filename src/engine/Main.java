package engine;

import engine.renderer.Renderer;
import engine.renderer.Transform;
import engine.renderer.Vector2f;
import engine.renderer.Window;

public class Main 
{	
	public static void main(String[] args)
	{
		Renderer renderer = new Renderer(Renderer.JFRAME_RENDERER);
		Window window = renderer.getWindow();
		
		
		Transform rectangleTransform1 = new Transform();
		rectangleTransform1.setPosition(new Vector2f(200, 200));
		rectangleTransform1.setRotation(0);
		
		Transform rectangleTransform2 = new Transform();
		rectangleTransform2.setPosition(new Vector2f(200, 200));
		rectangleTransform2.setScale(new Vector2f(2, 2));
		rectangleTransform2.setRotation(45);
		
		while(window.isOpen())
		{
			renderer.clear();
			
			renderer.setTransform(rectangleTransform2);
			renderer.setColor(Color.BLUE);
			renderer.drawRectangle(100, 100);
			
			renderer.setTransform(rectangleTransform1);
			renderer.setColor(Color.WHITE);
			renderer.drawRectangle(100, 100);
			
			renderer.update();
		}
		
	}
}
