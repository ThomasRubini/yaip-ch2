package ex3.part7;

public class Player {
	private int number;
	private float x, y, z;

	public Player(int number, float x, float y){
		this.number = number;
		this.x = x;
		this.y = y;
		this.z = 0;
	}

	public void move(float xDisp, float yDisp){
		x+=xDisp;
		y+=yDisp;
	}

	public void jump(float zDisp){
		z+=zDisp;
	}

	private double distance(Ball ball){
		double xPow = Math.pow(ball.getX()-x, 2);
		double yPow = Math.pow(ball.getY()-y, 2);
		double zPow = Math.pow(ball.getZ()-z, 2);
		return Math.sqrt(xPow+yPow+zPow);
	}

	public boolean near(Ball ball){
		return distance(ball)<8;
	}

	public void kick(Ball ball){
		float distX = ball.getX()-x;
		float distY = ball.getX()-y;
		float distZ = ball.getX()-z;

		ball.setXYZ(ball.getX()+distX, ball.getY()+distY, ball.getZ()+distZ);
	}
}
