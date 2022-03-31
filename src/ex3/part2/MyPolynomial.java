package ex3.part2;

import java.util.Arrays;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs){
		this.coeffs = coeffs;
	}

	public int getDegree(){
		int deg = 0;
		for(int i=0;i<coeffs.length;i++){
			if(coeffs[i]!=0)deg = i;
		}
		return deg;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		int i = coeffs.length;
		while(i>0){
			i--;
			sb.append(coeffs[i]);
			if(i>0){
				sb.append("x");
				if(i>1){
					sb.append("^").append(i);
				}
				sb.append(" + ");
			}
		}

		return sb.toString();
	}

	public double evaluate(double x){
		double n = 0;
		for(int i=0;i<coeffs.length;i++){
			n += coeffs[i]*Math.pow(x, i);
		}
		return n;
	}

	private void resizeArray(int newLength, int defValue){
		int exLen = coeffs.length;
		coeffs = Arrays.copyOf(coeffs, newLength);
		Arrays.fill(coeffs, exLen, coeffs.length, defValue);
	}

	public MyPolynomial add(MyPolynomial right){
		if(right.coeffs.length>coeffs.length){
			resizeArray(right.coeffs.length, 0);
		}

		for(int i=0;i<right.coeffs.length;i++){
			coeffs[i] += right.coeffs[i];
		}
		return this;
	}

	public MyPolynomial multiply(MyPolynomial right){
		double[] newCoeffs = new double[getDegree()+right.getDegree()+1];
		Arrays.fill(newCoeffs, 0);

		for(int i=0;i<coeffs.length;i++){
			for(int j=0;j<right.coeffs.length;j++){
				newCoeffs[i+j] += coeffs[i]*right.coeffs[j];
			}
		}
		coeffs = newCoeffs;

		return this;
	}
}
