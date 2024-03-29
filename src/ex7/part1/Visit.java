package ex7.part1;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(String name, Date date){
		this.customer = new Customer(name);
		this.date = date;
	}

	public String getName(){
		return customer.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	public double getTotalExpense(){
		return productExpense+serviceExpense;
	}

	@Override
	public String toString() {
		return "Visit[customer=%s,date=%s,serviceExpense=%s,productExpense=%s]".formatted(customer, date, serviceExpense, productExpense);
	}

}
