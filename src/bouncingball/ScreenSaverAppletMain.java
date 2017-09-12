package bouncingball;


import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class ScreenSaverAppletMain extends JFrame  {
	//	colors[0]=Color.black;
	Shape rect1 = new SquareShape(50, 50, 50, Color.red);
	Shape rect2 = new SquareShape(1000, 500, 50, Color.green);
	Shape rect3 = new SquareShape(50, 600, 50, Color.yellow);
	Shape rect4 = new SquareShape(200, 400, 50, Color.pink);
	Shape rect5 = new SquareShape(800, 90, 50, Color.orange);
	Shape rect6 = new SquareShape(600, 300, 50, Color.magenta);
	Shape rect7 = new SquareShape(400, 500, 50, Color.cyan);
	Shape rect8 = new SquareShape(1200, 100, 50, Color.blue);
    public static void main(String[] args) {
    	ScreenSaverAppletMain app = new ScreenSaverAppletMain();
        app.setVisible(true);
    }
	public ScreenSaverAppletMain(){
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1360, 720);
		refresh thread= new refresh();	
		thread.myapplet = this;
		thread.start();
	}
	public void paint(Graphics g){
		rect1.draw(g);
		rect2.draw(g);
		rect3.draw(g);
		rect4.draw(g);
		rect5.draw(g);
		rect6.draw(g);
		rect7.draw(g);
		rect8.draw(g);
	}
	public void animation(Graphics g){
		try{
		} catch (NullPointerException e){
		}
	}
	public class refresh extends Thread{
		public ScreenSaverAppletMain myapplet;
		public void run(){
			while(true){
			myapplet.repaint();
			animation(myapplet.getGraphics());
				try {
					sleep(1);
					} catch (InterruptedException e){
						e.printStackTrace();
				}
			}
		}
	}
}