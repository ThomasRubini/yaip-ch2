package ex4.part3;

public class Point3D extends Point2D {

	private float z;

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public void setXYZ(float x, float y, float z){
		this.setXY(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "(%s,%s,%s)".formatted(getX(), getY(), z);
	}
}
