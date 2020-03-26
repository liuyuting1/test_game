
import  java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double  x=100;
	double  y=100;
	boolean right=true;
	double degree=3.14/3;

	//画窗口的方法
	public void paint(Graphics  g){
		System.out.println("开始画图");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);

		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		if(y>430||y<80) degree=-degree;
		if(x>800||x<80) degree=3.14-degree;


	}

	//窗口加载
	void launchFrame(){
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);

		while (true){
			repaint();
			try{
				Thread.sleep(40);
			}catch (Exception e){
				e.printStackTrace();
			}
		}

	}
	
	public static void main(String[] args){
		System.out.println(" hello my ball");
		BallGame game = new BallGame();
		game.launchFrame();
	}
	
}
