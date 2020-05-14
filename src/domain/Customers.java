package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Customers {
	private List<Customer> customers;
	
	public Customers(Long customerId, String email, String firstname, String lastname, String gender, Date birthdate, Double credits) {
		customers = new ArrayList<>();
	}	
		

	public Customers() {
		// TODO Auto-generated constructor stub
	}


	public void add(Customer c) {
		customers.add(c);
	}
	
	public void clear() {
		customers.clear();
	}

	public void remove(Customer c) {
		customers.remove(c);
	}

	public void remove(Customer... cus) {
		for (Customer c: cus) {
			remove(c);
		}
	}

	public void add(Customer... cus) {
		for (Customer c: cus) {
			add(c);
		}
	}
	
	public void addAll( List<Customer> customerList ) {
		customers.addAll( customerList );
	}
	
	public List<Customer> getAccounts(){
		return Collections.unmodifiableList( customers );
	}
	
	@Override
	public String toString() {
		return "Customers [customers=" + customers + "]";
	}
}
