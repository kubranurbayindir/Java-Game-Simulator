package Abstract;

import Entities.Customer;

public abstract class BaseManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Save to database : " + customer.getFirstName());  
	}
}
