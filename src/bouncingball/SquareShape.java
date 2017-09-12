package bouncingball;


import java.awt.Color;
import java.awt.Graphics;

public class SquareShape extends Shape {
	public SquareShape(int x, int y, int width, Color color){
		super.x=x;
		super.y=y;
		super.width=width;
		super.height=width;
		super.color=color;
	}
	boolean horizontalposi = true;
    boolean verticalposi = true;
	int horivelocity = 1;
	int vertivelocity = 1;
	public void draw(Graphics g){
			if (x <=20){
				horizontalposi = true;
			}
			if (x + width >=1340){
				horizontalposi = false;
			}
			if (y <=40){
				verticalposi = true;
			}
			if (y + width >=700){	
				verticalposi = false;
			}
			if (horizontalposi == true){
				x = x +horivelocity;
			} else {
				x = x -horivelocity;
			}
			if (verticalposi == true){
				y = y +vertivelocity;
			} else {
				y = y -vertivelocity;
			}
		g.setColor(color);
		g.fillRect(x,y,width,height);
	}
}