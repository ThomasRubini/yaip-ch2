package ex7.part1b;

import java.lang.reflect.Field;

public class DiscountRate {
	private static final double serviceDiscountPremium = 0.2;
	private static final double serviceDiscountGold = 0.15;
	private static final double serviceDiscountSilver = 0.1;

	private static final double productDiscountPremium = 0.1;
	private static final double productDiscountGold = 0.1;
	private static final double productDiscountSilver = 0.1;

	private static double getDiscount(String prefix, String type){
		String formattedType = Character.toUpperCase(type.charAt(0))+type.substring(1).toLowerCase();

		try{
			Field f = DiscountRate.class.getField(prefix+"Discount"+formattedType);
			return (double) f.get(null);
		}catch(ReflectiveOperationException e){
			throw new RuntimeException(e);
		}
	}

	public static double getServiceDiscountRate(String type){
		return getDiscount("Service", type);
	}

	public static double getProductDiscountRate(String type){
		return getDiscount("Product", type);
	}
}
