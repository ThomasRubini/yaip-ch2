package ex7.part1b.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerFactory {
	public static CustomerFactory inst = new CustomerFactory();
	public static CustomerFactory getInstance(){
		return inst;
	}

	// I was thinking about a HashMap implementation, idk what would be faster in practice
	private List<Customer> customers = new ArrayList<>();

	private Customer getNewCustomer(String name){
		Customer c = new Customer(name);
		customers.add(c);
		return c;
	}

	private Customer getExistingCustomer(String name){
		for(Customer c : customers){
			if(c.getName().equals(name))return c;
		}
		return null;
	}


	public Customer getCustomer(String name){
		Customer c = getExistingCustomer(name);
		if(c==null)c = getNewCustomer(name);
		return c;
	}
}
