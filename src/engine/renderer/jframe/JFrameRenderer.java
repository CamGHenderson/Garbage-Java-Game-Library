package engine.renderer.jframe;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import engine.renderer.RendererAdapter;
import engine.renderer.Transform;
import engine.renderer.Vector2f;

public class JFrameRenderer extends RendererAdapter
{
	private JFrame jframe;
	private Canvas canvas;
	private Graphics2D graphics;
	private BufferStrategy bufferStrategy;
	
	public JFrameRenderer()
	{
		jframe = new JFrame("JFrame Renderer");
		jframe.setSize(800, 600);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		jframe.add(canvas = new Canvas());
		canvas.createBufferStrategy(3);
		
		window.setWidth(800);
		window.setHeight(600);
		window.setOpen(true);
	}
	
	private AffineTransform transformToAffineTransform(Transform transform)
	{
		AffineTransform affineTransform = new AffineTransform();
		Vector2f scale = transform.getScale();
		affineTransform.translate(transform.getOrigin().getX() * scale.getX(), transform.getOrigin().getY() * scale.getY());
		affineTransform.rotate((transform.getRotation() / 180) * Math.PI, transform.getPosition().getX(), transform.getPosition().getY());
		affineTransform.translate(transform.getPosition().getX(), transform.getPosition().getY());
		affineTransform.scale(scale.getX(), scale.getY());
		return affineTransform;
	}
	
	@Override
	public void drawRectangle(float width, float height) 
	{
		graphics.setTransform(transformToAffineTransform(transform));
		graphics.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
		graphics.fillRect((int)(-width / 2.0f), (int)(-height / 2.0f), (int)width, (int)height);
	}

	@Override
	public void clear() 
	{	
		bufferStrategy = canvas.getBufferStrategy();
		graphics = (Graphics2D)bufferStrategy.getDrawGraphics();
		canvas.paint(graphics);
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, window.getWidth(), window.getHeight());
	}
	
	@Override
	public void update() 
	{
		graphics.dispose();
		bufferStrategy.show();
	}
}
