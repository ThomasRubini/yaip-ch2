package ex7.part1b;

public enum MemberType {
	NONE(0, 0),
	PREMIUM(0.2, 0.1),
	GOLD(0.15, 0.1),
	SILVER(0.1, 0.1),
	;

	private final double serviceDiscount, productDiscount;

	MemberType(double serviceDiscount, double productDiscount){
		this.serviceDiscount = serviceDiscount;
		this.productDiscount = productDiscount;
	}

	public double getServiceDiscountRate(){
		return serviceDiscount;
	}

	public double getProductDiscountRate(){
		return productDiscount;
	}
}
