package raindrop;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Drop extends Rectangle{
	private int speed = randInt(4, 10);
	private double x;
	private double y;
	
	public Drop() {
		this.x = randInt(0,500);
		this.y = randInt(-400,0);
		setX(x);
		setY(y);
		setWidth(randInt(1,2));
		setHeight(randInt(10,25));
		setFill(Color.BLUEVIOLET);
	}
	
	public void update() {
		this.y += speed;
		setY(y);
		speed += 0.1;
		
		if (y > 400) {
			this.y = randInt(-250,0);
			setY(y);
			speed = randInt(4, 10);
		}
	}
	
	
	public static int randInt(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
}
