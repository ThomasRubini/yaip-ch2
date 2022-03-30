package ex3.part1;

public class MyComplex {
	private double real, imag;

	public MyComplex(){
		this(0, 0);
	}

	public MyComplex(double real, double imag){
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		return "%s+%si".formatted(real, imag);
	}

	public boolean isReal(){
		return imag==0;
	}

	public boolean isImaginary(){
		return real==0;
	}

	public boolean equals(double real, double imag){
		return this.real==real&&this.imag==imag;
	}

	public boolean equals(MyComplex another){
		return equals(another.real, another.imag);
	}

	public double magnitude(){
		return Math.sqrt(real*real+imag*imag);
	}

	public double argument(){
		return Math.atan2(imag, real);
	}

	public MyComplex add(MyComplex right){
		real+=right.real;
		imag+=right.imag;
		return this;
	}

	public MyComplex addNew(MyComplex right){
		return new MyComplex(real+right.real, imag+right.imag);
	}

	public MyComplex subtract(MyComplex right){
		real-=right.real;
		imag-=right.imag;
		return this;
	}

	public MyComplex subtractNew(MyComplex right){
		return new MyComplex(real-right.real, imag-right.imag);
	}

	public MyComplex multiply(MyComplex right){
		double newReal = real*right.real - imag*right.imag;
		double newImag = real*right.imag + imag*right.real;

		real = newReal;
		imag = newImag;

		return this;
	}

	public MyComplex divide(MyComplex right){
		double newReal = real*right.real + imag*right.imag;
		double newImag = imag*right.real - real*right.imag;
		double denom = right.real*right.real + right.imag*right.imag;

		real = newReal/denom;
		imag = newImag/denom;

		return this;
	}

	public MyComplex conjugate(){
		imag = -imag;
		return this;
	}
}
