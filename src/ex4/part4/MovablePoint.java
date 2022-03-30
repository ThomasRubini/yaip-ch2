package ex4.part4;

public class MovablePoint extends Point {

	private float xSpeed, ySpeed;

	public MovablePoint(){
		this(0, 0);
	}

	public MovablePoint(float xSpeed, float ySpeed){
		super();
		setSpeed(xSpeed, ySpeed);
	}

	public MovablePoint(float x, float y, float xSpeed, float ySpeed){
		super(x, y);
		setSpeed(xSpeed, ySpeed);
	}

	public float getXSpeed() {
		return xSpeed;
	}

	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getYSpeed() {
		return ySpeed;
	}

	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}

	public void setSpeed(float xSpeed, float ySpeed){
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public float[] getSpeed(){
		return new float[]{xSpeed, ySpeed};
	}

	@Override
	public String toString() {
		return "(%s,%s),speed=(%s,%s)";
	}

	public MovablePoint move(){
		setX(getX()+xSpeed);
		setY(getY()+xSpeed);
		return this;
	}
}
