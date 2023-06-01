import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animation extends JPanel implements Runnable{
	private int x,y;
	private Thread myThread;
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.fillOval(x, y, 100, 100);
	}
	public Animation() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		setSize(800, 500);
		setVisible(true);
		x=100;
		y=150;
		myThread= new Thread(this);
		myThread.start();
		
	}
	
	public void move() {
		// complete this example...
		if(x<700) {
			x=x+10; // move to right
		}
		else {
			x=x-10; // move to left
		}
		
		
		repaint();
	}
	
	public static void main(String[] args) {
		JFrame win = new JFrame("My Game");
		Animation animation= new Animation();
		win.add(animation);
		win.setSize(animation.getSize());
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.currentThread().sleep(100);
				move();// move the circle
			}
			catch ( InterruptedException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}// end of the while loop
		
	}// end of the method

}














