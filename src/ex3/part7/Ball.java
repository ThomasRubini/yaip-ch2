package ex3.part7;

import java.util.List;

public class Ball {
	private float x, y, z;

	public Ball(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getZ() {
		return z;
	}

	public void setXYZ(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "(%s,%s,%s)".formatted(x, y, z);
	}
}
