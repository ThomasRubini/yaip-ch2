package ex7.part1b;

import ex7.part1b.customer.Customer;

import java.util.Date;

// Identity based
public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer customer, Date date){
		this.customer = customer;
		this.date = date;
	}

	public Customer getCustomer(){
		return customer;
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

	public double getServiceBill(){
		return serviceExpense*(1-customer.getMemberType().getServiceDiscountRate());
	}

	public double getProductBill(){
		return productExpense*(1-customer.getMemberType().getProductDiscountRate());
	}

	public double getTotalBill(){
		return getServiceBill()+getProductBill();
	}

	@Override
	public String toString() {
		return "Visit[customer=%s,date=%s,serviceExpense=%s,productExpense=%s]".formatted(customer, date, serviceExpense, productExpense);
	}
}
